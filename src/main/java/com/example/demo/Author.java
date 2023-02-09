package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name ="AuthorInfo")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private int bookWritten;

    public Author() {
    }

    public Author(int id, String name, int bookWritten) {
        this.id = id;
        this.name = name;
        this.bookWritten = bookWritten;
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

    public int getBookWritten() {
        return bookWritten;
    }

    public void setBookWritten(int bookWritten) {
        this.bookWritten = bookWritten;
    }
}
