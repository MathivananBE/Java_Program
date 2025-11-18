package com;

public class CompressString {

	public static void main(String[] args) {
		String a = "aaabccd";
		String ans = "";
		char[] b = a.toCharArray();

		int count = 1;
		for (int i = 0; i < b.length - 1; i++) {
			if (b[i] == b[i + 1]) {
				count++;
			} else {
				ans = ans + b[i] + "" + count;
				count = 1;
			}

		}
		ans += b[b.length - 1] + "" + count;
		System.out.println(b);
		System.out.println(ans);

	}
}
