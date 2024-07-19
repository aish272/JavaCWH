package com.basicsofjava;

import java.util.Scanner;

public class R_ForLoop {

	public static void main(String[] args) 
	{
		System.out.println("Enter the number of multiples of 3 you want to print: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i=3; n>=1 && i<=300; n--, i+=3) // This will only print till 300. If the value of n is more than 100 then loop will only run 100 times not more than that.
		{
			System.out.println(i);
		}
		scan.close();
	}
		
}
