
package convertingliststoarrays;
import java.util.*;

public class ConvertingListstoArrays {

    public static void main(String[] args) {
      String[] stuff = {"random", "watermelon", "mouse" , "keyboard"};
      LinkedList<String> thelist = new LinkedList<String>(Arrays.asList(stuff)); //created a list containing the stuff in array
      
      
      thelist.add("idkrandom"); //add to list at the end
      thelist.addFirst("firstthing"); 
      
      //convert back to array, list is useful to add stuff and then we can convert
      stuff = thelist.toArray(new String[thelist.size()]); //converts list to array
      
      for(String x: stuff){
          System.out.printf("%s " , x);
      }
      
    }
    
}
