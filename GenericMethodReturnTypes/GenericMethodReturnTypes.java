
package genericmethodreturntypes;
import java.util.*;

public class GenericMethodReturnTypes {

  
    public static void main(String[] args) {
        System.out.println(max(23, 42, 1));
        System.out.println(max("tots", "apple", "zebra")); //outputs zebra because Z has greatest value
    }
    //find a method that can use ints and strings, one that can do that is compareTo
    
    
    //T extends Comparable means that only objects that inherit from the comparable class can use the method
    public static <T extends Comparable<T>> T max(T a, T b, T c){ //T means returing the type of T data returning generic data of A B C
    T max = a; //assume that A is the greatest
    
    
    if(b.compareTo(a) > 0) //compares b to a , if b is greater than a max is b
        max = b;
    
    if(c.compareTo(max) > 0)
        max = c;
    
    return max;
    }
}
