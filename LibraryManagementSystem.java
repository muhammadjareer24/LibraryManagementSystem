package LibraryManagementSystem;

import java.util.Scanner;

// Main Class
public class LibraryManagementSystem {
    public static void main(String[] args) {

        // Create books
        Book book1 = new NonFictionBook("Clean Code", "Robert C. Martin", "Tech");
        Book book2 = new FictionBook("Diary of a Wimpy Kid", "Jeff Kinney", "Comedy");
        Book book3 = new NonFictionBook("Sapiens", "Yuval Noah Harari", "History");
        Book book4 = new NonFictionBook("Introduction to Blockchain", "Zeeshan Usmani", "Tech");
        Book book5 = new FictionBook("1984", "George Orwell", "Dystopian Fiction");
        Book book6 = new FictionBook("To Kill a Mockingbird", "Harper Lee", "Classic Fiction");
        Book book7 = new NonFictionBook("The Power of Habit", "Charles Duhigg", "Self-help");
        Book book8 = new FictionBook("Pride and Prejudice", "Jane Austen", "Romance");
        Book book9 = new NonFictionBook("A Brief History of Time", "Stephen Hawking", "Science");
        Book book10 = new FictionBook("The Hobbit", "J.R.R. Tolkien", "Fantasy");
        Book book11 = new NonFictionBook("Atomic Habits", "James Clear", "Self-help");
        Book book12 = new FictionBook("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "Fantasy");
        Book book13 = new NonFictionBook("The Art of War", "Sun Tzu", "Strategy");
        Book book14 = new FictionBook("The Catcher in the Rye", "J.D. Salinger", "Classic Fiction");
        Book book15 = new NonFictionBook("Becoming", "Michelle Obama", "Biography");

        // Add books to library
        Library library = new Library(new Book[] { book1, book2, book3, book4, book5, book6, book7, book8, book9,
                book10, book11, book12, book13, book14, book15 });

        // Interactive menu using Scanner
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nWelcome to the Library Management System!");
            System.out.println("1. View all books");
            System.out.println("2. Search for a book");
            System.out.println("3. Borrow a book");
            System.out.println("4. Return a book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // Display all books
                    library.displayBooks();
                    break;

                case 2:
                    // Search for a book
                    System.out.print("Enter the title of the book to search: ");
                    String searchTitle = scanner.nextLine();
                    boolean found = false;
                    for (Book book : library.getBooks()) {
                        if (book.title.equalsIgnoreCase(searchTitle)) {
                            System.out.println("Book found:");
                            book.displayInfo();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 3:
                    // Borrow a book
                    System.out.print("Enter the title of the book to borrow: ");
                    String borrowTitle = scanner.nextLine();
                    library.borrowBook(borrowTitle);
                    break;

                case 4:
                    // Return a book
                    System.out.print("Enter the title of the book to return: ");
                    String returnTitle = scanner.nextLine();
                    library.returnBook(returnTitle);
                    break;

                case 5:
                    // Exit the program
                    System.out.println("Exiting the Library Management System. Goodbye!");
                    scanner.close();
                    return;

                default:
                    // Invalid input
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
