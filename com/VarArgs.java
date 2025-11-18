package com;

public class VarArgs {
	public static int add(int...a) {
		int sum=0;
		for(int x:a) {
			sum+=x;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(add(3,2,4,5));
		System.out.println(add());
		System.out.println(add(31,13,42));
		System.out.println(add(8));
	}
	
}
