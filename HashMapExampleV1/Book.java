
package hashmapexample;

/**
 *
 * @author Ivan
 */
public class Book {
    //variables, private, going to need getters and setters
    private String name;
    private String content;
    private int publishingYear;

    
    //constructor
    public Book(String name, int publishingYear, String content){
        this.name = name;
        this.publishingYear = publishingYear;
        this.content = content;
    }
    
    
    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    
    //toString method
    @Override
    public String toString() {
        return "Book{" + "name=" + name + ", content=" + content + ", publishingYear=" + publishingYear + '}';
    }
    
    
    
    
    
    
    
}
