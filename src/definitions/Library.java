/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private Book[] allBooksThatAreCurrentlyAvailable;

    public Library() {
        this.allBooksThatAreCurrentlyAvailable = new Book[20];
        for (int index = 0; index < allBooksThatAreCurrentlyAvailable.length; index++) {
            allBooksThatAreCurrentlyAvailable[index] = new Book("Book " + (index + 1));
        }
    }

    public Library(Book[] allBooksThatAreCurrentlyAvailable) {
        this.allBooksThatAreCurrentlyAvailable = allBooksThatAreCurrentlyAvailable;
    }

    public Book[] getStoreAllBooksThatAreCurrentlyAvailable() {
        return allBooksThatAreCurrentlyAvailable;
    }

    public void setStoreAllBooksThatAreCurrentlyAvailable(Book[] allBooksThatAreCurrentlyAvailable) {
        this.allBooksThatAreCurrentlyAvailable = allBooksThatAreCurrentlyAvailable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(allBooksThatAreCurrentlyAvailable, library.allBooksThatAreCurrentlyAvailable);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(allBooksThatAreCurrentlyAvailable);
    }

    @Override
    public String toString() {
        return Arrays.toString(allBooksThatAreCurrentlyAvailable);
    }

    /**
     * This method issued a Book to the Library.
     *
     * @param bookName The name of the Book to be issued.
     */

    public void issuedBook(String bookName) {
        System.out.println(bookName + " book is issued for you.");
    }

    public void returnedBook(String bookName) {
        System.out.println(" Thank You for returning the book " + bookName + ".");
    }

    public void showAllIssuedBooks() {
        for (Book book : allBooksThatAreCurrentlyAvailable) {
            System.out.println(book);
        }
    }
}

