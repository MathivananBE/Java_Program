package com;

import java.util.Arrays;

// input: 01011010
//output: 00001111
public class ArrayTwoPointer {

	public static void main(String[] args) {
		int[] a= {0,1,0,1,1,0,1,0};
		
		int left=a[0],right=a.length-1;
		
		while(left<right) {
			if(a[left]==1 && a[right]==0) {
				int temp=a[left];
				a[left]=a[right];
				a[right]=temp;
				
				left++;
				right--;
			}
			
			if(a[left]==0) {
				left++;
			}
			if(a[right]==1) {
				right--;
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
