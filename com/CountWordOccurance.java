package com;

public class CountWordOccurance {

	public static void main(String[] args) {
		String a="Word Mathi athim nani pro pubg word mathi mathi word";
		int count;
		a=a.toLowerCase();
		
		String[] b=a.split(" ");
			
		for(int i=0;i<b.length;i++) {
			count=1;
			for(int j=i+1;j<b.length;j++) {
				if(b[i].equals(b[j])) {
					count++;
					b[j]="0";
				}
				
					
			}
				if((b[i]!="0") && count>1) {
					System.out.println(b[i]+"-"+count);
			
		
			}
		}
	}
}	

