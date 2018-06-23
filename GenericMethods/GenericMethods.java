
package genericmethods;
import java.util.*;
/*
Generic methods are a way that you can eliminate overloaded methods

*/
public class GenericMethods { 
    public static void main(String[] args) {
      
        //show examples of overloaded methods
        Integer[] array = {1,2,3,4};
        Character[] carray= {'i','v','a','n'};
        
        
        printME(array);
        printME(carray);
        
    }
    //generic methods have the <T> before the return type (void)
    public static <T> void printME(T[] x){
        for(T i: x) //T is the array
            System.out.printf("%s ",i);
        
        System.out.println();
        }
    
    
    
    }

    /*
    //overloaded methods
    public static void printME(Integer[] i){
        for(Integer x: i ){
            System.out.printf("%s ", x);
            
        }
        System.out.println();
    }
    
     public static void printME(Character[] i){
        for(Character x: i ){
            System.out.printf("%s ", x);
           
        }
        System.out.println();
    } 
    //the problem with having overloaded methods is that it only takes 2 types of variables INT and CHAR, 
     //in order to use more variables, you would have to make same method with diff variables
     //creating generic methods allows you to use all types with one method
*/
