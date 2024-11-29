package LibraryManagementSystem;

// Base Class 
public class Book {
    protected String title;
    protected String author;
    protected boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have borrowed: " + title);
        } else {
            System.out.println(title + " is not available.");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("You have returned: " + title);
        } else {
            System.out.println(title + " was not borrowed.");
        }
    }
}
