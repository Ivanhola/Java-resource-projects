
package queuesexample;
import java.util.*;
public class QueuesExample {
/*
    Queues are like a line, whatever is set in line will be retained in a list. in this example "first" is our priority que in line
    */
    
    public static void main(String[] args) {
        PriorityQueue<String> q = new PriorityQueue<String>();
        
        //first queue is priority
        q.offer("first");
        q.offer("second");
        q.offer("third");

        System.out.printf("%s ", q);
        System.out.println();
        //will show which queue has priority
        System.out.printf("%s ", q.peek());
        System.out.println();
        //will remove our priority queue
        q.poll();
        System.out.printf("%s ", q);


    }
    
}
