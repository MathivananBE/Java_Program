package com;

import java.util.Scanner;

public class StringPallindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String:");
		String a = scan.next();

		String b = "";
		for (int i = 0; i < a.length(); i++) {
			b = a.charAt(i) + b;
		}

		if (a.equals(b)) {
			System.out.println("Given String is pallindrome");
		} else {
			System.out.println("Given String is NotPallindrome");
		}
	}

}
