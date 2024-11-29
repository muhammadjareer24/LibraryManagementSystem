package LibraryManagementSystem;

// Library Class
public class Library {
    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }

    public void displayBooks() {
        System.out.println("\n----- Library Books -----\n");
        for (Book book : books) {
            book.displayInfo();
            System.out.println("-----");
        }
    }

    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                book.borrowBook();
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                book.returnBook();
                return;
            }
        }
        System.out.println("Book not found.");
    }
}