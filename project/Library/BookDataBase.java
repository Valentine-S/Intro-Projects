
/**
 * Write a description of class BookDataBase here.
 * 
 * @author (Valentine Shidlovskiy)
 * @version (a version number or a date)
 */
import java.util.*;
public class BookDataBase//This class is used to store a database of all the Books
{
    
   private Book [] dataBase = new Book[10];
   public BookDataBase(){
        //Instantiates Book objects
        Book b1 = new Book("F. Scott Fitzgerald", "The Great Gatsby","205668021");
        Book b2 = new Book("John Steinbeck", "The Grapes of Wrath","263829109");
        Book b3 = new Book("George Orwell", "1984","229635246");
        Book b4 = new Book("James Joyce", "Ulysses","260833447");
        Book b5 = new Book("J. D. Salinger", "The Catcher in the Rye","207985874");
        Book b6 = new Book("William Faulkner", "The Sound and the Fury","207985874");
        Book b7 = new Book("Harper Le", "To Kill a Mockingbird","207652485");
        Book b8 = new Book("J. R. R. Tolkien", "The Lord of the Rings","290367486");
        Book b9 = new Book("Aldous Huxley", "Brave New World","241000810");
        Book b10 = new Book("Charlotte Bronte", "Jane Eyre","208090314");
        //stores the book objects in an array
        dataBase[0] = b1;
        dataBase[1] = b2;
        dataBase[2] = b3;
        dataBase[3] = b4;
        dataBase[4] = b5;
        dataBase[5] = b6;
        dataBase[6] = b7;
        dataBase[7] = b8;
        dataBase[8] = b9;
        dataBase[9] = b10;
    }
    
    public Book getBookDataBase(int m){//used to access the information in the database
        return dataBase[m];
   }
   
}
