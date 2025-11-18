package com;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HexToDecimal {

	public static void main(String[] args) {
		Map<Character, Integer> m = new LinkedHashMap<Character, Integer>();
		m.put('0', 0);
		m.put('1', 1);
		m.put('2', 2);
		m.put('3', 3);
		m.put('4', 4);
		m.put('5', 5);
		m.put('6', 6);
		m.put('7', 7);
		m.put('8', 8);
		m.put('9', 9);
		m.put('A', 10);
		m.put('B', 11);
		m.put('C', 12);
		m.put('D', 13);
		m.put('E', 14);
		m.put('F', 15);

		System.out.println("Enter the Hexa value");
		Scanner s = new Scanner(System.in);
		char a = s.next().charAt(0);

		if ((a >= '0' && a <= '9') || (a >= 'A' && a <= 'F')) {
			System.out.println(m.get(a));
		} else {
			System.out.println("Enter valid input");
		}

	}
}
