/*  Created by IntelliJ IDEA.
 *  User: Naman Agarwal
 *  Date: 30/08/20
 *  Time: 12:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String firstNameOfStudent;
    private String middleNameOfStudent;
    private String lastNameOfStudent;
    private long universityRollNumberOfStudent;
    private int numberOfBooksIssuedByStudent;
    private Book[] namesOfBooksIssuedByStudent;

    public String getFirstNameOfStudent() {
        return firstNameOfStudent;
    }

    public void setFirstNameOfStudent(String firstNameOfStudent) {
        this.firstNameOfStudent = firstNameOfStudent;
    }

    public String getMiddleNameOfStudent() {
        return middleNameOfStudent;
    }

    public void setMiddleNameOfStudent(String middleNameOfStudent) {
        this.middleNameOfStudent = middleNameOfStudent;
    }

    public String getLastNameOfStudent() {
        return lastNameOfStudent;
    }

    public void setLastNameOfStudent(String lastNameOfStudent) {
        this.lastNameOfStudent = lastNameOfStudent;
    }

    public long getUniversityRollNumberOfStudent() {
        return universityRollNumberOfStudent;
    }

    public void setUniversityRollNumberOfStudent(long universityRollNumberOfStudent) {
        this.universityRollNumberOfStudent = universityRollNumberOfStudent;
    }

    public int getNumberOfBooksIssuedByStudent() {
        return numberOfBooksIssuedByStudent;
    }

    public void setNumberOfBooksIssuedByStudent(int numberOfBooksIssuedByStudent) {
        this.numberOfBooksIssuedByStudent = numberOfBooksIssuedByStudent;
    }

    public Book[] getNamesOfBooksIssuedByStudent() {
        return namesOfBooksIssuedByStudent;
    }

    public void setNamesOfBooksIssuedByStudent(Book[] namesOfBooksIssuedByStudent) {
        namesOfBooksIssuedByStudent = namesOfBooksIssuedByStudent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return universityRollNumberOfStudent == student.universityRollNumberOfStudent &&
                numberOfBooksIssuedByStudent == student.numberOfBooksIssuedByStudent &&
                Objects.equals(firstNameOfStudent, student.firstNameOfStudent) &&
                Objects.equals(middleNameOfStudent, student.middleNameOfStudent) &&
                Objects.equals(lastNameOfStudent, student.lastNameOfStudent) &&
                Arrays.equals(namesOfBooksIssuedByStudent, student.namesOfBooksIssuedByStudent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstNameOfStudent(), getMiddleNameOfStudent(), getLastNameOfStudent(), getUniversityRollNumberOfStudent(), getNumberOfBooksIssuedByStudent());
    }

    public String toString() {
        return "Student{" +
                "firstNameOfStudent='" + getFirstNameOfStudent() + '\'' +
                ", middleNameOfStudent='" + getMiddleNameOfStudent() + '\'' +
                ", lastNameOfStudent='" + getLastNameOfStudent() + '\'' +
                ", universityRollNumberOfStudent=" + getUniversityRollNumberOfStudent() +
                ", numberOfBooksIssuedByStudent=" + getNumberOfBooksIssuedByStudent() +
                ", AllNamesOfBooksIssuedByStudent=" + Arrays.toString(namesOfBooksIssuedByStudent) +
                '}';
    }
}
