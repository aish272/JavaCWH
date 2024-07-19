//Lecture 21
package com.basicsofjava;

import java.util.Scanner;

public class P_WhileLoop {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		//if you enter something other than an integer value then you'll be stuck in an endless 'while' loop.
		while(!scan.hasNextInt())
		{
			System.out.println("Invalid");
			scan.next(); //to read the invalid input. If this is not read then invalid will be printed infinitely.
		}
		int age = scan.nextInt();
		System.out.println(age);
		scan.close();
	}
	}


