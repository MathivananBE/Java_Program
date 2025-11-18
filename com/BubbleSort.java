package com;

public class BubbleSort {
	public static void main(String[] args) {
		int []a= {2,4,1,5,8,3,99};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;				}
			}
		}
		for(int b:a) {
			System.out.print(b+" ");
		}
	}

}
