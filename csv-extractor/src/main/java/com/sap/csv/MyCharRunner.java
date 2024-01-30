package com.sap.csv;

public class MyCharRunner {
	
	public static void main (String args[]) {
		MyChar myChar = new MyChar('2');
		
		System.out.println(myChar.isVowel()); // a,e,i,o,u and capitals
		System.out.println(myChar.isNumber());
		System.out.println(myChar.isAlphabet());
		System.out.println(myChar.isConsonant());
		MyChar.printLowerCaseAlphabets();
		MyChar.printUpperCaseAlphabets();
	}

}
