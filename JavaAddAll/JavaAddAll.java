
package javaaddall;
import java.util.*;


public class JavaAddAll {

    public static void main(String[] args) {
   //create an array of strings
   
   String[] list = {"banana", "food", "soda", "apple"};
   List<String> listFood = Arrays.asList(list); //convert array to list
   
   ArrayList<String> list2  = new ArrayList<String>();
   list2.add("Youtube");
   list2.add("Google");
   list2.add("Twitch");
   
   for(String x : list2)
       System.out.printf("%s ", x);
   //add everything in list array into the list2 array
   Collections.addAll(list2, list);
   
   System.out.println();
   //prints out our added and modified list 2
 for(String x : list2)
       System.out.printf("%s ", x);
 
 //check how many instances of "Twitch" there are in the list
 System.out.println(Collections.frequency(list2, "Twitch"));
   
   
 //check if they have elements in common, if they do, will return false
 boolean tof = Collections.disjoint(listFood, list2);
 System.out.println(tof);
 
 //will output something if it is true or false
 if(tof){
     System.out.println("These list do not have anything in common");
 }else{
          System.out.println("These list do have something in common");

 }
 
    }
    
}
