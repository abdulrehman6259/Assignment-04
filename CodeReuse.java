import java.util.Arrays;
import java.util.Scanner;

public class CodeReuse {
    CodeReuse() {
    }

    public void sortAscending() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] userNumbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            userNumbers[i] = scanner.nextInt();
        }
        Arrays.sort(userNumbers);
        System.out.print("Ascending Order: ");
        for (int i = 0; i < userNumbers.length; i++) {
            System.out.print(userNumbers[i]);
            if (i < userNumbers.length - 1) {
                System.out.print(" ");
            }
        }
    }

    public void calculateStats() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        double[] stats = calculateStats(numbers);
        if (stats[0] != Double.MIN_VALUE) {
            System.out.println("Max: " + stats[0]);
            System.out.println("Min: " + stats[1]);
            System.out.println("Average: " + stats[2]);
        } else {
            System.out.println("Cannot calculate stats for an empty or null array.");
        }
    }

    double[] calculateStats(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return new double[]{Double.MIN_VALUE, Double.MAX_VALUE, Double.NaN};
        }
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            max = Math.max(max, num);
            min = Math.min(min, num);
            sum += num;
        }
        double average = sum / numbers.length;
        return new double[]{max, min, average};
    }

    public int[][] matrixAddition(int[][] matrixA, int[][] matrixB, int rows, int columns) {
        matrixA = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        matrixB = new int[][]{{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        rows = 3;
        columns = 3;

        int[][] resultMatrix = matrixAddition(matrixA, matrixB, rows, columns);

        System.out.println("Matrix A:");
        printMatrix(matrixA);
        System.out.println("Matrix B:");
        printMatrix(matrixB);
        System.out.println("Resultant Matrix:");
        printMatrix(resultMatrix);
        resultMatrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return resultMatrix;
    }
    void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}