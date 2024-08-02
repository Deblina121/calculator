package corejava;

import java.util.Scanner;

public class duck {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		String number = scanner.nextLine();

		boolean startsWithZero = number.startsWith("0");

		boolean containsZero = number.contains("0");

		boolean isDuck = !startsWithZero && containsZero;

		if (isDuck) {
			System.out.println(number + " is a Duck number.");
		} else {
			System.out.println(number + " is not a Duck number.");
		}

		scanner.close();
	}
}
