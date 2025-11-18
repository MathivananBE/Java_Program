package com;

public class ExpandString {

	public static void main(String[] args) {
		String a="a2b3c2";
		String ans="";
		char []b=a.toCharArray();
		for(int i=0;i<b.length;i=i+2) {
			//System.out.println(b[i+1]-'0');   
			//System.out.println(b[i+1]-48);
			for(int j=0;j<b[i+1]-48;j++) {
				ans+=b[i];
			}
		}
		System.out.println(b);
		System.out.println(ans);
	}
}
