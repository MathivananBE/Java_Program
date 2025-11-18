package com;

public class StringSeparation {
	public static void main(String[] args) {
	String b="absGNMb$@%*ma7thi901";
	String Alphabet="";
	String Small_Char="";
	String Special_Character="";
	int sum=0;
	char []a=b.toCharArray();
	for(int i=0;i<a.length;i++) {
		
		if((a[i]>='A' && a[i]<='Z')) {
			Alphabet=Alphabet+a[i];
			
		}else if((a[i]>='a' && a[i]<='z')) {
			Small_Char=Small_Char+a[i];
		}
		
		else if((a[i]>='0' && a[i]<='9')) {
			String k=a[i]+"";
			sum=sum+Integer.parseInt(k);
		}
		else {
			Special_Character=Special_Character+a[i];
		}
	}
	System.out.println("No of Capital Character:"+Alphabet);
	System.out.println("No of Small Character:"+Small_Char);
	System.out.println("No of Special Character:"+Special_Character);
	System.out.println("Sum of the Number:"+sum);
}
}
