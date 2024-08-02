package corejava;

import java.util.Scanner;

public class reverse {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = scanner.nextInt();

		int reversedNumber = 0;

		while (n != 0) {
			int digit = n % 10;
			reversedNumber = reversedNumber * 10 + digit;
			n /= 10;
		}

		System.out.println("Reversed number: " + reversedNumber);

		scanner.close();
	}
}
