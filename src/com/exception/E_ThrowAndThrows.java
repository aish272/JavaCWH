package com.exception;

class NegativeRadiusException extends Exception
{
	public String toString()
	{
		return "Negative radius not allowed!";
	}
	
	public String getMessage()
	{
		return "Entered a negative radius.";
	}
}

class testingThrowsKeyword
{
	
	//1. Using custom class to throw exception
	public float areaCirc(float radius) throws NegativeRadiusException
	{
		if (radius<=0)
		{
			throw new NegativeRadiusException();
		}
		return (float) (Math.PI*radius*radius);
	}
	
	//2. Using built-in class to throw exception.
	public float div(float divisor, float dividend) throws ArithmeticException
	{
		if (divisor==0)	
		{
			throw new ArithmeticException();
		}
		return (float) (dividend/divisor);
	}
	
}

public class E_ThrowAndThrows 
{
	public static void main(String[] args) throws ArithmeticException
	{
		
		//Using areaCirc Function
		testingThrowsKeyword obj1 = new testingThrowsKeyword();
		try
		{
			System.out.println("The area for radius 9 is "+obj1.areaCirc(9));;
		}
		catch(NegativeRadiusException nre)
		{
			System.out.println(nre.getMessage());
			System.out.println(nre.toString());
			nre.printStackTrace();
		}
		
		//Using div Function
		testingThrowsKeyword obj2 = new testingThrowsKeyword();
		try
		{
			System.out.println("The division of 6 and 0 is "+obj2.div(0, 6));
		}
		catch (ArithmeticException ae)
		{
			System.out.println(ae.getMessage());
			System.out.println(ae.toString());
			ae.printStackTrace();
		}
		System.out.println("Progarm completed!");

	}

}
