package models;
public class Book {
    String title;
    int pages;
    Author author; // each book has an author

    public Book(String title, int pages, Author author) {
        this.title = title;
        this.pages = pages;
        this.author = author;
    }

    public void showBookDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Pages: " + pages);
        author.showAuthorDetails();
    }
}
