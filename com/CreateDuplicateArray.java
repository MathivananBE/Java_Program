package com;

import java.util.Arrays;
import java.util.Scanner;

public class CreateDuplicateArray {
	
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		int[] a= new int[5];
		int[] b=new int[a.length];
		
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter The Element...");
			a[i]=sc.nextInt();
			b[i]=a[i];
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
}
