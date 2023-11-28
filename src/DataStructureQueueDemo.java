import java.util.LinkedList;
import java.util.Queue;

public class DataStructureQueueDemo {
    public static void main(String[] args) {

        /* We cannot create an instance of a Queue
         * as it is an interface, we can create
         * an instance of LinkedList or PriorityQueue
         * and assign it to Queue
         */

        Queue<String> q = new LinkedList<>();

        // Adding elements to the Queue
        q.add("Marygin");
        q.add("Sammy");
        q.add("Christian");
        q.add("Christine");
        q.add("Christie");
        System.out.println("Elements in Queue: " + q);

        /* We can remove an element from Queue
         * using remove() method, this would
         * remove the first element from the
         * Queue
         */

        System.out.println("Removed Element: " + q.remove());

        /* element() method - this returns the head
         * of the Queue. Head is the first element
         * of Queue
        */

        System.out.println("Head: " + q.element());

        /* poll() method - this removes and returns
         * the head of the Queue. Returns null if the Queue
         * is empty
         */

         System.out.println("poll(): " + q.poll());

         /* peek() method - it works the same as element()
          * method; however, it returns null if the Queue
          * is empty
          */

        System.out.println("peek(): " + q.peek());

        // Again displaying the elements of Queue

        System.out.println("Elements in Queue: " + q);
    }
}