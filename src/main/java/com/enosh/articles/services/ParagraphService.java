package com.enosh.articles.services;

import com.enosh.articles.model.Paragraph;

import java.util.List;
import java.util.Optional;

public class ParagraphService implements EntityService<Paragraph, Long> {
    @Override
    public Paragraph add(Paragraph paragraph) {
        return null;
    }

    @Override
    public Optional<Paragraph> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Paragraph> findAll() {
        return null;
    }
}
