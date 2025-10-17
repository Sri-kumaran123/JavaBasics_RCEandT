import actions.Library;
import models.Author;
import models.Book;
public class Main {
    public static void main(String[] args) {
        // Create authors
        Author author1 = new Author("Srikumaran", "sriku@example.com");
        Author author2 = new Author("Kumar", "kumar@example.com");

        // Create books
        Book book1 = new Book("Java Basics", 250, author1);
        Book book2 = new Book("Python Essentials", 300, author2);

        // Create libraries
        Library lib1 = new Library("City Library", "Downtown", book1);
        Library lib2 = new Library("Community Library", "Uptown", book2);

        // Display details
        lib1.showLibraryDetails();
        lib2.showLibraryDetails();
    }
}