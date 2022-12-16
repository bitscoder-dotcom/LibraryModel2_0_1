package org.example.services;

import org.example.Borrower;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public interface LibrarianDuties {

    void issueBook (PriorityQueue<Borrower> priorityQueue);

    void issueBook2(LinkedList<Borrower> linkedList);
}
