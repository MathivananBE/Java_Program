package com;

public class ToUpperCaseWithOutInBuildMethod {

	public static void main(String[] args) {
		String a="mathiN";
		String res="";
		
		for(int i=0;i<a.length();i++) {
			
			if(a.charAt(i)>='a' && a.charAt(i)<='z') {
			char c= (char) (a.charAt(i)-32);
			res+=c;
		}
			
			else {
				res+=a.charAt(i);
			}
		}
		
		System.out.println(res);
	}
}
