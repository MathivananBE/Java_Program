package com;

public class GcdOfTwoNumber {
	public static int findGCD(int a, int b) {
		if (b == 0)
			return a;
		return findGCD(b, a % b);      //using Euclidean Algorithm
	}

	
	public static void main(String[] args) {
		int num1 = 8, num2 = 16;
		System.out.println("GCD of " + num1 + " and " + num2 + " is: " + findGCD(num1, num2));
	}
}
