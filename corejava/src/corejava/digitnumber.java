package corejava;

import java.util.Scanner;

public class digitnumber {

	public static void main(String[] args) {
		System.out.println("enter the total elements:");
		Scanner s = new Scanner(System.in);
		int digit, num = s.nextInt();
		while (num != 0) {
			digit = num % 10;
			System.out.println(" " + digit);
			num = num / 10;
		}
		s.close();
	}
}