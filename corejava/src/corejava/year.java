package corejava;

import java.util.Scanner;

class year {

	public static void main(String[] args) {
		System.out.println("enter the  years:");
		Scanner s = new Scanner(System.in);
		int year = s.nextInt();

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("year is leapyear");

		} else {
			System.out.println("year is not leapyear");

		}
		s.close();
	}
}
