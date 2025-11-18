package com;

import java.util.Scanner;
import java.util.Stack;

public class ValidParanthesis {
	public static boolean valid(String a) {
		
		char[] b = a.toCharArray();

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < b.length; i++) {
			if (b[i] == '(' || b[i] == '{' || b[i] == '[') {
				stack.push(b[i]);
			} else {
				if(stack.isEmpty()) {
					return false;
				}else {
					char p = stack.pop();
					if ((b[i] == ')' && p != '(') || 
						(b[i] == '}' && p != '{') || 
						(b[i] == ']' && p != '['))
					{
							return false;

					}
				}
				

			}
			
		}
		if(stack.isEmpty()) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		Scanner scan =new Scanner(System.in);
		System.out.println("Enter Paranthesis:");
		String a=scan.next();
		
		if(valid(a)) {
			System.out.println("It is Valid Paranthesis");
		}else {
			System.out.println("Not Valid Paranthesis");
		}
		

		
	}

}
