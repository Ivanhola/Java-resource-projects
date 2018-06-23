
package recursionprogramexample;


public class RecursionProgramExample {

    
    public static void main(String[] args) {
        // Recursion is when a method repeats itself: think factorials 5 * 4*3*2*1
        System.out.println(fact(5));
        
    }
    //factorial method
    public static long fact(long n){
            if(n <= 1){             
                return 1;
                
            } else{
                return n * fact(n-1);
                  }          
            }
    
}
