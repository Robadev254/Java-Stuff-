import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class GenerateAndTestTriangle {
    public static void main(String[] args) {
        try {
            // Step 1: Create a text file called sides.txt with three randomly generated integers
            createSidesFile();

            // Step 2: Input three integers from sides.txt file
            Scanner scanner = new Scanner(new File("sides.txt"));
            double side1 = scanner.nextDouble();
            double side2 = scanner.nextDouble();
            double side3 = scanner.nextDouble();

            // Step 3: Try block to create a new Triangle object
            try {
                Triangle triangle = new Triangle(side1, side2, side3);
                System.out.println("Triangle created successfully: " + triangle);
            } catch (IllegalTriangleException e) {
                // Step 4: Catch block to handle IllegalTriangleException
                System.out.println("IllegalTriangleException: The triangle cannot be created.");
            }

        } catch (IOException e) {
            System.out.println("Error creating sides.txt file: " + e.getMessage());
        }
    }

    // Helper method to create sides.txt with three randomly generated integers
    private static void createSidesFile() throws IOException {
        try (FileWriter writer = new FileWriter("sides.txt")) {
            Random random = new Random();
            for (int i = 0; i < 3; i++) {
                int randomNumber = random.nextInt(10) + 1; // Generates random integer between 1 and 10
                writer.write(Integer.toString(randomNumber) + " ");
            }
        }
    }
}
