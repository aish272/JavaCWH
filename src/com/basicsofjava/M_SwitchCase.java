package com.basicsofjava;

import java.util.Scanner;

public class M_SwitchCase {

	public static void main(String[] args) 
	{
		String greet;
		Scanner ip = new Scanner(System.in);
		System.out.print("What do you wanna be today? ");
		greet = ip.next();
		switch (greet)
		{
		    default:
			System.out.println("You are the Queen of hearts!!");
			
			case "Programmer":
				System.out.println("Heya, Aish the Programmer. You are the best!!!!");
				break;
			case "Actor":
				System.out.println("Heya Superstar! Your fans are waiting.");
				break;
			case "Dance":
				System.out.println("Those killer moves!");
				break;				
		}
		//check enhanced java switch case
		ip.close();

	}

}
