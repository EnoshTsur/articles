package com.enosh.articles.article;

import com.enosh.articles.model.Article;
import com.enosh.articles.model.Paragraph;
import com.enosh.articles.services.ArticleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ParagraphTests {

    @Autowired
    private ArticleService articleService;

    @Test
    void contextLoads() {
    }

    @Test
    void addArticle(){
        List<Paragraph> paragraphs = List.of(
                new Paragraph("Hi there this is me the sun"),
                new Paragraph("Hello sun im your son"),
                new Paragraph("Ok")
        );

//        Article article = new Article("Sun story", paragraphs);
    }



}
