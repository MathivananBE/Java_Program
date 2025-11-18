package com;

import java.util.Arrays;

public class MostOccuranceLetter {

	public static void main(String[] args) {
		String a="mathivanan";
		
		char[] b=a.toCharArray();
		
		char Maxchar=' ';
		int count1=0;
		
		for(int i=0;i<b.length;i++) {
			int count=1;
			for(int j=i+1;j<b.length;j++) {
				
				if(b[i]==b[j]) {
					count++;
					b[j]='@';
				}
			}
			if(b[i]!='@' && count1<count) {
				count1=count;
				Maxchar=b[i];
			}
			
		}
		
		System.out.println(Maxchar+" - "+count1);
	}
}
