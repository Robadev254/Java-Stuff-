import java.util.ArrayList;
import java.util.Scanner;

public class LargestNumberCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter numbers: ");
        int number;
        while ((number = input.nextInt()) != 0) {
            numbers.add(number);
        }
        if (numbers.isEmpty()) {
            System.out.println("No numbers were entered.");
            input.close();
            return;
        }
        int max = numbers.get(0);
        int count = 1;
        for (int i = 1; i < numbers.size(); i++) {
            int currentNumber = numbers.get(i);

            if (currentNumber > max) {
                max = currentNumber;
                count = 1;
            } else if (currentNumber == max) {
                count++;
            }
        }
        System.out.println("The largest number is " + max);
        System.out.println("The occurrence count of the largest number is " + count);

        input.close();
    }
}
