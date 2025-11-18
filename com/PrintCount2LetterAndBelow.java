package com;

public class PrintCount2LetterAndBelow {

	public static void main(String[] args) {
		int a[]= {1,2,2,2,2,2,3,3,4,4,4,5};
		
		for(int i=0;i<a.length;i++) {
			int count=1;
			
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
				   
			}
			if(count<=2) {
				System.out.print(a[i]);
		}
		}
	}
}
