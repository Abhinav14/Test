package broCode.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListImplQueue {
    public static void main(String[] args) {
        Queue<String> strQueue = new LinkedList<>();
        strQueue.offer("Karen");
        strQueue.offer("Chad");
        strQueue.offer("Steve");
        strQueue.offer("Harold");

        //peek() will get you the first-in
       // System.out.println(strQueue.peek());
        //poll(): it will dequeue the element at zero-eth index
        /*strQueue.poll();
        strQueue.poll();
        strQueue.poll();
        strQueue.poll();*/
        System.out.println(strQueue.peek());
    }
}
