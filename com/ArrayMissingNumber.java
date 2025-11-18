package com;

import java.util.Arrays;

public class ArrayMissingNumber {

	public static void main(String[] args) {
		int[] a= {4,5,2,7,10};
		         //sort 2,4,5,7,10
		         //ans 1,2,3,4,5,6,7,8,9,10
		
		Arrays.sort(a);
		//n is used to compare the number is it is Exist or Missing .if it is missing print the n number.
		int n=1;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=n) {
				System.out.print(n+" ");
				i--;
			}
			n++;
		}
	}
}

/*   --------------------this logic for only one number is missind in a Array-----------------------------

public static void main(String[] args) {
int[] a = { 2, 1, 3, 4, 6 };
Arrays.sort(a);

int Total = a[a.length - 1];

Total = Total * (Total + 1) / 2;
int sum = 0;

for (int i = 0; i < a.length; i++) {
	sum = sum + a[i];
}
System.out.println("Missing Element in Array:" + (Total - sum));

}

*/