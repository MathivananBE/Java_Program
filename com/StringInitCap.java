package com;

public class StringInitCap {

	// input:"Mahabaliburam is __unsec @ recogized site";
	// output:Mahabaliburam Is Unsec Recognized Site

	public static String convertCaps(String a) {
		return a.substring(0, 1).toUpperCase() + a.substring(1);
	}

	public static void main(String[] args) {

		String orgString = "Mahabaliburam is __unsec @ recogized site";
		String s = "";

		for (int i = 0; i < orgString.length(); i++) {
			char temp = orgString.charAt(i);

			if (Character.isAlphabetic(temp)) {
				s = s + temp;
			} else if (temp == ' ') {
				s = s + ' ';
			}
		}

		// System.out.println(s);//----> it is removed all special Char
		// Mahabaliburam is unsec recogized site
		String[] s1 = s.split(" ");

		String res = "";

		for (String a : s1) {
			if (!a.equals("")) {
				res = res + convertCaps(a) + " ";
			}

		}

		System.out.println(res);
	}

}
