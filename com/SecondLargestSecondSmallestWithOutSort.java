package com;

public class SecondLargestSecondSmallestWithOutSort {

	public static void main(String[] args) {
		int[] a = { 2, 10, 9, 1, 3, 6, 99 };

		int FirstLargest = Integer.MIN_VALUE;
		int SecondLargest = Integer.MIN_VALUE;
		int FirstSmallest = Integer.MAX_VALUE;
		int SecondSmallest = Integer.MAX_VALUE;

		
		//Code for Largest Element
		for (int i = 0; i < a.length; i++) {
			if (a[i] > FirstLargest) {
				SecondLargest = FirstLargest;
				FirstLargest = a[i];
			} else if ((a[i] > SecondLargest)) {
				SecondLargest = a[i];
			}

		}

		//code for Smallest Element
		for (int i = 0; i < a.length; i++) {
			if (a[i] < FirstSmallest) {
				SecondSmallest=FirstSmallest;
				FirstSmallest = a[i];
			} else if (a[i] < SecondSmallest) {
				SecondSmallest = a[i];
			}
		}
		System.out.println("Smallest Element:" + FirstSmallest);
		System.out.println("SecondSmallest Element:" + SecondSmallest);
		System.out.println("FirstLargest Element:" + FirstLargest);
		System.out.println("SecondLargest Element:" + SecondLargest);

	}

}
