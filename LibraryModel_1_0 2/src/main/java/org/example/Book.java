package org.example;

public class Book {

    private String id;
    private  String title;
    private String author;
    private int copies;
    private boolean isAvailable;

    public Book(String id, String title, String author, int copies, boolean isAvailable) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.copies = copies;
        this.isAvailable = isAvailable;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
        if (copies == 0 ) {
            isAvailable = false;
        }
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", copies=" + copies +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
