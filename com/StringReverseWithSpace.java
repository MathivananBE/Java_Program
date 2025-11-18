package com;

public class StringReverseWithSpace {
	public static void main(String[] args) {
		String a = "hi how are u";
		char[] b = a.toCharArray();

		String d = "";

		for (int i = b.length - 1; i >= 0; i--) {
			if (b[i] != ' ') {
				d = d + b[i];

			}
		}

		char[] e = d.toCharArray();

		int count = 0;

		for (int j = 0; j < b.length; j++) {
			if (b[j] != ' ') {
				b[j] = e[count++];
			}

		}

		System.out.println(b);

	}
}
