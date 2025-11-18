package com;

import java.util.Arrays;

public class CodeMarathan {

	//find top 3 top Scorer and sum
	
	public static void main(String[] args) {
		
		int[] a= {2,20,5,8,10};
		
		int sum=0,topScorer=3;
		
		Arrays.sort(a);
		
		for(int i=a.length-topScorer;i<a.length;i++) {
			sum=sum+a[i];
		}
		
		System.out.println(sum);
	}
	
}
