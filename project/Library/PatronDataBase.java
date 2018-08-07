
/**
 * Write a description of class PatronDataBase here.
 * 
 * @author (Valentine Shidlovskiy)
 * @version (a version number or a date)
 */
import java.util.*;
public class PatronDataBase//This class is used to store a database of all the Patron
{
   private Patron [] dataBase2 = new Patron[10]; 
   public PatronDataBase(){
       //Instantiates Patron objects
       Patron p1 = new Patron("Douglas LaMotta", "455361835");
       Patron p2 = new Patron("William Bonner", "468465712");
       Patron p3 = new Patron("Richard Grzelewski", "499905689");
       Patron p4 = new Patron("John Smith", "493958775");
       Patron p5 = new Patron("Ted Butler", "431992989");
       Patron p6 = new Patron("Deborah Bosco", "486377951");
       Patron p7 = new Patron("John Flynn", "458422301");
       Patron p8 = new Patron("Frantzen Kate", "484860858");
       Patron p9 = new Patron("Jessica Goldberg", "468931079");
       Patron p10 = new Patron ("Christina Williams", "463914607");
       //stores the patron objects in an array
       dataBase2[0] = p1;
       dataBase2[1] = p2;
       dataBase2[2] = p3;
       dataBase2[3] = p4;
       dataBase2[4] = p5;
       dataBase2[5] = p6;
       dataBase2[6] = p7;
       dataBase2[7] = p8;
       dataBase2[8] = p9;
       dataBase2[9] = p10;
       
    }
   //used to access the information in the database
   public Patron getPatronDataBase(int n){
       return dataBase2[n];
    }
}
