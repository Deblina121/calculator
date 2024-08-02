package corejava;

import java.util.Scanner;

public class creditscore {

	public static void main(String[] args) {
		int n;
		System.out.println("enter the  number");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();

		if (n < 400 || n > 600) {
			System.out.println("Silver card");

		} else if (n < 600 || n > 800) {
			System.out.println("Gold card ");

		} else if (n < 800 || n > 850) {
			System.out.println("platinum card");
		}
		s.close();

	}

}
