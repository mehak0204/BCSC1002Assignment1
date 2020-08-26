/*   Created by IntelliJ IDEA.
 *   Author: Mehak Agarwal
 *   Date: 25-08-2020
 *   Time: 16:49
 *   File: Library.java
 */

package definitions;

public class Library {
    private Book[] totalNumberOfBooksInTheLibrary;

    public Library(Book[] totalNumberOfBooksInTheLibrary){
        this.totalNumberOfBooksInTheLibrary=totalNumberOfBooksInTheLibrary;
    }

    public Library(){
        this.totalNumberOfBooksInTheLibrary=new Book[10];
        totalNumberOfBooksInTheLibrary[0]=new Book("COMMERCIAL CORRESPONDENCE","D Antopravin Singh","978-93-89970-32-6");
        totalNumberOfBooksInTheLibrary[1]=new Book("Taxation of Digital Economy","VIJAY SHEKHAR JHA","978-93-86920-88-1");
        totalNumberOfBooksInTheLibrary[2]=new Book("FINANCIAL ACCOUNTING","DR. M.V. NAGARAJAN","978-81-945166-0-6");
        totalNumberOfBooksInTheLibrary[3]=new Book("Management Accounting","Dr. Arvind A. Dhond","978-93-89709-74-2");
        totalNumberOfBooksInTheLibrary[4]=new Book("Media Studies","Meera Suryanarayanan","978-93-89709-72-8");
        totalNumberOfBooksInTheLibrary[5]=new Book("Motion Graphics and Visual Effects - I","Vikas Shirode and Shweta Shirode","978-93-89709-71-1");
        totalNumberOfBooksInTheLibrary[6]=new Book("INTERNATIONAL BUSINESS MANAGEMENT","Dr.N.Eswaran and Dr.K.Vishnupriya","978-81-940480-2-2");
        totalNumberOfBooksInTheLibrary[7]=new Book("Precise Laboratory Manual of Mathematics - 9","Divya Gupta","978-93-87589-86-5"	);
        totalNumberOfBooksInTheLibrary[8]=new Book("DATA WAREHOUSING AND DATA MINING","Dr D Udaya Suriya Rajkumar","978-93-89970-31-9");
        totalNumberOfBooksInTheLibrary[9]=new Book("Online Teaching : A Need","Dr. Shyam Sundar Sharma","978-93-88746-55-7");

        for (int i = 0; i < this.totalNumberOfBooksInTheLibrary.length; i++) {
            System.out.println("Total number of books in the Library are as follows:" + totalNumberOfBooksInTheLibrary);

        }



    }


}

