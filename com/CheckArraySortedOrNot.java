package com;

public class CheckArraySortedOrNot {

	public static void main(String[] args) {
		int[]a= {1,3,4,5,6,8,9};
		boolean sortArr=true;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					sortArr=false;
				}
			}
		}
		if(sortArr) {
			System.out.println("Array is Sorted...");
		}else {
			System.out.println("Array is Not Sorted...");
		}
	}
}
