//Lecture 7

package com.basicsofjava;
import java.util.Scanner;
public class D_PracticeSet1 {

	public static void main(String[] args) 
	{
		
		
		int n1, n2, n3, total;
		Scanner ip = new Scanner(System.in);
		
		//question 1
		System.out.println("Enter three numbers to add: ");
		System.out.print("Enter n1: ");
		n1 = ip.nextInt();
		System.out.print("Enter n2: ");
		n2 = ip.nextInt();
		System.out.print("Enter n3: ");
		n3 = ip.nextInt();
		total = n1+n2+n3;
		System.out.println("The addition of three numbers is: "+total);
		
		//question 2
		int sub1, sub2, sub3;
		float cgpa;
		System.out.println("Enter the marks of three subjects to calciulate CGPA: ");
		System.out.print("Enter sub1: ");
		sub1 = ip.nextInt();
		System.out.print("Enter sub2: ");
		sub2 = ip.nextInt();
		System.out.print("Enter sub3: ");
		sub3 = ip.nextInt();
		total = sub1+sub2+sub3;
		cgpa = ((((float)(total))/3)/10);
		System.out.println();
		System.out.println("The CGPA of three subjects is: "+cgpa);
		
		//question 3
		String name;
		System.out.print("What's ya name? ");
		name = ip.next();
		System.out.println("Hello "+name+", have a good day!");
		
		//question 4
		int distInKM;
		float distINMiles;
		System.out.print("Hey! Enter the distance in kilometres to convert into miles: ");
		distInKM = ip.nextInt();
		distINMiles = (float) (distInKM* (0.62137));
		System.out.println("The distance in miles is: "+distINMiles);
		
		//question 5
		boolean isInt;
		System.out.print("Enter a value to check if it's an int or not.");
		isInt = ip.hasNextInt();
		System.out.println("The entered value was an integer: "+isInt);
		
		
		ip.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
