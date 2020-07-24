package com.enosh.articles.author;

import com.enosh.articles.model.Author;
import com.enosh.articles.services.AuthorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AuthorTests {

    @Autowired
    private AuthorService authorService;

    @Test
    void contextLoads() {
    }

    @Test
    void addAuthor() {

        Author afterSave = authorService.add(
                new Author(
                        "Efraim",
                        "Shulman",
                        "http://")
        );

        System.out.println(afterSave);
    }


}
