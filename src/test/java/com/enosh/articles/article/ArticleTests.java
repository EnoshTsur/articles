package com.enosh.articles.article;

import com.enosh.articles.model.Article;
import com.enosh.articles.model.Author;
import com.enosh.articles.model.Paragraph;
import com.enosh.articles.services.ArticleService;
import com.enosh.articles.services.AuthorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ArticleTests {

    @Autowired
    private ArticleService articleService;
    @Autowired
    private AuthorService authorService;

    @Test
    void contextLoads() {
    }

    @Test
    void addArticle() {

        Author author = authorService.add(
                new Author(
                        "Eran",
                        "Holman",
                        "http://erans-avatar.gif"
                )
        );

        List<Paragraph> paragraphs = List.of(
                new Paragraph("Hi there this is me the sun"),
                new Paragraph("Hello sun im your son"),
                new Paragraph("Ok")
        );

        Article article = new Article("Sun story", author, paragraphs);

        try {
            System.out.println(articleService.add(article));
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}
