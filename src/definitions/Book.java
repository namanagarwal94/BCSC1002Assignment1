/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {
    private String bookName;
    private String authorName;
    private String thirteenDigitIsbnNumber;

    public Book(String bookName) {
        this.bookName = "three man in a boat";
        authorName = "O.Henry";
        thirteenDigitIsbnNumber = "1234567893216";
    }
