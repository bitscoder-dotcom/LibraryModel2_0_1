package org.example.impl;


import org.example.Borrower;
import org.example.services.LibrarianDuties;

import java.util.*;

public class LibrarianImpl implements LibrarianDuties {

    public  void issueBook(PriorityQueue<Borrower> priorityQueue) {

        Iterator<Borrower> iterator = priorityQueue.iterator();
        while (iterator.hasNext()){
            processBook(priorityQueue.poll());

        }
    }

    public void issueBook2(LinkedList<Borrower> linkedList) {

        Iterator<Borrower> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            processBook(linkedList.remove());
        }
    }
    private  void  processBook(Borrower borrower){
        if (borrower.getBook().isAvailable()){
            borrower.getBook().setCopies(borrower.getBook().getCopies() - 1);
            System.out.println("Enjoy Your Book : " + borrower.getBorrowerName());

        }else{
            System.out.println("Pele, "+ borrower.getBorrowerName() + ", the book you requested, " +
                    "'"+borrower.getBook().getTitle()+"'" + " by authur, "
                    + borrower.getBook().getAuthor() + ", is not Available.");
        }
    }


}