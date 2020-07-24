package com.enosh.articles.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "paragraph")
public class Paragraph extends BaseEntity {

    @Lob
    @Column(name = "content", nullable = false)
    private String content;

    public Paragraph(String content) {
        this.content = content;
    }
}
