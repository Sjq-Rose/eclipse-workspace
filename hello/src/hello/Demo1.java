package hello;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		int n;
		int fact = 1;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}
}