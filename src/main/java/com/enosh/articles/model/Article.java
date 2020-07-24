package com.enosh.articles.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "article")
public class Article extends BaseEntity{

    @Column(name = "header", nullable = false)
    private String header;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Paragraph> paragraphs;

    public Article(String header, Author author, List<Paragraph> paragraphs) {
        this.header = header;
        this.author = author;
        this.paragraphs = paragraphs;
    }
}

