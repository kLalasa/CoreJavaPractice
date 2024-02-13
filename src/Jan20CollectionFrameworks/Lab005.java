package Jan20CollectionFrameworks;

import java.util.PriorityQueue;

public class Lab005 {
    public static void main(String[] args) {
        PriorityQueue<Integer>pq=new PriorityQueue<Integer>();
        pq.add(10);
        pq.add(15);
        pq.add(20);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.peek());
    }
}
