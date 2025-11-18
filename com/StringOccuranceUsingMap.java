package com;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StringOccuranceUsingMap {

	public static void main(String[] args) {
		System.out.println("Enter the Word");
		Scanner scan = new Scanner(System.in);
		String a = scan.next();

		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < a.length(); i++) {
			char c = a.charAt(i);

			if (!(map.containsKey(c))) {
				map.put(c, 1);
			} else {
				map.put(c,(map.get(c))+ 1);
			}
		}
		System.out.println(map);
	}
}
