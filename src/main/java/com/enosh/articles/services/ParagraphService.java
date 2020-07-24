package com.enosh.articles.services;

import com.enosh.articles.model.Paragraph;
import com.enosh.articles.repository.ParagraphRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ParagraphService implements EntityService<Paragraph, Long> {

    private final ParagraphRepository repository;

    @Override
    public Paragraph add(Paragraph paragraph) {
        return repository.save(paragraph);
    }

    @Override
    public Optional<Paragraph> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Paragraph> findAll() {
        return repository.findAll();
    }
}
