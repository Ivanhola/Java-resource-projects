
package mooc_interface;

import java.util.ArrayList;

/**
 *
 * @author Ivans
 */
public class eBook implements Readable {
    /*Variables for our eBook class*/
    private String name;
    private ArrayList<String> pages;
    private int pageNumber;
    
    /*Constructor*/
    public eBook(String name, ArrayList<String> pages){
        this.name = name;
        this.pages = pages;
        this.pageNumber = 0;
    }
    
    public String getName(){
        return this.name;
    }
    /*Method for checking the size of our array(how many pages) returns an int value*/
    public int howManyPages(){
        return this.pages.size();
    }
    
    /*our read() method from our Interface, we MUST have this method in our class, and here we define what it does
    as we can see, the method does something completely different in this class than our SMS class, 
    yet it is the same method
    */
    public String read(){
        /*Gets the String in our index from the variable pageNumber(pages.get(pageNumber) is the index, and returns the string value
        then calls the method which adds a pageNumber, changing the index, and returning another string value*/
      String page = this.pages.get(this.pageNumber);
      nextPage();
      
        return page;  
    }
    
    /*go to our next page method*/
   private void nextPage(){
        //add a page number
        this.pageNumber = this.pageNumber + 1;
        /*If the current page number, divided by the size of our pages is == 0, set the page number == 0
        (In other words... if the page has no more pages to go through, it will end the search for next page, and return to 0)*/
        if(this.pageNumber % this.pages.size() == 0){
            this.pageNumber = 0;
        }
    }
}
