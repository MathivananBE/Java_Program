package com;

import java.util.Arrays;

public class DupArr {
	public static void main(String[] args) {
		int []a= {1,5,3,7,9,1,3,5,4,4,4,1};
		int []b= new int[a.length];
		int count=0;
		int iteration=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]==a[j] && a[i]!=Integer.MAX_VALUE) {
					a[j]=Integer.MAX_VALUE;
					iteration++;
				}
			}
		}
		
		System.out.println(Arrays.toString(a));
		
		for(int i=0;i<a.length;i++) {
			if(a[i]!=Integer.MAX_VALUE) {
				b[count++]=a[i];
				
			}
		}
		System.out.println(Arrays.toString(b));
//		System.out.println(iteration);
		
		int[] c=new int[a.length-iteration];
		int count1=a.length-iteration;
		int count2=0;
		
		for(int i=0;i<count1;i++) {
			c[count2++]=b[i];
		}
		
		System.out.println(Arrays.toString(c));
	}
}
