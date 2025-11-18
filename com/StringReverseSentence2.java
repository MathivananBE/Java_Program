package com;

public class StringReverseSentence2 {

	public static void main(String[] args) {
		String a="hi how are";
		String[]b=a.split(" ");
		
		StringBuilder res=new StringBuilder();
		
		for(int i=b.length-1;i>=0;i--) {
			if(i!=0) {
				res=res.append(b[i]+" ");
			}else {
				res=res.append(b[i]);
			}
		}
		System.out.println(res);
	}
}
