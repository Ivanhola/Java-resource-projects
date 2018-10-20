
package mooc_interface;

import java.util.ArrayList;

/**
 *
 * @author Ivans
 */
public class main {


    public static void main(String[] args) {
        /*Create an SMS object named message*/
       SMS message = new SMS("Ivan Llamas", "Hi Angela");
       /*This output will return our content variable in our object "Hi Angela"*/
       System.out.println(message.read());
       
       /*Create an array list of SMS objects*/
       ArrayList<SMS> messages = new ArrayList<SMS>();
       //add an SMS object to our messages arrayList
       messages.add(new SMS("Unknown", "I hid the body"));
       messages.add(new SMS("Unknownssss", "I hid the body"));
       /*Print out our 2nd index in our ArrayList*/
       System.out.println(messages.get(1));
       
       
       
       
       ArrayList<String> pages = new ArrayList<String>();
       pages.add("Idk This is our first page");
       pages.add("I am testing out our second page! hurray");
       pages.add("Third page may not be the best but its still a page");
       pages.add("Fourth isnt so bad. . . ");
       
       eBook ebook = new eBook ("Random Book", pages);
       /*for int page = 0, if page is less than the size of the array we passed in(pages), 
       increment the loop, will call the read() output for the size of our pages.*/
       for(int page = 0;page<ebook.howManyPages();page++){
           System.out.println(ebook.read());
       }
    }
    
}
