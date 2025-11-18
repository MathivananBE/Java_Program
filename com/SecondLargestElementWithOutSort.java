package com;

public class SecondLargestElementWithOutSort {

	public static void main(String[] args) {
		int[] a = { 2, 10, 9, 1, 3, 6, 99 };

		int FirstLargest = Integer.MIN_VALUE;
		int SecondLargest = Integer.MIN_VALUE;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > FirstLargest) {
				SecondLargest = FirstLargest;
				FirstLargest = a[i];
			} else if ((a[i] > SecondLargest)) {
				SecondLargest = a[i];
			}

		}
		System.out.println("FirstLargest Element:" + FirstLargest);
		System.out.println("SecondLargest Element:" + SecondLargest);

	}

}
