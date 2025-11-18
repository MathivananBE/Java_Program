package com;

import java.util.Arrays;

public class ArrayMultipleWithOtherElement {
	public static void main(String[] args) {
		int[] a = { 0, 2, 1, 5 };

		int[] b = new int[a.length];

		int count = 0;
		for (int i = 0; i < a.length; i++) {
			int sum = 1;
			for (int j = 0; j < a.length; j++) {
				if (i != j) {

					sum = sum * a[j];

				}

			}
			b[count++] = sum;
		}

		System.out.println(Arrays.toString(b));
	}
}
