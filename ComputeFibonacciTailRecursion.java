package is247;
import java.util.Scanner;

public class ComputeFibonacciTailRecursion {

    //The method for finding the Fibonacci number
    public static long fib(long index) {
        return fib(index, 1);
    }

    private static long fib(long index, long result) {
        if (index == 0) {
            return 0;
        } else if (index == 1) {
            return 1;
        } else {
            return fib(index - 1, result) + fib(index - 2);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an index for a Fibonacci number: ");
        int index = input.nextInt();

        // Find and display the Fibonacci number
        System.out.println("The Fibonacci number at index "
                + index + " is " + fib(index));
    }

}
