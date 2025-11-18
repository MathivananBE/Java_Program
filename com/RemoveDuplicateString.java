package com;

import java.util.HashSet;

public class RemoveDuplicateString {
	
	public static void main(String[] args) {
		
	String a="maamaeh";
	
	HashSet<String> Result =new HashSet<String>();
	
	for(int i=0;i<a.length();i++) {
		Result.add(String.valueOf(a.charAt(i)));
		
//		Result.add((a.charAt(i)+""));   for Convert String easy Way
		
		
		
		
	}
	System.out.println(Result);
	
		
	}

}
