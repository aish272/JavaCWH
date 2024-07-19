package com.testingConcepts;

public class C_IfCondInsideTry {

	public static void main(String[] args) 
	{
		int a = 10;
		
		//Nothing will be printed from catch block as no error will be caught.
		try
		{
			if (a==2)
				throw new ArithmeticException();
			System.out.println("No exception caught."); // This will get printed.
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
