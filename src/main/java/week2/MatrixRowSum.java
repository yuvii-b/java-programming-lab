// Question 6 - Matrix Row Sum
package week2;

import java.util.Scanner;

// Question 6
public class MatrixRowSum {
    public static void main(String[] args) {
        System.out.println("Name: Yuvaraj B(2024503541) | Week2 | Question6 - Matrix Row Sum\n");

        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        int[] sum = new int[3];

        System.out.println("Enter elements for a 3x3 matrix: ");
        for(int row = 0; row < 3; ++row){
            System.out.print("Enter 3 numbers for row " + (row + 1) + ": ");
            for(int col = 0; col < 3; ++col){
                matrix[row][col] = scanner.nextInt();
                sum[row] += matrix[row][col];
            }
        }

        int maxSum = sum[0], maxRow = 1;
        System.out.println("\nSum of each row:");
        for (int row = 0; row < 3; ++row) {
            if(sum[row] > maxSum){
                maxSum = sum[row];
                maxRow = row + 1;
            }
            System.out.println("Row " + (row + 1) + " sum = " + sum[row]);
        }

        System.out.println("\nRow " + maxRow + " has the highest sum: " + maxSum);

    }
}
