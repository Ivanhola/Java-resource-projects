
package overloadconstructorsusingtimeclass;


public class OverloadConstructorsUsingTimeClass {

  
    public static void main(String[] args) {
       Time time = new Time(); //using the constructor without arguments
       Time time2 = new Time(5); //looking at the constructor with 1 argument
       Time time3 = new Time(5,13); //looking at constructor with 2 arguments
       Time time4 = new Time(5,13,43); //looking at constructor with 3 arguments
       
       System.out.printf("%s\n", time.toMilitary()); //output: 00:00:00
       System.out.printf("%s\n", time2.toMilitary()); //output: 05:00:00
       System.out.printf("%s\n", time3.toMilitary()); //output: 05:13:00
       System.out.printf("%s\n", time4.toMilitary()); //output: 05:13:43
       
    }
    
}
