package com;

public class SumIntegerFromText {
	public static void main(String[] args) {
		String a = "the 2 pen is 5 cost is 10 and 88";
		int res = 0;
		String[] b = a.split(" ");

		for (int i = 0; i < b.length; i++) {
			try {
				res = res + Integer.parseInt(b[i]);
			} catch (Exception e) {

			}
		}
		System.out.println(res);
	}
}
