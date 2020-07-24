package com.enosh.articles.services;

import com.enosh.articles.model.Author;
import com.enosh.articles.repository.AuthorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class AuthorService implements EntityService<Author, Long> {

    private final AuthorRepository repository;

    @Override
    public Author add(Author author) {
        return repository.save(author);
    }

    @Override
    public Optional<Author> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Author> findAll() {
        return repository.findAll();
    }
}
