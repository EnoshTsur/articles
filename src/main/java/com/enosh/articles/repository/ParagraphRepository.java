package com.enosh.articles.repository;

import com.enosh.articles.model.Author;
import com.enosh.articles.model.Paragraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParagraphRepository extends JpaRepository<Paragraph, Long> {
}
