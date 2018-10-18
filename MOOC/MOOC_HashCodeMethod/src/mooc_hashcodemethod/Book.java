
package mooc_hashcodemethod;

/**
 *
 * @author Ivans
 */
public class Book {
    /*Variables*/
    private String name;
    private int publicationYear;
    
    
    /*Constructor That will take in a string for our book name, and an int for our publication year*/
    public Book(String name, int publicationYear){
        this.name = name;
        this.publicationYear = publicationYear;
    }

    
    /*Getters amd Setters*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    /*toString Method to return our current object*/
    @Override
    public String toString() {
        return "Book: " + name + " (" + publicationYear + ")";
    }
    
    /*equals Method for our object*/
    
    @Override
    public boolean equals(Object obj){
        //if our object passed in is null, return false
        if(obj == null){
            return false;
        }
        //if our object passed in is not the same class, return false
        
        if(this.getClass() != obj.getClass()){
            return false;
        }
        
        /*Type casting is possible because we know two objects are the same type. If they are different type, 
        the above getClass method returns false. Let us change the Object parameter received with the equals method into 
        Book type, and let us identify two different books against their publishing year. The books are otherwise the same. */
        Book compared = (Book) obj;
        
        // if the book object passed in is not the same as the object books passed in, they are not the same returns false
        if(this.publicationYear != compared.getPublicationYear()){
            return false;
        }
        //now we want to check if the books names are the same when compared
        if(this.name == null || !this.name.equals(compared.getName())){
            return false;
        }
        
        //else return true
        return true;
    }
    
    
    /*If name is null, it will return a NullPointerException, we need to set a condition*/
        @Override
    public int hashCode(){
        if(this.name == null){
            return 7;
        }
        
        /*We can make it more accurate if we compare the publishing Year when returning our HashCode calculation*/
        return this.publicationYear + this.name.hashCode();
    }
    
}
