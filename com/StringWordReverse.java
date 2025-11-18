package com;

public class StringWordReverse {

	public static void main(String[] args) {
		String a = "hi how are you";
		String[] b = a.split(" ");
		String res = "";

		for (int i = 0; i < b.length; i++) {
			char[] s = b[i].toCharArray();
			for (int j = s.length - 1; j >= 0; j--) {
				res = res + s[j];
			}
			res = res + " ";
		}
		System.out.println(res);
	}
}
