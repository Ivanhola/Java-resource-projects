package mooc_hashcodemethod;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Ivans
 */
public class EqualsMethod {

     /*The hashCode method takes an object and returns a numeric value,a hash value. 
    We need numeric values for instance when we use and object as HashMap keys*/
    
 
    public static void main(String[] args) {
    /*HashMap variable with a Book Key.*/
    HashMap<Book, String> loan = new HashMap<Book, String>();
    
    /*Book object*/
    Book bookObject = new Book("bookObject", 2000);
    
    /*Put our book object into our HashMap (Book, String) values*/
    loan.put(bookObject, "BookObject String");
    loan.put(new Book("NewTestBook", 2001), "New Test Book String value");
    
    /*this will call our toString method*/
    System.out.println(bookObject);
    
    /*this will call our hashmap, and call our Book object*/
    /*This will output "Test" which is our String value we input*/
    System.out.println(loan.get(bookObject));
    /*Same Value as our bookObject, will return the same String value
    Without our hashMap method in our Book class, both of the following Print methods will return null*/
    
    System.out.println(loan.get(new Book("bookObject", 2000)));
    /*calling other Book objects from our HashMap*/
    System.out.println(loan.get(new Book("NewTestBook", 2001)));
    
    
    
    /*We can find the loaner by searching against the same object which was given as HashMap key with the put method. 
    However, if our search item is the same book but a different object, we are not able to find its loaner and we are 
    retured with a null reference. This is again due to the default implementation of the hashCode method of Object class. 
    The default implementation creates an index based on the reference; 
    this means that different objects with the same content receive different hashCode method outputs, 
    and therefore it is not possible to find the right place of the object in the HashMap.*/
    
    
    
    
    }
    
    
   
}
