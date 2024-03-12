package guvi_task3_Q1;

public class LibrarySystem {
	 public static void main(String[] args) {
	        Library library = new Library();

	        // Adding books
	        library.addBook(new Book(1, "Book One", "Author A", true));
	        library.addBook(new Book(2, "Book Two", "Author B", true));
	        library.addBook(new Book(3, "Book Three", "Author C", false)); // Assuming this book is borrowed

	        // Display all books
	        System.out.println("Displaying all books:");
	        library.displayBooks();

	        // Searching for a book
	        Book foundBook = library.searchBook(2);
	        if (foundBook != null) {
	            System.out.println("Found book: " + foundBook);
	        } else {
	            System.out.println("Book not found.");
	        }

	        // Removing a book
	        boolean isRemoved = library.removeBook(1);
	        if (isRemoved) {
	            System.out.println("Book removed successfully.");
	        } else {
	            System.out.println("Could not remove book.");
	        }

	        // Display all books after removal
	        System.out.println("Displaying all books after removal:");
	        library.displayBooks();
	    }
}

//output :
//	Displaying all books:
//		Book{bookID=1, title='Book One', author='Author A', isAvailable=true}
//		Book{bookID=2, title='Book Two', author='Author B', isAvailable=true}
//		Book{bookID=3, title='Book Three', author='Author C', isAvailable=false}
//		Found book: Book{bookID=2, title='Book Two', author='Author B', isAvailable=true}
//		Book removed successfully.
//		Displaying all books after removal:
//		Book{bookID=2, title='Book Two', author='Author B', isAvailable=true}
//		Book{bookID=3, title='Book Three', author='Author C', isAvailable=false}
