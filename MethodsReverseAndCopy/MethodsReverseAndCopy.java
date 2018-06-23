
package methodsreverseandcopy;
import java.util.*;

public class MethodsReverseAndCopy {

    public static void main(String[] args) {
//create an array and convert it into a list

Character[] array = {'a', 'b', 'c'};
List<Character> list = Arrays.asList(array);
 System.out.println("List is: ");
 
 output(list);
 
 //reverse and print out the list
 
 Collections.reverse(list); //alters the list by reversing everything
 System.out.println("after the reverse: ");
 output(list);
 
 //going to need a copy method to copy the list
 
 //create a new array and a new list
 
 Character[] copyArray = new Character[array.length];
 
 List<Character> listCopy = Arrays.asList(copyArray); //blank list with 3 elements in it
 
 //copy contents of list to listCopy
 
 Collections.copy(listCopy, list); //takes everything from list to listCopy
 
 System.out.println("Copy of list: ");
 
 output(listCopy);
 
 /*take a collection and fill it with something that wasnt there before*/
 
 Collections.fill(list, 'X'); //will replace everything in list with X
 
 System.out.println("After filling the list");
 
 output(list); 
}
    
    //output method
    
    private static void output(List<Character> thelist){
        
        for(Character thing : thelist){
        System.out.printf("%s ", thing);
       
        }
         System.out.println();
    }
    
}