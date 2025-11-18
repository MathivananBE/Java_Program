package com;

public class FactorialNumber {

	public static void main(String[] args) {
		int num = 5;
		int total = 1;

		for (int i = 1; i <= num; i++) {
			total = total * i;

		}
		System.out.println(total);
	}
}
