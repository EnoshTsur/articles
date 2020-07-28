package com.enosh.articles.controller;

import com.enosh.articles.model.Article;
import com.enosh.articles.services.ArticleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/article")
public class ArticleController {

    private final ArticleService articleService;

    @GetMapping("/all")
    public List<Article> all(){
        return articleService.findAll();
    }
}
