package com;

public class DecimalToBinary {

	public static void main(String[] args) {
		int decimal=19;
		
		// Using BuildIn method
		// String binary=Integer.toBinaryString(decimal);
		
		String binary="";
		
		while(decimal>0) {
			binary=(decimal%2)+binary;
			decimal=decimal/2;
		}
		System.out.println(binary);
	}
}
