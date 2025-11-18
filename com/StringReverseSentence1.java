package com;

public class StringReverseSentence1 {

	public static void main(String[] args) {
		String a="hi how are you";
		String [] b=a.split(" ");
		String res="";
		
		for(int i=b.length-1;i>=0;i--) {
			res=res+b[i]+" ";
		}
	
		System.out.println(res);
	}
}
