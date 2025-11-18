package com;

public class SwapStringWithoutUsingThirdVarible {

	public static void main(String[] args) {
		String a="mathi";
		String b="vanan";

		a=a+b;
		b=a.substring(0,(a.length()-b.length()));
		a=a.substring(b.length());
		
		System.out.println(a);
		System.out.println(b);
	}
}
