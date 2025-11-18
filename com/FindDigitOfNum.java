package com;

public class FindDigitOfNum {
	
	public static void main(String[] args) {
		int a=1095798;
		
		System.out.println(count(a));
		
	}
	public static int count(int b) {

		if(b>=0 && b<=9)
			return 1;
		
		else {
			int count=0;
			while(b>0) {
				b=b/10;
				count++;
			}return count;
		}
	}
	
}
