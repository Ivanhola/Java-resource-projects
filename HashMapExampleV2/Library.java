
package hashmapexample;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Ivan
 */
public class Library {
    //HashMap Variable, private, null value(uninitialized)
    private HashMap<String, Book> collection;
    
    
    //constructor that initializes our HashMap collection variable
    public Library(){
        this.collection = new HashMap<String, Book>();
    }
    
     //get book method, searches for a book with the book name, and returns a Book object value
    public Book getBook(String bookName){
        bookName = stringCleaner(bookName);
        return this.collection.get(bookName);
    }
    
    //addBook method. takes in a book, checks to see if the book is in the collection already, if it is, will return, if not will add book
    public void addBook(Book book){
        //calls our stringCleaner method
     String name = stringCleaner(book.getName());
     if(this.collection.containsKey(name)){
         System.out.println("The book is already in the library!");
        }// end of if statement
     else {
         collection.put(name, book);
        }//end of else statement
     
    }//  end of addBook method
    
    
    
    //removeBook method, takes in a string value (book name) and if it matches a book in the library, it will remove it
    public void removeBook(String bookName){
        
        //calls our stringCleaner method,
        bookName = stringCleaner(bookName);
        //if our collection object contains the bookname Key, it will remove it from our collection hashMap object
        if(this.collection.containsKey(bookName)){
            this.collection.remove(bookName);
        } else{
            System.out.println("The book was not found");
        }
        
    }
    
    //stringCleaner method, takes our String and makes it lowercase so that we have some consistency, and less issues finding a book if its been misspelled
    //due to capitilazation of words
    public String stringCleaner(String string){
        if(string == null){
            return "";
        }
        
        string = string.toLowerCase();
        //trim method returns a string  without any leading spaces
        return string.trim();
    
        
        
    }
    
    
    //this method will create a list of our books in our library, 
    public ArrayList<Book> bookList(){
        //the values method returns a set of books in our library class, which can  be used  as a parameter to a constructor of an arrayList class.
            return new ArrayList<Book>(this.collection.values());
        }
   
    
    
}
