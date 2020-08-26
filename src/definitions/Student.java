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

    public Student(String fullNameOfTheStudent,long universityRollnoOfTheStudent,int numberOfBooksIssuedByTheStudent){
        this.fullNameOfTheStudent=fullNameOfTheStudent;
        this.universityRollnoOfTheStudent=universityRollnoOfTheStudent;
        this.numberOfBooksIssuedByTheStudent=numberOfBooksIssuedByTheStudent;
    }


    public Student(Book[] namesOfBooksIssuedByTheStudent){
        this.namesOfBooksIssuedByTheStudent=namesOfBooksIssuedByTheStudent;

    }

    public Student(){
        this.namesOfBooksIssuedByTheStudent=new Book[3];
        namesOfBooksIssuedByTheStudent[0]=new Book("COMMERCIAL CORRESPONDENCE","D Antopravin Singh","978-93-89970-32-6");
        namesOfBooksIssuedByTheStudent[1]=new Book("Taxation of Digital Economy","VIJAY SHEKHAR JHA","978-93-86920-88-1");
        namesOfBooksIssuedByTheStudent[2]=new Book("FINANCIAL ACCOUNTING","DR. M.V. NAGARAJAN","978-81-945166-0-6");

        for (int i = 0; i < this.namesOfBooksIssuedByTheStudent.length; i++) {
            System.out.println("The name of the book issued by the student with it's author's name and ISBN number is"+namesOfBooksIssuedByTheStudent);

        }
    }


    private String getFullNameOfTheStudent(){

        return fullNameOfTheStudent;
    }

    private long getUniversityRollnoOfTheStudent(){
        return universityRollnoOfTheStudent;
    }

    private int getNumberOfBooksIssuedByTheStudent()
    {
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

