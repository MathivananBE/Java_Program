package com;

public class FirstCharacterCapital {

	public static void main(String[] args) {
		String a = "mathivananMN";

		String res = a.substring(0, 1).toUpperCase() + a.substring(1).toLowerCase();

		System.out.println(res);

	}
}
