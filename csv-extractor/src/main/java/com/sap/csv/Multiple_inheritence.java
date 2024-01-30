package com.sap.csv;
import java.io.*;
public class Multiple_inheritence {
	public static void main(String args[]) {
		try {
			//Create a ExceptionA class and Extend Exception
			throw new ExceptionA(); 
		}catch(Exception exception)
		{
			System.out.println(exception.toString());
		}
		try {
			//Create a ExceptionB class and Extend ExceptionA
			throw new ExceptionB(); 
		}catch(Exception exception)
		{
			System.out.println(exception.toString());
		}try {
			throw new NullPointerException(); 
		}catch(Exception exception)
		{
			System.out.println(exception.toString());
		}try {
			throw new IOException(); 
		}catch(Exception exception)
		{
			System.out.println(exception.toString());
		}				
		
	}
	
}


