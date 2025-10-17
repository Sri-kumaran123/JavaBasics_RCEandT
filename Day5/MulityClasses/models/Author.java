package models;
public class Author {
    String name;
    String email;

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void showAuthorDetails() {
        System.out.println("Author Name: " + name);
        System.out.println("Author Email: " + email);
    }
}