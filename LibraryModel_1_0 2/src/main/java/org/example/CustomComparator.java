package org.example;

import java.util.Comparator;

public class CustomComparator implements Comparator<Borrower> {


    @Override
    public int compare(Borrower o1, Borrower o2) {

        if (o1.getReaders().getNumber() > o2.getReaders().getNumber()) {
            return  -1;
        } else if(o1.getReaders().getNumber() < o2.getReaders().getNumber()) {
         return 1;
        } return 0;

    }

}
