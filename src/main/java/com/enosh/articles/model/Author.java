package com.enosh.articles.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "author")
public class Author extends BaseEntity {

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "image")
    private String image;

    public Author(String firstName, String lastName, String image) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.image = image;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id= " + id + ", " +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
