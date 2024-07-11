import java.util.Random;
import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {
        int[] randomArray = generateRandomArray(100);

        System.out.print("Enter the index of the array (0-99): ");
        try (Scanner scanner = new Scanner(System.in)) {
            int index = scanner.nextInt();

            if (index >= 0 && index < 100) {
                System.out.println("Element value at index " + index + ": " + randomArray[index]);
            } else {
                System.out.println("Out of Bounds");
            }
        }
    }

    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1000);
        }
        return array;
    }
}
