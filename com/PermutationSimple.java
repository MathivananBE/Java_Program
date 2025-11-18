package com;

public class PermutationSimple {

	public static void main(String[] args) {
		String a = "ABC";

		char[] b = a.toCharArray();

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				for (int k = 0; k < b.length; k++) {
					if (i != j && j != k && i != k) {
						System.out.println(b[i] + ""+b[j]+"" + b[k]);
					}
				}
			}
		}
	}
}
