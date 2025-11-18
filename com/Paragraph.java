package com;

public class Paragraph {
	public static void main(String[] args) {
		String a="dfgadbkjcvvrvvv. mathi gaur santhosh fadda.afhvjhfas iafug agfayevroc. afsvavfye afvyifas.uasb . ahftdfa.";
		a=a.toLowerCase();
		char[]b=a.toCharArray();
		char[]c=a.toCharArray();
		int Lettercount =0;
		int occurance=0;
		for (int i=0;i<b.length;i++) {
			if(b[i]!=' ' && b[i]!='.') {
				Lettercount++;
			}
		}
		System.out.println("Total Letter Count"+"-"+Lettercount);
		
		
		System.out.println("Occurance of letter");
		System.out.println("-------------------");
		for(int i=0;i<c.length;i++) {
			occurance =1;
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j] && c[i]!='*') {
					c[j]='*';
					
					occurance=occurance+1;
					
				}
				}
			if(c[i]!='*' && c[i]!='.' && c[i]!=' ') {
					System.out.println(c[i]+"-"+occurance);
			}
		}
		char Alp='a';
		char[]al=new char[26];
		for(int i=0;i<al.length;i++) {
			al[i]=Alp++;
		}
		
//		for(char ala:al) {
//			System.out.println(ala);
//		}
		
		
		
		
		String[] d=a.split(" ");
		int wordcount=0;
		for(int i=0;i<d.length;i++) {
			wordcount++;
//			System.out.println(d[i]+"-"+wordcount);
			
		}System.out.println("Total word count="+wordcount);
		
		
		String[]e=a.split("\\.");
		int sentenceCount=0;
//		for(String m:e) {
//			System.out.println(m);
//		}
		for(int i=0;i<e.length;i++) {
			sentenceCount++;
		}System.out.println("total Sentence Count"+"-"+sentenceCount);
		
		
		
		
		
		
		
	}

}
