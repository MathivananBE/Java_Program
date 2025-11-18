package com;

import java.util.HashSet;

public class RemoveDuplicateInArray {
	public static void main(String[] args) {
		int[] a = { 1, 2, 7, 3, 2, 3, 1 };

		HashSet<Integer> unique = new HashSet<Integer>();

		for (int i = 0; i < a.length; i++) {

			unique.add(a[i]);
		}
		System.out.println(unique);

	}

}
