package com.enosh.articles.services;

import com.enosh.articles.model.Article;
import com.enosh.articles.model.ArticleDto;
import com.enosh.articles.model.Paragraph;
import com.enosh.articles.repository.ArticleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Transactional
@AllArgsConstructor
@Service
public class ArticleService implements EntityService<Article, Long> {

    private final ArticleRepository articleRepository;
    private final AuthorService authorService;
    private final ParagraphService paragraphService;


    public Article add(ArticleDto articleDto) throws Exception {
        return authorService.findById(articleDto.getAuthorId())
                .map(author -> {
                            try {
                                return add(
                                        new Article(
                                                articleDto.getHeader(),
                                                author,
                                                articleDto.getParagraphs()
                                        )
                                );
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            return null;
                        }
                ).orElseThrow(() -> new Exception(
                        "No author by the id " + articleDto.getAuthorId())
                );
    }


    @Override
    public Article add(Article article) throws Exception {
        return Optional.ofNullable(article)
                .filter(candidate -> candidate.getParagraphs() != null)
                .map(candidate -> {
                    candidate.setParagraphs(
                            candidate.getParagraphs()
                                    .stream()
                                    .map(paragraphService::add)
                                    .collect(Collectors.toList())
                    );
                    return candidate;
                }).map(articleRepository::save)
                .orElseThrow(() -> new Exception("Null pointer exception :("));
    }

    @Override
    public Optional<Article> findById(Long id) {
        return articleRepository.findById(id);
    }

    @Override
    public List<Article> findAll() {
        return articleRepository.findAll();
    }
}
