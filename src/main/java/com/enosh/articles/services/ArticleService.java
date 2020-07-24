package com.enosh.articles.services;

import com.enosh.articles.model.Article;
import com.enosh.articles.repository.ArticleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class ArticleService implements EntityService<Article, Long> {

    private final ArticleRepository articleRepository;
    private final ParagraphService paragraphService;

    @Override
    public Article add(Article article) throws Exception {
        return Optional
                .ofNullable(article)
                .map(candidate -> {
                    candidate.setParagraphs(
                            candidate.getParagraphs()
                                    .stream()
                                    .map(paragraphService::add)
                                    .collect(Collectors.toList())
                    );
                    return candidate;
                }).map(articleRepository::save)
                .orElseThrow(() -> new Exception("Article is null :("));
    }

    @Override
    public Optional<Article> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public List<Article> findAll() {
        return null;
    }
}
