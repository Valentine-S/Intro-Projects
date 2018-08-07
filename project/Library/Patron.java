
/**
 * Write a description of class Patron here.
 * 
 * @author (Valentine Shidlovskiy)
 * @version (a version number or a date)
 */
public class Patron
{    
    private String name;
    private String TitleA;
    private String TitleB;
    private String TitleC;
    private String ID;
    //constructors for Patron Objects
    public Patron(){
        name = null;
        ID = null;
        TitleA = null;
        TitleB = null;
        TitleC = null;
        
    }
    
    public Patron(String PatronName, String IDentify){
        name = PatronName;
        ID = IDentify;
        TitleA = null;
        TitleB = null;
        TitleC = null;
    }
    //Accessor and mutator methods
    public String getName(){
        return name;
    }
    
    public String getID(){
        return ID;
    }
    
    public String getTitleA(){
        return TitleA;
    }
    
    public String getTitleB(){
        return TitleB;
    }
    
    public String getTitleC(){
        return TitleC;
    }
    
    public void setTitleA(String NewTitleA){
        TitleA = NewTitleA;
    }
    
    public void setTitleB(String NewTitleB){
        TitleB = NewTitleB;
    }
    
    public void setTitleC(String NewTitleC){
        TitleC = NewTitleC;
    }
    
    public boolean checkForBook(String x){//checks if Book named "x" is in the possesion of the patron 
        if (TitleA.equals(x)){
            return true;
        }
        else if (TitleB.equals(x)){
            return true;
        }
        else if (TitleC.equals(x)){
            return true;
        }
        else {
            return false;
        }
    }
    } 
    


