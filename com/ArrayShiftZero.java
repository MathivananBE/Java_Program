package com;

import java.util.Arrays;

public class ArrayShiftZero {
	public static void main(String[] args) {
		
		int[] a= {12,0,23,3,0,0,4,0,56,9,12};
		int[] b= new int[a.length];
		int[] c= new int[a.length];
		int count1=a.length-1;
		
		for (int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				b[count1--]=a[i];
			}
		}
		
		int count2=0;
		int count3=0;
		for (int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				c[count2++]=a[i];
				count3++;
			}
		}
		
		
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		System.out.println(count3);
		
		
	}
	
}

