package com;

import java.util.HashSet;

public class ArrayCommonElement {
	public static void main(String[] args) {
		int a[] = { 3, 5, 2, 9, 1, 8 };
		int b[] = { 4, 6, 3, 1, 2, 8 };

		HashSet<Integer> d = new HashSet<>();
		HashSet<Integer> common = new HashSet<>();

		for (int i = 0; i < a.length; i++) {
			d.add(a[i]);
		}

		for (int j : b) {
			if (d.contains(j)) {
				common.add(j);
			}
		}
		System.out.println(common);
	
	
		
		// Normal Loop Way
		
	for(int x=0;x<a.length;x++) {
		for(int y=0;y<a.length;y++) {
			
			if(a[x]==b[y]) {
				System.out.print(a[x]+" ");
			}
			
		}
		
		}
	
	}

}