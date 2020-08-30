/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private Book[] currentlyAvailableBooks;

    public Library() {
        this.currentlyAvailableBooks = new Book[20];
        for (int index = 0; index < currentlyAvailableBooks.length; index++) {
            currentlyAvailableBooks[index] = new Book("Book " + (index + 1));
        }
    }

    public Library(Book[] currentlyAvailableBooks) {
        this.currentlyAvailableBooks = currentlyAvailableBooks;
    }

    public Book[] getCurrentlyAvailableBooks() {
        return currentlyAvailableBooks;
    }

    public void setCurrentlyAvailableBooks(Book[] currentlyAvailableBooks) {
        this.currentlyAvailableBooks = currentlyAvailableBooks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(currentlyAvailableBooks, library.currentlyAvailableBooks);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(currentlyAvailableBooks);
    }

    @Override
    public String toString() {
        return Arrays.toString(currentlyAvailableBooks);
    }

    /**
     * this method issue a book from library
     *
     * @param bookName the name of the book to be issue
     */

    public void issuedBook(String bookName) {
        System.out.println(bookName + " book is issued for you.");
    }

    public void returnedBook(String bookName) {
        System.out.println(" Thank You for returning the book " + bookName + ".");
    }

    public void showAllIssuedBooks() {
        for (Book book : currentlyAvailableBooks) {
            System.out.println(book);
        }
    }
}

