
package hashmapexample;

import java.util.HashMap;

/**
 *
 * @author Ivan Llamas
 */
public class HashMapExample {

    public static void main(String[] args) {
        
        //call a HashMap with a string key, and a Book value
      HashMap<String, Book> bookCollection  = new HashMap<String, Book>();
      //creating 2 book objects from our Book.Java class
      Book miceAndMen = new Book("Of Mice and Men", 1937, "Test description for Of Mice and Men");
      Book animalFarm = new Book("Animal Farm", 1945, "Test description for Animal Farm");
      
      //adding the 2 book objects to our HashMap
      bookCollection.put(miceAndMen.getName() , miceAndMen);
      bookCollection.put(animalFarm.getName() , animalFarm);
      
      //create a book objectand set it equal to the hashMap key of "Persuasion"
      Book book  = bookCollection.get("Persuasion");
      //there is no hashMap key of "Persuasion" so it will return null
      System.out.println(book);
      System.out.println();
      
      book = bookCollection.get("Animal Farm");
      //prints out our book information based on our toString method
      System.out.println(book);
      
      //creating a library object
      Library library = new Library();
      //adding our current book to our library
      library.addBook(miceAndMen);
      //printing out the book in our library(miceandMen)
      
      System.out.println(library.getBook(miceAndMen.getName()));
      
      
      
      
      
    }
    
}
