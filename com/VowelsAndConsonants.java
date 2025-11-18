package com;

import java.util.Scanner;

public class VowelsAndConsonants {

	static void VowelsAndConsonant(String a) {
		a=a.toLowerCase();
		char[]b=a.toCharArray();
		int vowels=0;
		int consonants=0;
		for(int i=0;i<b.length;i++) {
			if((b[i]=='a') || (b[i]=='e') || (b[i]=='i')|| (b[i]=='o')||(b[i]=='u')){
				vowels++;
			}else {
				consonants++;
			}
		}
		System.out.println("vowels:"+vowels);
		System.out.println("consonants:"+consonants);
	}
	
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		String a=scan.next();
		VowelsAndConsonant(a);
	}
	
	
	
	
	
	
	
	
	
	
}