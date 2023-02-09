package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name="library_card")
public class LibraryCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int fine;

    private int issued_book;

    @Enumerated(value = EnumType.STRING)
    private  CardStatus cardStatus;


    //make foreign key to connect the parent user class with the child class
    @OneToOne // relation between current class with the parent class
    @JoinColumn // by default it will be joining the the field of the primary key of parent with the child column
    User user;

    public LibraryCard() {

    }

    public LibraryCard(int id, int fine, int issued_book, User user) {
        this.id = id;
        this.fine = fine;
        this.issued_book = issued_book;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public int getIssued_book() {
        return issued_book;
    }

    public void setIssued_book(int issued_book) {
        this.issued_book = issued_book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
