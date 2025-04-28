// Library.java
class Library {
    private Book[] books;
    private int count;

    public Library() {
        this.books = new Book[5]; // Fixed size array
        this.count = 0;
    }

    // Add a book
    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
            System.out.println("Book added successfully!");
        } else {
            System.out.println("Library is full, cannot add more books.");
        }
    }

    // Remove a book by bookID
    public void removeBook(int bookID) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (books[i].getBookID() == bookID) {
                // Shift remaining books
                for (int j = i; j < count - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[count - 1] = null;
                count--;
                found = true;
                System.out.println("Book removed successfully!");
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found.");
        }
    }

    // Search for a book by ID
    public void searchBook(int bookID) {
        for (int i = 0; i < count; i++) {
            if (books[i].getBookID() == bookID) {
                books[i].display();
                return;
            }
        }
        System.out.println("Book not found.");
    }

    // Display all books
    public void displayBooks() {
        if (count == 0) {
            System.out.println("Library is empty.");
        } else {
            for (int i = 0; i < count; i++) {
                books[i].display();
            }
        }
    }
}
