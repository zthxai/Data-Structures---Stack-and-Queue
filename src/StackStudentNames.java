import java.util.Scanner;
import java.util.Stack;

public class StackStudentNames {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> studentNamesStack = new Stack<>();

        System.out.println("Enter names of 10 students:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter name for student " + (i + 1) + ": ");
            String studentName = scanner.nextLine();
            studentNamesStack.push(studentName);
        }

        System.out.println("\nLast entered student name from the stack: " + studentNamesStack.peek());

        scanner.close();
    }
}