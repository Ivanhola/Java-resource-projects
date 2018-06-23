
package stacksexample;
import java.util.*;
public class StacksExample {

   
    public static void main(String[] args) {
       //create an empty stack
        Stack<String> stack = new Stack<String>();
        stack.push("bottom"); //adds a string to our stack
        printStack(stack);
        stack.push("second"); 
        printStack(stack);
        stack.push("third"); 
        printStack(stack);
//example of removing an item
        stack.pop();
        printStack(stack);
        
        stack.pop();
        printStack(stack);
        
        stack.pop();
        printStack(stack);
    }
    //our output method
    private static void printStack(Stack<String> s){
        if(s.isEmpty()){
            System.out.println("Empty stack!");
        } else{
            System.out.printf("%s TOP\n", s); //S is our Stack
        }
    }
    
}
