
package hashsetexample;
import java.util.*;

public class HashSetExample {

    public static void main(String[] args) {
String[] things = {"soda", "ivan", "ham" , "ivan", "bacon"};

List<String> list = Arrays.asList(things);

System.out.printf("%s ", list);
System.out.println();


//useHasSet to remove duplicate items in our list going to create a list and remove any duplicates in the list

Set<String> set = new HashSet<String>(list);
System.out.printf("%s ", set);




        }
    
}
