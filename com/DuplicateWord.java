package com;

public class DuplicateWord {

	public static void main(String[] args) {
		String a="Mahi mathi athim hdr mathi ND handsome are you good mahi are";
			
		a=a.toLowerCase();
		
		String[]b=a.split(" ");
		int count=0;
		for (int i=0;i<b.length;i++) {
			count=1;
			for(int j=i+1;j<b.length;j++) {
				if(b[i].equals(b[j])){
					
					b[j]="0";
					count++;
				}
				
				}if(count>1 && b[i]!="0") {
					System.out.println(b[i]);
			}
		}
				

	}

}
