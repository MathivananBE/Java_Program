package com;

public class BetsysNumSumBetweenTheRange {

	//8-19
	
	public static void main(String[] args) {
		int a=123,b=456;
		
		int sum=0;
		for(int i=a;i<=b;i++) {
			if(isBetsysNum(i)) {
				sum=sum+i;
			}
		}
		
		System.out.println(sum);
	}
	
	public static boolean isBetsysNum(int a) {
		String b=a+"";
		
		for(int i=0;i<b.length()-1;i++) {
			
			int digit1=b.charAt(i)-'0';
			int digit2=b.charAt(i + 1)-'0';
			
			if(digit1-digit2!=1 && digit2-digit1!=1) {
				return false;
			}
		}
		return true;
	}
}
