package com;

public class ArrayPrintLastDigit {
	public static void main(String[] args) {
		int[]a= {23,45,7,8,4,543,93,737};
		for(int i=0;i<a.length;i++) {
			if(a[i]<=9) {
				System.out.print(a[i]+" ");
			}else {
				System.out.print(a[i]%10+" ");
			}
		}
	}

}
