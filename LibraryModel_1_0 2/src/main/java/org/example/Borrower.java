package org.example;

import org.example.enums.Readers;



public class Borrower implements Comparable<Borrower>{

    private String borrowerName;
    private Readers readers;
    private Book book;


    public Borrower(){

    }
    public Borrower(Readers readers, Book book, String name) {
        this.borrowerName = name;
        this.readers = readers;
        this.book = book;
    }

    public Readers getReaders() {
        return readers;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public void setReaders(Readers readers) {
        this.readers = readers;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Borrower{" +
                "name='" + borrowerName + '\'' +
                ", readers=" + readers +
                ", book=" + book +
                '}';
    }

    @Override
    public int compareTo(Borrower o) {
        return  this.getReaders().getNumber() > o.getReaders().getNumber() ? -1 : 1;
    }

}
