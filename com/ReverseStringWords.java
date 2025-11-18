package com;

public class ReverseStringWords {
	public static void main(String[] args) {
		String a = "mathi hello hi";

		String[] b = a.split(" ");

		String rev = "";

		for (int i = 0; i < b.length; i++) {
			String RevWord = "";

			for (int j = b[i].length() - 1; j >= 0; j--) {
				RevWord = RevWord + b[i].charAt(j);

			}
			rev += RevWord + " ";
		}

		System.out.println(rev);

	}

}
