package org.example;

import org.example.enums.Readers;
import org.example.impl.LibrarianImpl;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("D23", "Fun With Java", "Nwike Sheldon", 2, true);
        Book book2 = new Book("E23", "Java Is Not Easy", "Thompson Johnson", 2, true);
        Book book3 = new Book("W23", "Introduction To CSS", "Tobirama", 2, true);
        Book book4 = new Book("P23", "Intro to PES2023", "Daniel Ghost", 3, true);
        Book book5 = new Book("L23", "How to Cook Olugbu", "Amaka Fleks", 1, true);



        Borrower borrower3 = new Borrower(Readers.SENIOR_STUDENT, book5, "Ms Dorathy");
        Borrower borrower7 = new Borrower(Readers.SENIOR_STUDENT, book2, "Mr Timothy");
        Borrower borrower8 = new Borrower(Readers.SENIOR_STUDENT, book2, "Ms Agbor");
        Borrower borrower4 = new Borrower(Readers.TEACHER, book3, "Mr Olu Jacobs");
        Borrower borrower1 = new Borrower(Readers.TEACHER, book2, "Mr Kunle");
        Borrower borrower2 = new Borrower(Readers.JUNIOR_STUDENT, book1, "Ms Lilian");
        Borrower borrower5 = new Borrower(Readers.JUNIOR_STUDENT, book5, "Ms Kemi");
        Borrower borrower6 = new Borrower(Readers.JUNIOR_STUDENT, book4, "Ms Oyetola");


        PriorityQueue<Borrower> queue = new PriorityQueue<>(new CustomComparator());
        queue.add(borrower1);
        queue.add(borrower2);
        queue.add(borrower3);
        queue.add(borrower6);
        queue.add(borrower8);

        LinkedList<Borrower> linkedList = new LinkedList<>();
        linkedList.add(borrower5);
        linkedList.add(borrower7);
        linkedList.add(borrower4);
        linkedList.add(borrower3);



        LibrarianImpl librarian = new LibrarianImpl();
        librarian.issueBook(queue);
        librarian.issueBook2(linkedList);


    }
}
