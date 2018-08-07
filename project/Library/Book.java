
/**
 * Write a description of class Book here.
 * 
 * @author (Valentine Shidlovskiy) 
 * @version (a version number or a date)
 */
public class Book
{
    
    private String Author;
    private String Title;
    private String ISBN;
    private boolean inStock;
    private String BorrowName;
    //constructors for Book Objects
    public Book(){
        Author = null;
        Title = null;
        ISBN = null;
        inStock = false;
        BorrowName = null;
    }
    
    public Book(String BookAuth, String BookTitle, String I){
        Author = BookAuth;
        Title = BookTitle;
        ISBN = I;
        inStock = false;
        BorrowName = null;
    }
    //Accessor and mutator methods
    public String getAuthor(){
        return Author;
    }
    
    public String getTitle(){
        return Title;
    }
    
    public String getISBN(){
        return ISBN;
    }
    
    public boolean getInStock(){
        if(BorrowName != null){
            inStock = false;
        }
        else {
            inStock = true;}
        return inStock;    
    }
    
    public void setBorrowName(String newBName){
        if (newBName == "None"){
            BorrowName = null;
        }
        else {
            BorrowName = newBName;
        }
        
    }
    
    public String getBorrowName(){
        return BorrowName;
    }
}


