/*   Created by IntelliJ IDEA.
 *   Author: Mehak Agarwal
 *   Date: 25-08-2020
 *   Time: 16:49
 *   File: Student.java
 */

package definitions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String fullNameOfTheStudent;
    private long universityRollnoOfTheStudent;
    private int numberOfBooksIssuedByTheStudent;
    private Book[] namesOfBooksIssuedByTheStudent;

    public Student(String fullNameOfTheStudent,long universityRollnoOfTheStudent,int numberOfBooksIssuedByTheStudent,Book[] namesOfBooksIssuedByTheStudent){
        this.fullNameOfTheStudent=fullNameOfTheStudent;
        this.universityRollnoOfTheStudent=universityRollnoOfTheStudent;
        this.numberOfBooksIssuedByTheStudent=numberOfBooksIssuedByTheStudent;
        this.namesOfBooksIssuedByTheStudent=namesOfBooksIssuedByTheStudent;
    }

    private String getFullNameOfTheStudent(){
        return fullNameOfTheStudent;
    }

    private long getUniversityRollnoOfTheStudent(){
        return universityRollnoOfTheStudent;
    }

    private int getNumberOfBooksIssuedByTheStudent(){
        return numberOfBooksIssuedByTheStudent;
    }



    public void setFullNameOfTheStudent(String fullNameOfTheStudent){
        this.fullNameOfTheStudent=fullNameOfTheStudent;
    }

    public void setUniversityRollnoOfTheStudent(long universityRollnoOfTheStudent){
        this.universityRollnoOfTheStudent=universityRollnoOfTheStudent;
    }

    public void setNumberOfBooksIssuedByTheStudent(int numberOfBooksIssuedByTheStudent){
        this.numberOfBooksIssuedByTheStudent=numberOfBooksIssuedByTheStudent;
    }

    public void setNamesOfBooksIssuedByTheStudent(Book[] namesOfBooksIssuedByTheStudent){
        this.namesOfBooksIssuedByTheStudent=namesOfBooksIssuedByTheStudent;
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

