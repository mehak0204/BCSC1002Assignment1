/*   Created by IntelliJ IDEA.
 *   Author: Mehak Agarwal
 *   Date: 25-08-2020
 *   Time: 16:49
 *   File: Library.java
 */
package definitions;

import java.util.Arrays;

public class Library {
    private final Book[] totalNumberOfBooksInTheLibrary;

    public Library(Book[] totalNumberOfBooksInTheLibrary) {
        this.totalNumberOfBooksInTheLibrary = totalNumberOfBooksInTheLibrary;
    }

    public Library() {
        this.totalNumberOfBooksInTheLibrary = new Book[10];
        totalNumberOfBooksInTheLibrary[0] = new Book("COMMERCIAL CORRESPONDENCE", "D Antopravin Singh", "978-93-89970-32-6");
        totalNumberOfBooksInTheLibrary[1] = new Book("Taxation of Digital Economy", "VIJAY SHEKHAR JHA", "978-93-86920-88-1");
        totalNumberOfBooksInTheLibrary[2] = new Book("FINANCIAL ACCOUNTING", "DR. M.V. NAGARAJAN", "978-81-945166-0-6");
        totalNumberOfBooksInTheLibrary[3] = new Book("Management Accounting", "Dr. Arvind A. Dhond", "978-93-89709-74-2");
        totalNumberOfBooksInTheLibrary[4] = new Book("Media Studies", "Meera Suryanarayanan", "978-93-89709-72-8");
        totalNumberOfBooksInTheLibrary[5] = new Book("Motion Graphics and Visual Effects - I", "Vikas Shirode and Shweta Shirode", "978-93-89709-71-1");
        totalNumberOfBooksInTheLibrary[6] = new Book("INTERNATIONAL BUSINESS MANAGEMENT", "Dr.N.Eswaran and Dr.K.Vishnupriya", "978-81-940480-2-2");
        totalNumberOfBooksInTheLibrary[7] = new Book("Precise Laboratory Manual of Mathematics - 9", "Divya Gupta", "978-93-87589-86-5");
        totalNumberOfBooksInTheLibrary[8] = new Book("DATA WAREHOUSING AND DATA MINING", "Dr D Udaya Suriya Rajkumar", "978-93-89970-31-9");
        totalNumberOfBooksInTheLibrary[9] = new Book("Online Teaching : A Need", "Dr. Shyam Sundar Sharma", "978-93-88746-55-7");
    }

    /**
     * This method will allow us to add total number of books present in  the library to our front desk.
     */
    public void writeTotalNumberOfBooks() {
        System.out.println("1. COMMERCIAL CORRESPONDENCE");
        System.out.println("2. Taxation of Digital Economy");
        System.out.println("3. FINANCIAL ACCOUNTING");
        System.out.println("4. Management Accounting");
        System.out.println("5. Media Studies");
        System.out.println("6. Motion Graphics and Visual Effects - I");
        System.out.println("7. INTERNATIONAL BUSINESS MANAGEMENT");
        System.out.println("8. Precise Laboratory Manual of Mathematics - 11");
        System.out.println("9. DATA WAREHOUSING AND DATA MINING");
        System.out.println("10. Online Teaching : A Need");

    }

    /**
     * This method is use to show that the new book is added into the student's library account.
     */
    public void addNewBookToIssue(String name) {
        System.out.println("\"" + name + "\" is now added to your Library's Account.");
    }

    @Override
    public String toString() {
        return "Library{" +
                "totalNumberOfBooksInTheLibrary=" + Arrays.toString(totalNumberOfBooksInTheLibrary) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Library)) return false;
        Library library = (Library) o;
        return Arrays.equals(totalNumberOfBooksInTheLibrary, library.totalNumberOfBooksInTheLibrary);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(totalNumberOfBooksInTheLibrary);
    }
}

