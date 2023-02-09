package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name="BookInfo")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String AuthorName;

    // adding foreign key to the book table because it is a child class
    @ManyToOne
    @JoinColumn
    Author author;

    public Book() {
    }

    public Book(int id, String name, String authorName, Author author) {
        this.id = id;
        this.name = name;
        AuthorName = authorName;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public void setAuthorName(String authorName) {
        AuthorName = authorName;
    }
}
