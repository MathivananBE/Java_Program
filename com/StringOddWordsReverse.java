package com;

public class StringOddWordsReverse {

	public static void main(String[] args) {
		String a = "hi how are you buddy";
		String[] b = a.split(" ");
		String res = "";

		for (int i = 0; i < b.length; i++) {

			if (i % 2 == 0) {
				char[] s = b[i].toCharArray();
				for (int j = s.length - 1; j >= 0; j--) {
					res = res + s[j];
				}
			} else {
				char[] s = b[i].toCharArray();
				for (int j = 0; j < s.length; j++) {
					res = res + s[j];
				}
			}
			res = res + " ";
		}
		System.out.println(res);
	}
}
