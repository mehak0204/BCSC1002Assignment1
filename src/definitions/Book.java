/*   Created by IntelliJ IDEA.
 *   Author: Mehak Agarwal
 *   Date: 25-08-2020
 *   Time: 16:48
 *   File: Book.java
 */

package definitions;

import java.util.Objects;

public class Book {
   private String fullNameOfTheBook;
   private String nameOfTheAuthorOfTheBook;
   private String ISBNNumberOfTheBook;

   public Book(String fullNameOfTheBook ,String nameOfTheAuthorOfTheBook,String ISBNNumberOfTheBook){
      this.fullNameOfTheBook=fullNameOfTheBook;
      this.nameOfTheAuthorOfTheBook=nameOfTheAuthorOfTheBook;
      this.ISBNNumberOfTheBook=ISBNNumberOfTheBook;
   }


   private String getFullNameOfTheBook(){
      return fullNameOfTheBook;
   }

   private String getNameOfTheAuthorOfTheBook(){
      return nameOfTheAuthorOfTheBook;
   }

   private String getISBNNumberOfTheBook(){
      return ISBNNumberOfTheBook;
   }

   public void setFullNameOfTheBook(String fullNameOfTheBook){
      this.fullNameOfTheBook=fullNameOfTheBook;
   }

   public void setNameOfTheAuthorOfTheBook(String nameOfTheAuthorOfTheBook){
      this.nameOfTheAuthorOfTheBook=nameOfTheAuthorOfTheBook;
   }

   public void setISBNNumberOfTheBook(String ISBNNumberOfTheBook){
      this.fullNameOfTheBook=ISBNNumberOfTheBook;
   }

   @Override
   public String toString() {
      return "Book{" +
              "fullNameOfTheBook='" + fullNameOfTheBook + '\'' +
              ", nameOfTheAuthorOfTheBook='" + nameOfTheAuthorOfTheBook + '\'' +
              ", ISBNNumberOfTheBook='" + ISBNNumberOfTheBook + '\'' +
              '}';
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (!(o instanceof Book)) return false;
      Book book = (Book) o;
      return Objects.equals(getFullNameOfTheBook(), book.getFullNameOfTheBook()) &&
              Objects.equals(getNameOfTheAuthorOfTheBook(), book.getNameOfTheAuthorOfTheBook()) &&
              Objects.equals(getISBNNumberOfTheBook(), book.getISBNNumberOfTheBook());
   }

   @Override
   public int hashCode() {
      return Objects.hash(getFullNameOfTheBook(), getNameOfTheAuthorOfTheBook(), getISBNNumberOfTheBook());
   }





}

