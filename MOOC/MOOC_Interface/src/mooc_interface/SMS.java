
package mooc_interface;

/**
 *
 * @author Ivans
 */

/*Because this class implements our Readable interface, we MUST define the method in our interace( read() )
 In this class, and tell the class what the method does*/
public class SMS implements Readable {
    private String sender;
    private String content;
   /*Constructor for our SMS Class*/
    public SMS(String sender, String content){
        this.sender = sender;
        this.content = content;
    }
    
    /*Getter for our sender variable*/
    public String getSender(){
        return this.sender;
    }
    
    /*This is the method defined in our Interface( Our interface does not tell this method what to do
    We tell the method what it does in this class) we MUST have this method in our class, other wise the interface
    cannot be implemented and does not exist*/
    public String read(){
        return this.content;
    }

    @Override
    public String toString() {
        return "SMS{" + "sender=" + sender + ", content=" + content + '}';
    }
    
    
    
}
