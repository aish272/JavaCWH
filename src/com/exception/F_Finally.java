package com.exception;
import java.util.Scanner;

public class F_Finally 
{
	//Finally block example 1: Finally runs even after try block has executed the return statement.
	static int a,b;
	static Scanner sc;
	public static int div()
	{
		sc = new Scanner(System.in);
		System.out.println("Enter a: ");
		a = sc.nextInt();
		System.out.println("Enter b: ");
		b = sc.nextInt();
		try
		{
			if(b==0)
			{
				throw new ArithmeticException();
			}
			return a/b;
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		
		/*
		 Usually when return statement is executed the function's execution gets finished
		 But here finally block will compulsorily run, even if return statement has run of the try block.  
		 */
		finally
		{
			System.out.println("Closing sc."); 
			sc.close();				
		}
		
		/*
		 -1 indicates try block did not run. Could have given any arbitrary value too but value must be given 
		 because this value will be returned if try does not work.  
		 */
		return -1; 
	}


	public static void main(String[] args) 
	{
		//Finally block example 1 execution
		int result = div();
		System.out.println("The result is "+result);
		
		//Finally block example 2: Finally runs even after the loop has broken using break statement.
		int a = 5;
		int b = 3;
		while(true)
		{
			
			try
			{
				System.out.println("a/b = "+a/b);
			}
			catch(ArithmeticException ae)
			{
				System.out.println(ae);
				break; //The loop will break at b = 0 but finally block will run for zero too then program will end.
			}
			finally
			{
				System.out.println("This is finally block. Value of b "+b);
			}
			b--;
		}
		
		
		//Finally block example 3: Try with finally and without catch
		
		int storeValue =0 ;
		try
		{
			storeValue =  99;
		}
		finally
		{
			storeValue = 100;
		}
		System.out.println("The value of storeValue "+storeValue); //o/p = 100

	}

}
;