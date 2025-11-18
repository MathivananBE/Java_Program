package com;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) throws InterruptedException {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the Start Number:");
		
		int start=scan.nextInt();
		System.out.println("enter the End Number:");
		int end=scan.nextInt();
		
		for(int i=start;i<=end;i++) {
			for(int j=1;j<=10;j++) {
				System.out.println(i+"*"+j+"="+(i*j));
				Thread.sleep(100);
			}System.out.println("***************");
		}
		scan.close();
	}
}
