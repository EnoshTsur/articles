package com.enosh.articles.bootstrap;

import com.enosh.articles.model.Article;
import com.enosh.articles.model.ArticleDto;
import com.enosh.articles.model.Paragraph;
import com.enosh.articles.services.ArticleService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

@Transactional
@AllArgsConstructor
@Component
public class ArticleBootstrap implements CommandLineRunner {


    private final ArticleService articleService;

    @Override
    public void run(String... args) throws Exception {
        Consumer<ArticleDto> saveAndPrint = article -> {
            try {
                System.out.println(articleService.add(article));
            } catch (Exception e){
                e.printStackTrace();
            }
        };

        Stream.of(
                new ArticleDto(
                        1L,
                        "Sun is Cool!",
                        List.of(
                                new Paragraph("I love the sun"),
                                new Paragraph("Its looks yellow to me"),
                                new Paragraph("And rounded")
                        )
                ),
                new ArticleDto(
                        2L,
                        "Cookies Time!",
                        List.of(
                                new Paragraph("Did yo notice some cookies"),
                                new Paragraph("Not web cookies..."),
                                new Paragraph("Regular cookies")
                        )
                ),
                new ArticleDto(
                        3L,
                        "I got soup for you!",
                        List.of(
                                new Paragraph("With onions and onions"),
                                new Paragraph("And basil"),
                                new Paragraph("But there is no spoon :)")
                        )
                )).forEach(saveAndPrint);



    }
}
