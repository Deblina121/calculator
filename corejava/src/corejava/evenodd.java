package corejava;

import java.util.Scanner;

public class evenodd {

	public static void main(String[] args) {
		int n;
		System.out.println("enter the total elements:");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter all the elements:");
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}

		System.out.print("odd number");
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 != 0) {
				System.out.print(a[i] + " ");
			}
		}
		System.out.println("");
		System.out.print("Even numbers:");
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0) {
				System.out.print(a[i] + " ");
			}
		}
		s.close();
	}
}
