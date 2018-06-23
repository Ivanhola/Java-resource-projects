
package linkedlistexample;
import java.util.*;

public class LinkedListExample {

  
    public static void main(String[] args) {
    String[] randomThings = {"apples", "mouse", "eror","keyboard","mems"};
    List<String> list1 = new LinkedList<String>();
    
    for(String x : randomThings){
        list1.add(x);
    }
    
    String[] randomThings2 = {"sausage", "keyboard", "memes","harrypotter"};
    List<String> list2 = new LinkedList<String>();
    
    for(String y : randomThings2){ //add things from randomthings2 into y
        list2.add(y); //our list2 now has everything from y(things2)
    }
    
    list1.addAll(list2); //takes everything from list 2, and puts it into list1  so list 2 is same but list 1 is now changed
    list2 = null; //clears the list2 (now has nothing)
    printMe(list1);
    removeStuff(list1,2,5);
    printMe(list1);
    reversMe(list1);
    }
    
    //printMe Method
    private static void printMe(List<String> list){
        for(String b: list){ //this for loop will iterate through the array of "list" (Which is the parameter) and treat each element as String b 
        System.out.printf("%s ", b); //each item of the list will be printed as a string(%s)
    }
        System.out.println();  
    }
    
    //removeStuff method
    private static void removeStuff(List<String> list, int from, int to){ //will delete elements from the List<String> starting FROM, TO element (2, 5) in this case
     list.subList(from, to).clear(); //going to return a portion  from^ to    ^ and delete it
    }
    //reverseMe Method
    private static void reversMe(List<String> list){
            ListIterator<String> bobby = list.listIterator(list.size());
            while(bobby.hasPrevious()) //while it has something before it
                System.out.printf("%s ", bobby.previous()); //its going to print out the element one by one
            /*
            Create a list iterator in this case we called ours bobby, and bobby wil iterate our 'list' (list.listIterator) 
            (list is pulled from reversMe(List) argument)
            list.size() will get to the last element
            */
        
    }
    
    }
/*
NOTES: 
Our output with this program will look like this:

apples mouse eror keyboard mems sausage keyboard memes harrypotter 
apples mouse sausage keyboard memes harrypotter 
harrypotter memes keyboard sausage mouse apples

Output broken down:
apples mouse eror keyboard mems || sausage keyboard memes harrypotter //everything up to 'mems' is our ORIGINAL list, the list1.addAll() combines list2 to list1 adding sausage etc
apples mouse sausage keyboard memes harrypotter //removeStuff(list1,2,5); removes stuff from 2 to 5 removing 3 things "eror keyboard mems"
harrypotter memes keyboard sausage mouse apples //reversMe takes our list1, and reverses the elements going from harrypotter, and puts harrypotter first and apples last.
*/