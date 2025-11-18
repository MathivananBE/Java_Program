package com;

import java.util.Scanner;

public class NumberPallindrome {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter the Number");
			int a=scan.nextInt();
			
			int rev=0;
			int num=a;
			
			while(a>0) {
				rev=(rev*10)+a%10;
				a=a/10;
				}

			System.out.println(rev);

			if(num==rev) {
				System.out.println("Given String is pallindrone");
			}
			else
				System.out.println("Given String is Not pallindrome");
	}
}