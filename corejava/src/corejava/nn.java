package corejava;

import java.util.Scanner;

public class nn {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the size of the matrix (n): ");
		int n = scanner.nextInt();

		int[][] matrix = new int[n][n];

		System.out.println("Enter the elements of the matrix:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}

		System.out.println("The matrix is:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		scanner.close();
	}
}
