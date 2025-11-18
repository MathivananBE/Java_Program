package com;

public class Demoo {
	public static void main(String[] args) {
		int num =3;
		int temp=num;
		int len=num;
		int length=0;
		
		int sum=0;
		
		while(len>0) {
			len=len/10;
			length++;
		}
		
		while(num>0) {
			int t=num%10;
			num=num/10;
			sum+=Math.pow(t, length);
		}
		
		if(temp==sum) {
			System.out.println("ArmStrong Num");
		}else {
			System.out.println("no");
		}
	}
}