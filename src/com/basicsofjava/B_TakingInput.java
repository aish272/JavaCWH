//Lecture5

package com.basicsofjava;

import java.util.Scanner;

public class B_TakingInput  {

	public static void main(String[] args) 
	{
		
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int a = ip.nextInt();
		System.out.println("Value of a:"+a);
		
		System.out.print("Enter a word: ");
		String word = ip.next();
		System.out.println("Entered word: "+word); //Should be without whitespaces otherwise only the first word will be read.
		ip.nextLine(); //option 1:  read \n character
		System.out.print("Enter a line: ");
		Scanner ipStr = new Scanner(System.in);
		
		String line = ipStr.nextLine(); //option 2: create another scanner object
		System.out.println("The line entered which has words and whitespaces: "+line);
		
		ip.close();
		ipStr.close();

	}

}
