package com;

public class BinaryToDecimal {
	public static void main(String[] args) {
		int binary=10011;

		int decimal=0;
		int base=1;		
		while(binary>0) {
			int lastElement=binary%10;
			decimal=decimal+(lastElement*base);
			
			base=base*2; //Increase base value 2^n  ex:8421
			binary=binary/10;
		}
		
		System.out.println(decimal);
	}
	
}


/*
 *** Using BuildIn method  ***
    String binary="10011";
	System.out.println(Integer.parseInt(binary,2));
 */
