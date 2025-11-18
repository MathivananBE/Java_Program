package com;

import java.util.Scanner;

public class FactorialWithoutLoop {
	static int fact = 1;

	public static int fact(int a) {
		if (a >= 2) {
			fact = fact * a;
			a--;
			fact(a);
		}
		return fact;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int a = scan.nextInt();

		int res = fact(a);
		System.out.println(res);
	}
}
