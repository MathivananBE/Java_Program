package com;

public class FirstCharacterCapitalEachWord {

	public static void main(String[] args) {
		String a = "hi how are";
		String[] b = a.split(" ");
		String res = "";

		for (int i = 0; i < b.length; i++) {
			res = res + b[i].substring(0, 1).toUpperCase() + b[i].substring(1).toLowerCase() + " ";
		}
		System.out.println(res);
	}
}
