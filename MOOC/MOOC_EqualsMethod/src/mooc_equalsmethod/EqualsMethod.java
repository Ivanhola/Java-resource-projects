package mooc_equalsmethod;

import java.util.Scanner;

/**
 *
 * @author Ivans
 */
public class EqualsMethod {

     /*The equals method is used to compare 2 objects. It is primarily used to compare strings,
    however it can be used to compare other types of objects.*/
    
 
    public static void main(String[] args) {
    
        
        
    /*    START OF EXAMPLE 1
    String thePassword = "password";
    //Simple example of using the equals method
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter a password: ");
    String password = keyboard.nextLine();
    
    if(password.equals(thePassword)){
        System.out.println("Correct password!");
    }else{
        System.out.println("Incorrect password try again");
    }
        
        //output: (if password == 'password') Correct password!
        //output: (if password != 'password') Incorrect password try again
        
          END OF EXAMPLE 1 (DELETE COMMENTS TO RUN EXAMPLE)*/
    
    
    
    Book bookObject = new Book("Test title" , 2001);
    Book anotherBookObject = bookObject;
    
    //this if statement will return the same books
    if(bookObject.equals(anotherBookObject)){
        System.out.println("These books are the same");
    }else{
        System.out.println("These books are not the same");
    }
    
    //create another book object with the same title and year
    anotherBookObject = new Book("Test title" , 2001);
    
    
    if(bookObject.equals(anotherBookObject)){
        System.out.println("These books are the same");
    }else{
        System.out.println("These books are not the same");
    }
    
    //output: First if-statment will return "These books are the same!"
    //output: Second if-statment will return "These books are not the same"
    
    
    /*
    although both objects have the same values they do not equal to each other(not the identical object).
    Seeing that even though the books have the same contents, we must create an equals method in our Book class
    in order to compare the variables and see if they match
    */
    
    Book testBook = new Book("test", 2000);
    Book testBook2 = new Book("test", 2000);
    if(testBook.equals(testBook2)){
        System.out.println("These books are the same!");
                
    }else {
        System.out.println("These books are not the same");
    }
    
    
    
    
    }
    
    
   
}
