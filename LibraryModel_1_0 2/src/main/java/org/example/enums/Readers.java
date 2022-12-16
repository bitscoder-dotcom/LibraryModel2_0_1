package org.example.enums;

public enum Readers {

    TEACHER(300),
    SENIOR_STUDENT(200),
    JUNIOR_STUDENT(100);

    int number;
    Readers(int number) {
        this.number = number;
    }
   public int getNumber() {
        return number;
    }
}
