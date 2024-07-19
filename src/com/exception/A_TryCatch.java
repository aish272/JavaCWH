//Lecture 80
package com.exception;
/**
 * @author aishwarya_mishra
 *
 */
public class A_TryCatch
{

	public int add(int a, int b)
	{
		return a+b;
	}
		
	public static void main(String[] args) 
	{
		A_TryCatch obj = new A_TryCatch();
		
		try
		{
			obj.add(6, 0); // On giving the value of a "sty" which is a string, a compilation error occurred.
								//	Illegal Argument exception could not be produced.
		}
		catch(Exception e)
		{
			System.out.println(e+" Caught in the program.");
		}
		
		//Trying to produce NumberFormatException exception.
		//String str = "444"; //This runs the try part.
		String str = "44v"; // This string has an alphabet which can't be converted to any type of number which causes the exception.
		try
		{
			System.out.println("String to integer "+Integer.parseInt(str));
			System.out.println("String to number in octal form "+Integer.parseInt(str,8));
			System.out.println("String to double "+Double.parseDouble(str));
			System.out.println("String to float "+Float.parseFloat(str));
		}
		
		catch(Exception e)
		{
			System.out.println(e+" Caught in the program.");
		}
		
		

	}

}
