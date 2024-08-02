package corejava;

import java.util.Scanner;

public class positivenegetive {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of elements in the array: ");
		int n = scanner.nextInt();

		int a[] = new int[n];

		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}

		int positiveSum = 0;
		int negativeSum = 0;

		for (int i = 0; i < n; i++) {
			if (a[i] > 0) {
				positiveSum += a[i];
			} else if (a[i] < 0) {
				negativeSum += a[i];
			}
		}

		System.out.println("Sum of positive numbers: " + positiveSum);
		System.out.println("Sum of negative numbers: " + negativeSum);

		scanner.close();
	}
}
