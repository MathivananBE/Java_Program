package com;

public class Fibonanci {

	public static void main(String[] args) {
	
		int f=0;
		int s=1;
		
		for(int i=1;i<=10;i++) {
			System.out.print(f+" ");
			
			int t=f+s;
			f=s;
			s=t;
		}
	}
}
