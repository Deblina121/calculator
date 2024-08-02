package corejava;

import java.util.Scanner;

public class sumofdigit {

	public static void main(String[] args) {
		System.out.println("enter the total elements:");
		Scanner s = new Scanner(System.in);
		int digit, num = s.nextInt();
		int sum = 0;
		while (num != 0) {
			digit = num % 10;
			sum = sum + digit;
			num = num / 10;
		}
		System.out.println("sum of digit" + sum);
		s.close();
	}

}
