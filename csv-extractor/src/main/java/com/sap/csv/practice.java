package com.sap.csv;

public class practice {
	static int[] marks = {10,20,30,40};
	static int sum=0;

	
   public static void main(String args[]) {
	   System.out.println("Hello World");
	   
	   try {
		   
		for(int marks:marks) {
			   sum= sum+marks;	   
		   }
		System.out.println(sum);
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	   
	   
}
}