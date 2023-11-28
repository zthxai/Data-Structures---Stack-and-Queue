import java.util.*;

public class StackDemoString {

    public static void main(String[] args) {
        // Creating an empty Stack
        Stack<String> stack = new Stack<String>();

        // Use add() method to add elements into the Stack
        stack.add("Welcome");
        stack.add("To");
        stack.add("Geeks");
        stack.add("4");
        stack.add("Geeks");

        // Displaying the Stack
        System.out.println("Stack: " + stack);

        // Displaying the last element
        System.out.println("The last elementt is: " + stack.lastElement());
    }
}