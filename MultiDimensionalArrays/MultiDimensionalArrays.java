
package multidimensionalarrays;


public class MultiDimensionalArrays {

 
    public static void main(String[] args) {
 int firstArray[][] = {{8,9,10,11},{12,13,14,15}}; //2 rows
 int secondArray[][] = {{30,31,32,33},{43},{4,5,6}}; //3 rows
 
 System.out.println("This is the first array");
 display(firstArray); //calling the display method
 
 System.out.println("This is the second array");
 display(secondArray); //calling the display method for our second array
 
    }
    
    //create a method to display the array
    public static void display(int x[][]){ //takes in one parameter of a multidimensional array
        for(int row =0;row<x.length;row++){ //takes a row
            for(int column=0;column<x[row].length;column++){ //prints the row column
           System.out.print(x[row][column]+ "\t");
            }
        System.out.println(); //creates a new line at the end of the row
        }
        
    }
    
}
