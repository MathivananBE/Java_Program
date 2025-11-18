package com;

public class ArrayfindTargetSum {

	public static void main(String[] args) {
		int[] a = { 2, 4, 6, 3, 7, 1 };

		int targetsum = 8;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == targetsum) {

					System.out.println(a[i] + " " + a[j]);

				}
			}
		}
	}

}

/*
//THIS CODE FOR IF SUM =8 RESULT=(1,7),(7,1) for both combination

		public static void main(String[] args) {
			int[] a = { 2, 4, 6, 3, 7, 1 };
			int target = 8;

			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a.length; j++) {
					if (i != j && a[i] + a[j] == target) {
						System.out.println(a[i] + " " + a[j]);
					}

				}
			}
		}
*/
