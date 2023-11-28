import java.util.*;

public class StackDemoInteger {
    public static void main(String[] args) {
        // Creating an empty Stack
        Stack<Integer> stack = new Stack<Integer>();

        // Use add() method to add elements into the Stack
        stack.add(10);
        stack.add(15);
        stack.add(30);
        stack.add(20);
        stack.add(5);

        // Displaying the Stack
        System.out.println("Stack: " + stack);

        // Displaying the last element
        System.out.println("The last element is: " + stack.lastElement());
    }    
}