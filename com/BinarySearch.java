package com;

import java.util.Scanner;

public class BinarySearch {
	//In binary Search elements should be Ascending Order

	public static void main(String[] args) {
		int[] a= {4,5,6,7,8,9};
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the element to search");
		int key=scan.nextInt();
		int first=a[0];
		int last =a[a.length-1];
		
		int mid=(first+last)/2;
	
		while(first<=last) {
			if(key==mid){
				System.out.println("Element Found : "  +key);
				break;
			}else if(key>mid) {
				first=mid+1;
			}else{
				last=mid-1;
			}
			mid=(first+last)/2;
			
		}
		
		if((key<first)||(key>last)) {
			System.out.println("Element not present : "  +key);
		}
		
		scan.close();
		}
}
