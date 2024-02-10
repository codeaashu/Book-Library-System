/*
 *   Q. Create a Book class for a library system.🚀
 *    • Instance variables: title, author, isbn.
 *    • Static variable: totalBooks, a counter for the total number of book instances.
 *    • Instance methods: borrowBook(), returnBook().
 *    • Static method: getTotalBooks(), to get the total number of books in the library.
 * 
 */
public class Book {
    static int totalNoOfBooks;
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    static {
        totalNoOfBooks = 0;
    }
    {
        totalNoOfBooks++;
    }

    Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    Book(String isbn) {
        this(isbn, "Unknown", "Unknown");
    }

    static int getTotalNoOfBooks() {
        return totalNoOfBooks;
    }

    void borrowBook() {
        if (isBorrowed) {
            System.out.println("This book has already been borrowed.");
        } else {
            this.isBorrowed = true;
            System.out.println("Enjoy " + this.title);
        }
    }

    void returnBook() {
        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed, Please leave a review");
        } else {
            System.out.println("This book is already in the library");
        }
    }

    public static void main(String[] args) {
        Book designOfWebsite = new Book("1", "Design", "aashu");
        Book javaProgramming = new Book("2");
        System.out.println("Total number of books in the library: " + Book.getTotalNoOfBooks());
        designOfWebsite.borrowBook();
        javaProgramming.borrowBook();
        designOfWebsite.borrowBook();
        designOfWebsite.returnBook();
        designOfWebsite.returnBook();
    }
}