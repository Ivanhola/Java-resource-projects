
package timeclassexampleforclasses;


public class TimeClassExampleForClasses {

    public static void main(String[] args) {
        Time time = new Time();
        System.out.println(time.toMilitary());
        System.out.println(time.normalTime());
        time.setTime(13, 27, 6);
        System.out.println(time.toMilitary());
        
        time.setTime(13, 27, 4);
        System.out.println(time.normalTime());
    }
    

    
}
