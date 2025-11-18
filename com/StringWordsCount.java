package com;

public class StringWordsCount {

	public static void main(String[] args) {
		String a = "hi how are you you hi hi";
		String[] b = a.split(" ");
		int occurance = 0;
		for (int i = 0; i < b.length; i++) {
			occurance = 1;
			for (int j = i + 1; j < b.length; j++) {
				if (b[i].equals(b[j])) {
					b[j] = "*";
					occurance++;
				}

			}
			if (b[i] != "*") {
				System.out.println(b[i] + "-" + occurance);
			}
		}
	}
}
