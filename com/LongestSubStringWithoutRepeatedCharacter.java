package com;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeatedCharacter {

	public static void main(String[] args) {
		String a = "mathivanan";
				
		String LongestSubString = null;
		int LongestSubStringLength = 0;
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		char[] b = a.toCharArray();

		for (int i = 0; i < b.length; i++) {
			char c = b[i];

			if (!map.containsKey(c)) {
				map.put(c, i);

			} else {
				i = map.get(c);
				map.clear();

			}
			if (map.size() > LongestSubStringLength) {
				LongestSubStringLength = map.size();
				LongestSubString = map.keySet().toString();
			}
		}
		System.out.println(LongestSubStringLength);
		System.out.println(LongestSubString);

	}
}
