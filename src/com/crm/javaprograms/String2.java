package com.crm.javaprograms;

public class String2 {
	public void reverseString(String str) {
		String[] words = str.split("  ");
		String reversedString=" ";
		//System.out.println(words);
		for(int i=0;i<words.length;i++) {
			String word = words[i];
			String reverseWord=" ";
			for(int j=word.length()-1;j>=0;j--) {
				reverseWord=reverseWord+word.charAt(j);
				
		
			}
			reversedString=reversedString+reverseWord+" ";
		}
		System.out.println(str);
		System.out.println(reversedString);
		
		
	}

	public static void main(String[] args) {
		String2 s=new String2();
		s.reverseString("Ashok");
		
		
	

	}

}
