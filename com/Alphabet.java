package com;

public class Alphabet {
	public static void main(String[] args) throws InterruptedException {
		//Using ForLoop
		
		for(char al='a';al<='z';al++) {
			System.out.println(al);
			Thread.sleep(100);
		}
		
		
		//Using whileLoop
		
		char a='a';  //(char)65
		
		while(a<='z') {     //(a<=90)
			System.out.println(a);
			Thread.sleep(100);
			a++;
		}
		
		System.out.println("-------------------------");
		char b='A';   //(char)97
		
		while(b<='Z') {    //(b<=122)
			System.out.println(b);
			Thread.sleep(100);
			b++;
		}
		
	}

}
