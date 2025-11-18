package com;

public class GenerateRandomNumber {

	public static void main(String[] args) {

		int min = 20;
		int max = 30;

		double a = Math.random() * (max - min + 1) + min;
		int c = (int) a;
		System.out.println(c);
		
		//System.out.println(Math.random()*10);
	}
}