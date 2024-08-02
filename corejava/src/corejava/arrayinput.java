package corejava;

import java.util.Scanner;

public class arrayinput {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number of elements");
		int n = s.nextInt();
		int arr[] = new int[n];
		System.out.println("eneter elements");
		for (int j = 0; j < arr.length; j++) {
			arr[j] = s.nextInt();
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.println("a[j]");
		}
		s.close();
	}

}
