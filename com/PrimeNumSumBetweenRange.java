package com;

import java.util.Scanner;

public class PrimeNumSumBetweenRange {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Number:");
		int start=sc.nextInt();
		
		System.out.println("Enter the Second Number");
		int end=sc.nextInt();
		
		int sum=0;
		
		for(int i=start;i<=end;i++) {
			if(isPrime(i)) {
				sum+=i;
				System.out.print(i+" "); //if want to show the prime number
			}
		}
		System.out.println();
		System.out.println("sum of All Prime Number : "+sum);
		
		
	}
	
	
	public static boolean isPrime(int a) {
		if(a<2) {
			return false;
		}
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				return false;
			}
		}
		return true;
	}
	

}
