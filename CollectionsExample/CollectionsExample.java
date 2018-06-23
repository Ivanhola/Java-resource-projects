
package collectionsexample;
import java.util.*;
/*
in this program we will create collection types of lists with strings, and we will create 2 lists
Our first list of strings will contain 4 strings, the second will have 2
the list will contain repeated strings, and our goal is to remove the repeated strings from the first list
IF it contains the same strings as in our second list

*/
public class CollectionsExample {
//collections is like an array, where it holds stuff, unlike an array it's dynamic
    public static void main(String[] args) {
     String[] things= {"eggs", "lasers", "hats", "pie"}; //array of strings named 'things'
     List<String> list1 = new ArrayList<String>(); //empty collection array named list1 
     
     //add array items  to list
     
     for(String x : things){ //adds everything in 'things' to x
        list1.add(x); //our list collection now has everything in 'things' so eggs lasers hats pie
     }
     
     //create another array of strings that has 2 of the same values as our first array
     String[] morethings = {"lasers", "hats"};
     List<String> list2 = new ArrayList<String>();
     
     for(String y : morethings){ //adds everything in 'morethings' to y
        list2.add(y); //our list now has everything in 'morethings' so eggs lasers hats pie
     }
     
     System.out.print("List1: "); //this for loop will iterate through our list, and print out each item in our collection list
     for(int i = 0;i<list1.size();i++){  //list1 for loop to iterate through the list
         System.out.printf("%s ", list1.get(i)); //gets the index of i
     }
    /* this for loop will iterate through our list, and print out each item in our collection list
     for(int i = 0;i<list2.size();i++){
         System.out.printf("%s ", list2.get(i));
     }
     */
     editList(list1, list2);
     System.out.println();
     System.out.print("List1(modified): ");
          for(int i = 0;i<list1.size();i++){  //list1 for loop to iterate through the list
         System.out.printf("%s ", list1.get(i)); //gets the index of i
     }
     
    }
    
    
    //this function will remove anything from list1 if it is in list 2
    public static void editList(Collection<String> firstList,Collection<String> secondList){
        Iterator<String> iterator = firstList.iterator(); //goes through each list item by item for list1
        
        while(iterator.hasNext()){ //if it has something next in the list
        if(secondList.contains(iterator.next())){ //if the item is in the list2 remove the item from list1 because 'it' is list1
            iterator.remove();
        } 
        
        }
    }
    
}
