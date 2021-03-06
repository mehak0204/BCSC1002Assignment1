/*   Created by IntelliJ IDEA.
 *   Author: Mehak Agarwal
 *   Date: 25-08-2020
 *   Time: 16:49
 *   File: Student.java
 */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String fullNameOfTheStudent = "Rudra Singh Rathore";
    private long universityRollnoOfTheStudent = 191500481;
    private int numberOfBooksIssuedByTheStudent = 3;
    private Book[] namesOfBooksIssuedByTheStudent;

    public Student(String fullNameOfTheStudent, long universityRollnoOfTheStudent, int numberOfBooksIssuedByTheStudent) {
        this.fullNameOfTheStudent = fullNameOfTheStudent;
        this.universityRollnoOfTheStudent = universityRollnoOfTheStudent;
        this.numberOfBooksIssuedByTheStudent = numberOfBooksIssuedByTheStudent;
    }

    public Student(Book[] namesOfBooksIssuedByTheStudent) {
        this.namesOfBooksIssuedByTheStudent = namesOfBooksIssuedByTheStudent;
    }

    public Student() {
        this.namesOfBooksIssuedByTheStudent = new Book[3];
        namesOfBooksIssuedByTheStudent[0] = new Book("COMMERCIAL CORRESPONDENCE", "D Antopravin Singh", "978-93-89970-32-6");
        namesOfBooksIssuedByTheStudent[1] = new Book("Taxation of Digital Economy", "VIJAY SHEKHAR JHA", "978-93-86920-88-1");
        namesOfBooksIssuedByTheStudent[2] = new Book("FINANCIAL ACCOUNTING", "DR. M.V. NAGARAJAN", "978-81-945166-0-6");
    }

    private String getFullNameOfTheStudent() {
        return fullNameOfTheStudent;
    }

    public void setFullNameOfTheStudent(String fullNameOfTheStudent) {
        this.fullNameOfTheStudent = fullNameOfTheStudent;
    }

    private long getUniversityRollnoOfTheStudent() {
        return universityRollnoOfTheStudent;
    }

    public void setUniversityRollnoOfTheStudent(long universityRollnoOfTheStudent) {
        this.universityRollnoOfTheStudent = universityRollnoOfTheStudent;
    }

    private int getNumberOfBooksIssuedByTheStudent() {
        return numberOfBooksIssuedByTheStudent;
    }

    public void setNumberOfBooksIssuedByTheStudent(int numberOfBooksIssuedByTheStudent) {
        this.numberOfBooksIssuedByTheStudent = numberOfBooksIssuedByTheStudent;
    }

    public void setNamesOfBooksIssuedByTheStudent(Book[] namesOfBooksIssuedByTheStudent) {
        this.namesOfBooksIssuedByTheStudent = namesOfBooksIssuedByTheStudent;
    }

    /**
     * This method will allow us to show the names of the books that is issued by the student.
     */
    public void issuedBooks() {
        for (Book book : this.namesOfBooksIssuedByTheStudent) {
            System.out.println(book);
        }
    }

    /**
     * This method will allow us to show the name and other related information of the student in front desk.
     */
    public void addname() {
        System.out.println("WELCOME" + "  " + getFullNameOfTheStudent() + "  !");
        System.out.println("UNIVERSITY ROLLNUMBER =" + "  " + getUniversityRollnoOfTheStudent());
        System.out.println("Number of books issued by you is" + "  " + getNumberOfBooksIssuedByTheStudent());
    }

    /**
     * This method will allow us to show the number of books that will be return to the student
     */
    public void returnBooks() {
        for (Book myBooks : this.namesOfBooksIssuedByTheStudent) {
            System.out.println(myBooks);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullNameOfTheStudent='" + fullNameOfTheStudent + '\'' +
                ", universityRollnoOfTheStudent=" + universityRollnoOfTheStudent +
                ", numberOfBooksIssuedByTheStudent=" + numberOfBooksIssuedByTheStudent +
                ", namesOfBooksIssuedByTheStudent=" + Arrays.toString(namesOfBooksIssuedByTheStudent) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getUniversityRollnoOfTheStudent() == student.getUniversityRollnoOfTheStudent() &&
                getNumberOfBooksIssuedByTheStudent() == student.getNumberOfBooksIssuedByTheStudent() &&
                Objects.equals(getFullNameOfTheStudent(), student.getFullNameOfTheStudent()) &&
                Arrays.equals(namesOfBooksIssuedByTheStudent, student.namesOfBooksIssuedByTheStudent);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getFullNameOfTheStudent(), getUniversityRollnoOfTheStudent(), getNumberOfBooksIssuedByTheStudent());
        result = 31 * result + Arrays.hashCode(namesOfBooksIssuedByTheStudent);
        return result;
    }
}

