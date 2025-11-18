package com;

import java.util.Arrays;

public class RemoveDupAndStroreUniqueArray {
	
	public static void main(String[] args) {
		int[] a= {2,3,4,2,6,8,4,9,3};
		int count=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j] && a[i]!=Integer.MAX_VALUE) {
					a[j]=Integer.MAX_VALUE;
					count++;
				}
			}
		}
		int[] b=new int[a.length-count];
		for(int i=0,j=0;i<a.length;i++) {
			if(a[i]!=Integer.MAX_VALUE) {
				b[j++]=a[i];
			}
		}
		
		//System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}

}
