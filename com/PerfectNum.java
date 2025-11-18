package com;

import java.util.Scanner;

public class PerfectNum {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number:");
		
		int a =scan.nextInt();
		int b=0;
		
		for(int i=1;i<a;i++) {
			
			if(a%i==0) {
				b=b+i;
				
			}
			
		}
		if(a==b) {
			System.out.println("It is perfect number");
		}else {
			System.out.println("It is not Perfect number");
		}
		
	}
}
