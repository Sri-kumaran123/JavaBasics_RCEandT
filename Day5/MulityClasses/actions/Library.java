package actions;
import models.Book;
public class Library {
    String name;
    String location;
    Book book; // library has a book

    public Library(String name, String location, Book book) {
        this.name = name;
        this.location = location;
        this.book = book;
    }

    public void showLibraryDetails() {
        System.out.println("Library Name: " + name);
        System.out.println("Library Location: " + location);
        System.out.println("Book available in library:");
        book.showBookDetails();
        System.out.println("---------------------------");
    }
}