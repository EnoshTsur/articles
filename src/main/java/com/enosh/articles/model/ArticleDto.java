package com.enosh.articles.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class ArticleDto {

    private Long authorId;
    private String header;
    private List<Paragraph> paragraphs;

}


// Data transfer object


