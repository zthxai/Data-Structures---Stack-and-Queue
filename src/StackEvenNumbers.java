import java.util.Scanner;
import java.util.Stack;

public class StackEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> evenNumbStack = new Stack<>();

        System.out.println("Enter 10 even numbers:");

        for (int i = 0; i < 10; i++){
            int inputNumber;
            do {
                System.out.print("Enter even number " + (i + 1) + ": ");
                inputNumber = scanner.nextInt();
            } while (inputNumber % 2 != 0);

            evenNumbStack.push(inputNumber);
        }

        System.out.println("\nFirst entered even number: " + evenNumbStack.firstElement());

        scanner.close();

    }
}    