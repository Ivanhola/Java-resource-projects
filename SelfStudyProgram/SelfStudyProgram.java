
package selfstudyprogram;
import java.util.*;



public class SelfStudyProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        person person = new person();
        person person2 = new person();
        person person3 = new person("dave"); //using our other constructor our persons default name is dave
        
        String myobjname = input.next();
        String myobjname2 = input.next();
        String myobjname3 = input.next();
        
        person.name = myobjname;
        person.age = 4;
        person2.name = myobjname2;
        person3.name = myobjname3; //our "dave" is now named our obj3
        
        
        System.out.println("person is: " + person.name);
        System.out.println("person is: " + person.age);
        System.out.println("person2 is: " + person2.name);
         System.out.println("person3 is: " + person3.name);
        /*
        Scanner input = new Scanner(System.in);
        int what;
        what = input.nextInt();
        int number = add(what);
        
        System.out.println(number);

*/
    }
    /*
    //simple method
        public static int add(int num){
            Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        num += number;
        return num;
    }
*/
    //person class
     public static class person{
    
         public String name;
         private int age;
         //default constructor
         public person(){
             this.name = name;
             this.age = age;
         }
         
         public person(String name){
             this.name = name;
         }
}
    
}
