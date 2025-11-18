package com;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotationRight {

	public static void main(String[] args) {
		int[]a= {1,2,3,4};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int r=sc.nextInt();
		
		r=r%a.length;
		System.out.println(r);
		//int r=g-1;
		
		int[]b=new int[a.length];
		int c=0;
		for(int i=a.length-r;i<a.length;i++) {
			b[c++]=a[i];
		}
		for(int i=0;i<a.length-r;i++) {
			b[c++]=a[i];
		}
		
		System.out.println(Arrays.toString(b));
	}
}
