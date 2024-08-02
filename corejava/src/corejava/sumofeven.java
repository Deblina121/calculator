package corejava;

import java.util.Scanner;

public class sumofeven {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of elements in the array: ");
		int size = scanner.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
		}

		int sum = 0;

		for (int i = 0; i < size; i++) {
			if (arr[i] % 2 == 0) {
				sum += arr[i];
			}
		}

		System.out.println("Sum of even numbers: " + sum);

		scanner.close();
	}
}
