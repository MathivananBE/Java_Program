package com;

public class SubArray {

	public static void subArray(int[]a) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			String res="";
			for(int j=i;j<a.length;j++) {
				res=res+a[j]+" ";
				count++;
				System.out.print("["+res +"] ");
			}
			System.out.println();
			
		}
		System.out.println("************************");
		System.out.println("Total SubArray ="+count);
	}
	
	
	public static void main(String[] args) {
		int[] a = { 2,4,6,8,10};
		subArray(a);
	}
}
