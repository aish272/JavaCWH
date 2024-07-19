//lecture 83
package com.exception;

import java.util.Scanner;

class TenDigitsMismatchException extends Exception
{
	@Override
	public String toString()
	{
		return "Phone number must have 10 numbers";
	}
	
	@Override
	public String getMessage()
	{
		return "10 digits in the phone number not given";
	}
}

public class D_ExceptionClass 
{

	public static void main(String[] args) 
	{
		String phoneNum;
		Scanner sc = new Scanner(System.in);
		phoneNum = sc.next();
		if(phoneNum.length()!=10) 
		{
			try 
			{
				throw new TenDigitsMismatchException(); //Throw the exception if 10 digits in the phone number are not entered.
			}
			catch (TenDigitsMismatchException e)
			{
				System.out.println(e.getMessage());   //To handle the exception, catch block is used here.
				System.out.println(e);// Alternate option System.out.println(e.toString();
				e.printStackTrace();
			}
			
			System.out.println("Program Completed!");
		}
		else
		{
			System.out.println("Phone Number "+phoneNum);
		}
			
		sc.close();	
		
	}

}
