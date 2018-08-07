
/**
 * Write a description of class Tester here.
 * 
 * @author (Valentine Shidlovskiy)
 * @version (a version number or a date)
 */
import java.util.*;

public class Tester
{
    public static void main (String []args){
        Scanner reader = new Scanner(System.in);
        BookDataBase Books = new BookDataBase();
        PatronDataBase Patrons = new PatronDataBase();
        int x = 1;
        int y = 1;
        int answer1;
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        int a9;
        String Patron;
        System.out.println("Hello, Please input the name of the Patron");
        Patron = reader.nextLine();
        //Prints out all the Books and Patrons 
        System.out.println("These are the Books that we have had at one point in time.");
        System.out.println("1."+Books.getBookDataBase(0).getTitle()+ " ||" + Books.getBookDataBase(0).getAuthor()+ "|| " + Books.getBookDataBase(0).getISBN() );
        System.out.println("2."+Books.getBookDataBase(1).getTitle()+ " ||" + Books.getBookDataBase(1).getAuthor()+ "|| " + Books.getBookDataBase(1).getISBN() );
        System.out.println("3."+Books.getBookDataBase(2).getTitle()+ " ||" + Books.getBookDataBase(2).getAuthor()+ "|| " + Books.getBookDataBase(2).getISBN() );
        System.out.println("4."+Books.getBookDataBase(3).getTitle()+ " ||" + Books.getBookDataBase(3).getAuthor()+ "|| " + Books.getBookDataBase(3).getISBN() );
        System.out.println("5."+Books.getBookDataBase(4).getTitle()+ " ||" + Books.getBookDataBase(4).getAuthor()+ "|| " + Books.getBookDataBase(4).getISBN() );
        System.out.println("6."+Books.getBookDataBase(5).getTitle()+ " ||" + Books.getBookDataBase(5).getAuthor()+ "|| " + Books.getBookDataBase(5).getISBN() );
        System.out.println("7."+Books.getBookDataBase(6).getTitle()+ " ||" + Books.getBookDataBase(6).getAuthor()+ "|| " + Books.getBookDataBase(6).getISBN() );
        System.out.println("8."+Books.getBookDataBase(7).getTitle()+ " ||" + Books.getBookDataBase(7).getAuthor()+ "|| " + Books.getBookDataBase(7).getISBN() );
        System.out.println("9."+Books.getBookDataBase(8).getTitle()+ " ||" + Books.getBookDataBase(8).getAuthor()+ "|| " + Books.getBookDataBase(8).getISBN() );
        System.out.println("10."+Books.getBookDataBase(9).getTitle()+ " ||" + Books.getBookDataBase(9).getAuthor()+ "|| " + Books.getBookDataBase(9).getISBN() );
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("This is a list of our Patrons");
        System.out.println("1."+Patrons.getPatronDataBase(0).getName()+ " ||" + Patrons.getPatronDataBase(0).getID());
        System.out.println("2."+Patrons.getPatronDataBase(1).getName()+ " ||" + Patrons.getPatronDataBase(1).getID());
        System.out.println("3."+Patrons.getPatronDataBase(2).getName()+ " ||" + Patrons.getPatronDataBase(2).getID());
        System.out.println("4."+Patrons.getPatronDataBase(3).getName()+ " ||" + Patrons.getPatronDataBase(3).getID());
        System.out.println("5."+Patrons.getPatronDataBase(4).getName()+ " ||" + Patrons.getPatronDataBase(4).getID());
        System.out.println("6."+Patrons.getPatronDataBase(5).getName()+ " ||" + Patrons.getPatronDataBase(5).getID());
        System.out.println("7."+Patrons.getPatronDataBase(6).getName()+ " ||" + Patrons.getPatronDataBase(6).getID());
        System.out.println("8."+Patrons.getPatronDataBase(7).getName()+ " ||" + Patrons.getPatronDataBase(7).getID());
        System.out.println("9."+Patrons.getPatronDataBase(8).getName()+ " ||" + Patrons.getPatronDataBase(8).getID());
        System.out.println("10."+Patrons.getPatronDataBase(9).getName()+ " ||" + Patrons.getPatronDataBase(9).getID());
        
        System.out.println("What would you like to do?(Use The numbers as your answer)");
        System.out.println("1. Search For a Book, 2. Search For a Patron, 3. Take out a Book, 4. Return a Book, 5. Exit");
        answer1 = reader.nextInt();
        reader.nextLine();
        while( x != 0){// 
            
            if(answer1 == 1){
                System.out.println("What Book would you like to search for?(Use the Number)");
                a2 = reader.nextInt();
                a2--;
                System.out.println(Books.getBookDataBase(a2).getTitle()+ "||" + Books.getBookDataBase(a2).getAuthor()+ "||" + Books.getBookDataBase(a2).getISBN());//Prints all the data about a certain book
                if ( Books.getBookDataBase(a2).getInStock() == true){
                      System.out.println("The Book is in Stock");
                }
                else{
                      System.out.println("The Book is being borrowed by " + Books.getBookDataBase(a2).getBorrowName());
                }
                   
                answer1 = -1; 
            }
            else if(answer1 == 2){
                System.out.println("What Patron would you like to search for?(Use the Number)");
                a3 = reader.nextInt();
                a3--;
                
                System.out.println(Patrons.getPatronDataBase(a3).getName()+"||"+ Patrons.getPatronDataBase(a3).getID());//Prints all the information about a certain Patron
                System.out.println("The First Book In Possesion is " + Patrons.getPatronDataBase(a3).getTitleA());
                System.out.println("The Second Book In Possesion is " + Patrons.getPatronDataBase(a3).getTitleB());
                System.out.println("The Third Book In Possesion is " + Patrons.getPatronDataBase(a3).getTitleC());
                answer1 = -1;
            }
            else if(answer1 == 3){
                System.out.println("What is the number of the Book you would like to Take out?");
                a4 = reader.nextInt();
                a4--;
                while(Books.getBookDataBase(a4).getInStock() == false){
                    System.out.println("That Book is already borrowed, Please select again.");
                    a4 = reader.nextInt();
                    a4--;
                }
                System.out.println("What is the number of the Patron Who is taking this book out?");
                a5 = reader.nextInt();
                a5--;
                System.out.println("Which Slot in the Patrons Cart is this book taking up?(There are 3)");
                a6 = reader.nextInt();
                if(a6 == 1 && Patrons.getPatronDataBase(a5).getTitleA() == null){
                    Patrons.getPatronDataBase(a5).setTitleA(Books.getBookDataBase(a4).getTitle());//sets the Title of the Patrons Book slot to the title of the book being taken up
                    Books.getBookDataBase(a4).setBorrowName(Patrons.getPatronDataBase(a5).getName());//sets the BorrowName of the Book to the name of the Patron
                }
                else if(a6 == 1 && Patrons.getPatronDataBase(a5).getTitleA() != null){
                    System.out.println("The First Slot is taken");
                    
                }
                
                if(a6 == 2 && Patrons.getPatronDataBase(a5).getTitleB() == null){
                    Patrons.getPatronDataBase(a5).setTitleB(Books.getBookDataBase(a4).getTitle());//sets the Title of the Patrons Book slot to the title of the book being taken up
                    Books.getBookDataBase(a4).setBorrowName(Patrons.getPatronDataBase(a5).getName());//sets the BorrowName of the Book to the name of the Patron
                }
                else if (a6 == 2 && Patrons.getPatronDataBase(a5).getTitleB() != null){
                    System.out.println("The Second Slot is taken");
                }
                
                if(a6 == 3 && Patrons.getPatronDataBase(a5).getTitleC() == null){
                    Patrons.getPatronDataBase(a5).setTitleC(Books.getBookDataBase(a4).getTitle());//sets the Title of the Patrons Book slot to the title of the book being taken up
                    Books.getBookDataBase(a4).setBorrowName(Patrons.getPatronDataBase(a5).getName());//sets the BorrowName of the Book to the name of the Patron
                }
                else if(a6 == 3 && Patrons.getPatronDataBase(a5).getTitleC() != null){
                    System.out.println("The Third Slot is taken");
                }
                answer1 = -1;
            }
            else if(answer1 == 4){
                
                System.out.println("What is the number of the Book you would like to Return out?");
                a7 = reader.nextInt();
                a7--;
                while(Books.getBookDataBase(a7).getInStock() != false){
                    System.out.println("That Book is not borrowed, Please select again.");
                    a7 = reader.nextInt();
                    a7--;
                }

                System.out.println("What is the number of the Patron Who is returning this book?");
                a8 = reader.nextInt();
                a8--;
                while (Patrons.getPatronDataBase(a8).checkForBook(Books.getBookDataBase(a7).getTitle()) == false){
                    System.out.println("This Patron does not Own this Book, Try again.");
                    a8 = reader.nextInt();
                    a8--;
                }
                
                System.out.println("Which Slot in the Patrons Cart is this book taking up?(There are 3)");
                a9 = reader.nextInt();
                
                if(a9 == 1 && Patrons.getPatronDataBase(a8).getTitleA() == Books.getBookDataBase(a7).getTitle()){
                    Patrons.getPatronDataBase(a8).setTitleA(null);//sets the title and BorrowName to Null
                    Books.getBookDataBase(a7).setBorrowName(null);
                }
                else if(a9 == 1 && Patrons.getPatronDataBase(a8).getTitleA() != Books.getBookDataBase(a7).getTitle()){
                    System.out.println("The Patron does not have the book in that slot");
                }
                
                if(a9 == 2 && Patrons.getPatronDataBase(a8).getTitleB() == Books.getBookDataBase(a7).getTitle()){
                    Patrons.getPatronDataBase(a8).setTitleA(null);//sets the title and BorrowName to Null
                    Books.getBookDataBase(a7).setBorrowName(null);
                }
                else if(a9 == 2 && Patrons.getPatronDataBase(a8).getTitleB() != Books.getBookDataBase(a7).getTitle()){
                    System.out.println("The Patron does not have the book in that slot");
                }
                
                if(a9 == 3 && Patrons.getPatronDataBase(a8).getTitleC() == Books.getBookDataBase(a7).getTitle()){
                    Patrons.getPatronDataBase(a8).setTitleA(null);//sets the title and BorrowName to Null
                    Books.getBookDataBase(a7).setBorrowName(null);
                }
                else if(a9 == 3 && Patrons.getPatronDataBase(a8).getTitleC() != Books.getBookDataBase(a7).getTitle()){
                    System.out.println("The Patron does not have the book in that slot");
                }
                answer1 = -1;
            }
            else if(answer1 == 5){
                x = 0;
            }
            else if(answer1 == -1){
                System.out.println("1. Search For a Book, 2. Search For a Patron, 3. Take out a Book, 4. Return a Book, 5. Exit");
                answer1 = reader.nextInt();
            }
            else {
                System.out.println("Please Choose a valid Answer");
            }
        }
    }
}
