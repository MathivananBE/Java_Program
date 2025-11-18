package com;

public class FindTargetSum {
	public static void main(String[] args) {
		int[] a = { 1, 3, 6, 8, 7, 2, 5 };
		int target = 10;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				for (int k = j + 1; k < a.length; k++)

					if (a[i] + a[j] + a[k] == target) {
						System.out.println("{" + a[i] + "," + a[j] + "," + a[k] + "}");

						//for more details
						//System.out.println("Element = "+"{"+a[i]+","+a[j]+","+a[k]+"}"+ " , index = {"+i+","+j+","+k+"}");
					}
			}

		}

	}
}
