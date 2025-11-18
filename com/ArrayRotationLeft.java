package com;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotationLeft {

	public static void main(String[] args) {
		
		int[]a= {1,2,3,4};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int r=sc.nextInt();
		//int r=g-1;
		r=r%a.length;
		
		int[]b=new int[a.length];
		int c=0;
		for(int i=r;i<b.length;i++) {
			b[c++]=a[i];
		}
		for(int i=0;i<r;i++) {
			b[c++]=a[i];
		}
		
		System.out.println(Arrays.toString(b));
	}
}
