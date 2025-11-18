package com;

public class ArmStrongNum {

	public static void main(String[] args) {
		
/*		int a=2;
		int b=3;		
		double c=Math.pow(a, b);
		System.out.println(c);
*/
		
		int a=153;
		int b=a;
		int temp=a;
		int count=0;
		int sum=0;
		
		while(temp>0) {
			temp=temp/10;
			count++;
		}
		
		while(a>0) {
			temp=a%10;
			double temp1=Math.pow(temp, count);
			sum=sum+(int)temp1;
			a=a/10;
		}
		
		if(b==sum) {
			System.out.println("It is ArmStrong Number");
		}else {
			System.out.println("Not a ArmStrong Number");
		}
		}
}
