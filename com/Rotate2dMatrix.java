package com;

import java.util.Arrays;

public class Rotate2dMatrix {

	public static void main(String[] args) {
		int[][] a= {
				{2,5,7},
				{1,2,3},
				{9,6,4},
				{2,4,5},
				{6,0,2}
		};
		
		int[][] b=new int[a[0].length][a.length];
		
		//this loop for Transfer data 
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
			b[j][i]=a[i][j];
			}
		}
		
		//print 2d Array
		
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
			
	}
}
