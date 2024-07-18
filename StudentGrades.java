import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        int[] scores = new int[numberOfStudents];
        System.out.print("Enter " + numberOfStudents + " scores: ");
        for (int i = 0; i < numberOfStudents; i++) {
            scores[i] = input.nextInt();
        }
        int best = findBestScore(scores);
        for (int i = 0; i < numberOfStudents; i++) {
            char grade = getGrade(scores[i], best);
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grade);
        }

        input.close();
    }
    public static int findBestScore(int[] scores) {
        int best = scores[0];
        for (int score : scores) {
            if (score > best) {
                best = score;
            }
        }
        return best;
    }
    public static char getGrade(int score, int best) {
        if (score >= best - 10) {
            return 'A';
        } else if (score >= best - 20) {
            return 'B';
        } else if (score >= best - 30) {
            return 'C';
        } else if (score >= best - 40) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
