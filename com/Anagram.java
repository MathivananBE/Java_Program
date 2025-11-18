package com;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String str1 = "Earth";
		String str2 = "Heart";
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		String a = new String(arr1); // String a = Arrays.toString(arr1);
		String b = new String(arr2); // String b = Arrays.toString(arr2);

		if (a.equals(b)) {
			System.out.println("Given String is Anagram");
		} else {
			System.out.println("It is Not anagram");
		}

	}
	
}
	
	
	/*String a="amma";
		String b="mma";
		
		char[] c=a.toCharArray();
		char[] d=b.toCharArray();
		
		Arrays.sort(c);
		Arrays.sort(d);
		
		if(Arrays.equals(c, d)) {
			System.out.println("given String is Anagram...");
		}else {
			System.out.println("not anagram");	
		}
		
		
		-----------------------------------------------------------------------------
		
		
 public class AnagramUsingSortLogic {
	public static void main(String[] args) {
		String a="silent";
		String b="listen";
		
		char[]c=a.toCharArray();
		char[]d=b.toCharArray();
		
		char[]v=sort(c);
		char[]u=sort(d);
		
		
		if(Arrays.equals(v,u)) {
			System.out.println("It is Anagram");
		}else {
			System.out.println("It is not Angaram");
		}
	}
	public static char[] sort(char[] z) {
		
		for(int i=0;i<z.length;i++) {
			for(int j=i+1;j<z.length;j++) {
				if(z[i]>z[j]) {
					char temp=z[i];
					z[i]=z[j];
					z[j]=temp;
				}
			}
		}
		return z;
	}}
	*/

