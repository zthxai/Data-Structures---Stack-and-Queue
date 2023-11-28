import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueOddNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> oddNumbersQueue = new LinkedList<>();

        System.out.println("Enter 10 odd numbers:");

        for (int i = 0; i < 10; i++) {
            int inputNumber;
            do {
                System.out.print("Enter odd number " + (i + 1) + ": ");
                inputNumber = scanner.nextInt();
            } while (inputNumber % 2 == 0); 

            oddNumbersQueue.add(inputNumber);
        }

        System.out.println("\nQueue before removal: " + oddNumbersQueue);

        if (!oddNumbersQueue.isEmpty()) {
            oddNumbersQueue.poll();
        }

        if (!oddNumbersQueue.isEmpty()) {
            int lastElement = 0;
            for (int num : oddNumbersQueue) {
                lastElement = num;
            }
            oddNumbersQueue.remove(lastElement);
        }

        System.out.println("Queue after removal: " + oddNumbersQueue);

        scanner.close();
    }
}