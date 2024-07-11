import java.util.ArrayList;
import java.util.Random;

public class LargestRowsAndColumns {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter the array size n: ");
        int n = input.nextInt();

        int[][] matrix = generateRandomMatrix(n);
        printMatrix(matrix);

        ArrayList<Integer> largestRows = new ArrayList<>();
        ArrayList<Integer> largestColumns = new ArrayList<>();

        findLargestRowsAndColumns(matrix, largestRows, largestColumns);

        System.out.println("The largest row index: " + largestRows);
        System.out.println("The largest column index: " + largestColumns);

        input.close();
    }

    public static int[][] generateRandomMatrix(int n) {
        int[][] matrix = new int[n][n];
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rand.nextInt(2); // Generates either 0 or 1
            }
        }

        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        System.out.println("The random array is");

        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.print(cell);
            }
            System.out.println();
        }
    }

    public static void findLargestRowsAndColumns(int[][] matrix, ArrayList<Integer> largestRows,
            ArrayList<Integer> largestColumns) {
        int maxOnesInRow = 0;
        int maxOnesInCol = 0;

        for (int i = 0; i < matrix.length; i++) {
            int countRow = 0;
            int countCol = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    countRow++;
                }
                if (matrix[j][i] == 1) {
                    countCol++;
                }
            }
            if (countRow > maxOnesInRow) {
                maxOnesInRow = countRow;
                largestRows.clear();
                largestRows.add(i);
            } else if (countRow == maxOnesInRow) {
                largestRows.add(i);
            }

            if (countCol > maxOnesInCol) {
                maxOnesInCol = countCol;
                largestColumns.clear();
                largestColumns.add(i);
            } else if (countCol == maxOnesInCol) {
                largestColumns.add(i);
            }
        }
    }
}
