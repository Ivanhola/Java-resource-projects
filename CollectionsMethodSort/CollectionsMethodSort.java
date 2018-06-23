
package collectionsmethodsort;
import java.util.*;
/*
Collections Methods using lists
*/

public class CollectionsMethodSort {
    public static void main(String[] args) {
String[] stuff = {"league", "string", "keyboard", "bacon", "youtube"}; //create a string array
List<String> list1 = Arrays.asList(stuff); //turn the array into a list, fill list elements with array

Collections.sort(list1); //sorts our list into alphabetical order
System.out.printf("%s\n", list1); 

Collections.sort(list1, Collections.reverseOrder()); //takes the list1 sort and sorts it in revers
System.out.printf("%s\n", list1); 



    }
    
}
