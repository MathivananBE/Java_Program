package array;

import java.util.Arrays;

/*
 	input : 6 23 0 -1
 			2 -3 8
 			16 -34
 			
 	output : -1 0 23 6
 			 -3 2 8
 			 -34 16
 */
public class SortMultiDimensionArray {

	public static void main(String[] args) {
		int [][] a= {
				{6,23,0,-1},
				{2,-3,8},
				{16,-34}
				};
		
		for(int i=0;i<a.length;i++) {
			a[i]=bubbleSort(a[i]);
			System.out.println(Arrays.toString(a[i]));
		}
	}
	
	public static int[] bubbleSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
}
