package com;

public class ArrayPairs {

	public static void pair(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				System.out.print("(" + a[i] + "," + a[j] + ")");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[] a = { 2, 1, 4, 5, 7 };
		pair(a);
	}
}
