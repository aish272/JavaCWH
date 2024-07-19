package com.basicsofjava;

public class K_PracticeSet3 {

	public static void main(String[] args) 
	{
		//problem 1: To convert a string to lowercase
		String lower = " happy ";
		lower = lower.toUpperCase();
		System.out.println(lower);
		
		//problem 2: Convert spaces to underscores.
		System.out.println(lower.replace(" ","_"));
		
		//problem 3: Replace a substring, name with an actual name
		String letter  = "Dear <|name|>, Thanks a lot!";
		System.out.println(letter.replace("<|name|>","Aish"));
		
		//problem 4: Detect triple and double spaces in a string
		String spaces = "  ds   ts";
		System.out.println("Index of double space: "+spaces.indexOf("  ")+" and "+"index of triple space: "+spaces.indexOf("   "));
		
		
		
	
	}

}
