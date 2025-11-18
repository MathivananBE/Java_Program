package com;

public class PrimeNumber {

	public static boolean IsPrime(int num) {
		if (num <= 1) {
			return false;
		} else {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					return false;
				}

			}
			return true;
		}
	}

	public static void main(String[] args) {

		if (IsPrime(3)) {
			System.out.println("It is prime");
		} else {
			System.out.println("Not a Prime");
		}

	}
}