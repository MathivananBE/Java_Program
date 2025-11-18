package com;

import java.util.Arrays;

public class SortingTheChar {
	
	public static void main(String[] args) {
		char[] a= {'b','a','n','n','u'};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=(char)temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
