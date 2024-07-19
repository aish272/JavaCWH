//Lecture 81

package com.exception;

import java.util.Scanner;

public class B_HandlingSpecificExcep {

	public static void main(String[] args) 
	{
		float[] arr = new float[3];
		arr[0] = 8;
		arr[1] = 6;
		arr[2] = 4;
		System.out.println(arr.length);
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the index of the array element to be divided.");
			int index = sc.nextInt();
			System.out.println("Enter the divisor.");
			int divisor = sc.nextInt();
			System.out.println("The element which is the dividend is "+arr[index]);
			System.out.println("The result of "+arr[index]+"/"+divisor+" is "+arr[index]/divisor);
			sc.close();
			
		}
		catch(ArithmeticException ar)
		{
			System.out.println("The error is "+ar); // to catch exception on line 23 (ArithmeticException)
		}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			System.out.println("The error is "+ai); // to catch exception on line 22 (ArrayIndexOutOfBoundsException)
		}
		catch(Exception e)
		{
			System.out.println("The error is "+e); // to catch any other exception exception 
		}
		
		
		
	}

}
