package com.enosh.articles.repository;

import com.enosh.articles.model.Article;
import com.enosh.articles.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
}
