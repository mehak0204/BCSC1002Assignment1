/*   Created by IntelliJ IDEA.
 *   Author: Mehak Agarwal
 *   Date: 27-08-2020
 *   Time: 22:39
 *   File: frontDesk.java
 */

package execution;

import definitions.Library;
import definitions.Student;

import java.util.Scanner;

public class frontDesk {
    private static final int ISSUE_A_NEW_BOOK = 1;
    private static final int RETURN_BOOK = 2;
    private static final int SHOW_ALL_ISSUE_BOOKS = 3;
    private static final int EXIT = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        Library myLibrary = new Library();
        Student myStudent = new Student();
        String NameOfTheBook;
        do {
            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
            System.out.println("How may I help you today?");
            System.out.println("1. Issue a new book for me.");
            System.out.println("2. Return a previously issues book for me.");
            System.out.println("3. Show me all my issues books.");
            System.out.println("4. Exit.");
            option = scanner.nextInt();
            switch (option) {
                case ISSUE_A_NEW_BOOK:
                    myStudent.addname();
                    System.out.println("Books that are available right now are as follows:- ");
                    myLibrary.writeTotalNumberOfBooks();
                    System.out.println("Enter the book you want to add !");
                    scanner.nextLine();
                    NameOfTheBook = scanner.nextLine();
                    myLibrary.addNewBookToIssue(NameOfTheBook);
                    break;
                case RETURN_BOOK:
                    myStudent.addname();
                    System.out.println("Your previously issued books are returned successfully!!");
                    System.out.println("These are as follows:-");
                    myStudent.returnBooks();
                    break;
                case SHOW_ALL_ISSUE_BOOKS:
                    myStudent.addname();
                    System.out.println("These are the total books that are issued by you!");
                    myStudent.issuedBooks();
                    break;
                case EXIT:
                    break;
                default:
                    break;
            }
        }
        while (option != EXIT);
        scanner.close();
    }
}

