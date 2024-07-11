import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RandomIntegersFileIO {
    public static void main(String[] args) {
        File file = new File("Exercise12_15.txt");

        try {
            writeRandomIntegersToFile(file, 100);
            List<Integer> integers = readIntegersFromFile(file);
            Collections.sort(integers);
            System.out.println("Integers in increasing order:");
            for (int num : integers) {
                System.out.print(num + " ");
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    private static void writeRandomIntegersToFile(File file, int count) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        Random random = new Random();
        for (int i = 0; i < count; i++) {
            int randomInt = random.nextInt(1000); 
            bufferedWriter.write(randomInt + " ");
        }

        bufferedWriter.close();
    }

    private static List<Integer> readIntegersFromFile(File file) throws IOException {
        List<Integer> integers = new ArrayList<>();

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = bufferedReader.readLine();
        String[] numbers = line.split(" ");
        for (String number : numbers) {
            integers.add(Integer.parseInt(number));
        }

        bufferedReader.close();

        return integers;
    }
}
