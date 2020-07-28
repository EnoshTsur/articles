package com.enosh.articles.controller;

import com.enosh.articles.model.Article;
import com.enosh.articles.model.ResponseDto;
import com.enosh.articles.services.ArticleService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Slf4j
@AllArgsConstructor
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/article")
public class ArticleController {

    private final ArticleService articleService;

    @GetMapping("/all")
    public ResponseEntity<ResponseDto<List<Article>>> all() {
        return ResponseEntity.ok(
                ResponseDto.success(
                        articleService.findAll()
                )
        );
    }
}


/*
    class Cool <T> {

        LocalTime - time
        LocalDate - date
        boolean - success
        T - content
    }
 */
