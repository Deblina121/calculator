package corejava;

import java.util.Scanner;

public class count {

	public static void main(String[] args) {
		System.out.println("enter the total elements:");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int count = 0;
		while (num != 0) {
			count++;
			num = num / 10;

		}
		System.out.println("digit" + count);
		s.close();
	}

}
