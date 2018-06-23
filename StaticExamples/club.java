
package staticexamples;


public class club {
    private String name;
    private String last;
    private static int members = 0; //output adds up with more objects
    //private int members = 0; output = 1
    //static variables allow it to be shared for the same object, for example, theres people in a club,
    //if theres 3 people, members gets added ivan + adrian = 2 members
    public club (String firstName, String lastName){
        name = firstName;
        last = lastName;
        members++;
        System.out.printf("Constructor for %s %s , members in the club: %d\n", firstName, lastName, members);
    }
    
   public String getFirst(){
       return name;
       
   }
   
   public String getLast(){
       return last;
       
   }
   
   public static int getMembers(){
       return members;
   }
    
}
