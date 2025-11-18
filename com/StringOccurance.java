package com;

import java.util.Scanner;

public class StringOccurance {

	public static void main(String[] args) {
		System.out.println("Enter the Word");
		Scanner scan =new Scanner(System.in);
		String a=scan.next();
		
		int count=0;
		char[]b=a.toCharArray();
		for(int i=0;i<a.length();i++) {
			count=1;
			for(int j=i+1;j<a.length();j++) {
				if(b[i]==b[j]) {
					b[j]='@';
				count++;
			}
				
		}if(b[i]!='@')
			System.out.println(b[i]+"-"+count);
	}
}
}