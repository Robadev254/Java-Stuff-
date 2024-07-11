import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class WebScoresProcessor {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://liveexample.pearsoncmg.com/data/Scores.txt");

            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            List<Integer> scores = new ArrayList<>();

            while ((line = reader.readLine()) != null) {
                String[] scoreStrings = line.trim().split("\\s+");
                for (String scoreStr : scoreStrings) {
                    scores.add(Integer.parseInt(scoreStr));
                }
            }
            reader.close();

            int total = 0;
            for (int score : scores) {
                total += score;
            }
            double average = (double) total / scores.size();

            System.out.println("Total: " + total);
            System.out.println("Average: " + average);
        } catch (IOException e) {
            System.out.println("Error reading from the URL: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error parsing scores: " + e.getMessage());
        }
    }
}
