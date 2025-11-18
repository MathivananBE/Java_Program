package com;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		String a = "mathimat";

		char[] b = a.toCharArray();

		for (int i = 0; i < b.length; i++) {
			boolean unique = true;
			for (int j = 0; j < b.length; j++) {
				if (i != j && b[i] == b[j]) {
					unique = false;
					break;
				}

			}
			if (unique) {
				System.out.println(b[i]);
				break;
			}
		}
	}
}
