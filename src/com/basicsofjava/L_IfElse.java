//lecture 16, 17 and half of 18

package com.basicsofjava;

import java.util.Scanner;

public class L_IfElse {

	public static void main(String[] args) 
	{
		
		//if-else
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = ip.nextInt();
		if (age >= 18)
		{
			System.out.println("You can start programming.");
		}
		else 
		{
			System.out.println("There is enough time left. Till then enjoy ya life!!");
		}
		ip.close();
	
		//if-else if-else
		if (age>=18 && age<=40)
		{
			System.out.println("Adult!!!!!!");
		}
		else if (age<=0)
		{
			System.out.println("Fetus");
		}
		else
		{
			System.out.println("Oldie or a kid");
		}
		
		
		//Reversing a number.
		int rev=0;
		while (age!=0)
		{
			rev = (rev*10)+(age%10);
		    age = age/10;
		}
		System.out.println(rev);
		
		
	}

}
