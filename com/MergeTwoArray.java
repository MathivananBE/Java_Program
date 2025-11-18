package com;

import java.util.Arrays;

public class MergeTwoArray {

	public static void main(String[] args) {
		int []a = {3,2,6,4};
		int []b= {8,1,5,7};
		
		int[] c= new int[(a.length)+(b.length)];
		int z=0;
		for(int i=0;i<a.length;i++) {
			
			c[z++]=a[i];
		}
		int k=a.length;
		for(int i=0;i<b.length;i++) {
			
			c[k++]=b[i];
		}
		
		System.out.println(Arrays.toString(c));
		
		int[]d = sort(c);
		
		
		
		
		System.out.println(Arrays.toString(d));
		
		for(int s:d) {
			System.out.print(s+" ");
		}
		
		
	}
	public static int[] sort(int[] c) {
		for(int i=0;i<c.length;i++) {
			for(int j=i+1;j<c.length;j++) {
				
				if(c[i]>c[j]) {
					
					int temp=c[i];
					c[i]=c[j];
					c[j]=temp;
					
				}
			}
	}return c;
		
		
}
	
}

