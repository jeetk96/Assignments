package Chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class DistinctNumbers {

    public static void main(String[] args) {
        ArrayList<Integer> Numbers = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter integers (input ends with 0): ");
        int value;

        do {
            value = input.nextInt();

            if (!Numbers.contains(value) && value != 0) {
                Numbers.add(value);
            }
        } while (value != 0);
        System.out.print("The distinct numbers are: " + Numbers);
        for (int i: Numbers) {
            System.out.print(i + " ");
        }
    }
}
