
package variablelengtharguments;


public class VariableLengthArguments {

    public static void main(String[] args) {
       System.out.println(average(10,29,32,23,23)); //takes in all these arguments, and outputs the average
    }
    
    public static int average(int...numbers){ //when you dont know how many arguments in the parameters, put ...
        int total = 0;
        for(int x:numbers){
            total = total + x;
             }
        return total/numbers.length;
    }
    
}
