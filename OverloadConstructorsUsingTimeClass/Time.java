
package overloadconstructorsusingtimeclass;


public class Time {
    private int hour;
    private int minute;
    private int second;
    
    public Time(){ //if a user creates an object without argument 
        this(0,0,0);
    }
    
    public Time(int h){ //if a user creates an object with one argument calls this constructor then goes to the next
        this(h,0,0);
    }
    
    public Time(int h, int m){ //if user creates an object with two parameters then goes to the next
        this(h,m,0);
    }
    
    public Time(int h, int m, int s){ //constructor used to set the time executes if has 3 parameters
        setTime(h,m,s);
    }
    
    public void setTime(int h, int m, int s){ //time set, to display each
        setHour(h);
        setMinute(m);
        setSecond(s);
        
    }
    
    public void setHour(int h){ //hour setter
        hour = ((h>=0 && h<24)? h: 0 ); //if hour is >0 and <24 use hour else use 0
    }
    
    public void setMinute(int m){ //minute setter
        minute = ((m>=0 && m<60)? m: 0 ); //if hour is >0 and <24 use hour else use 0
    }
      public void setSecond(int s){ //second setter
        second = ((s>=0 && s<60)? s: 0 ); //if hour is >0 and <24 use hour else use 0
    }
      
      public int getHour(){ //hour getter
          return hour;
      }
      
      public int getMinute(){ //minute getter
          return minute;
      }
      
      public int getSecond(){ //second getter
          return second;
      }
      
      public String toMilitary(){ //our "display"
          return String.format("%02d:%02d:%02d", getHour(),getMinute(), getSecond()); //gets the hour, minute, and second, and outputs it in that format
          
      }
}
