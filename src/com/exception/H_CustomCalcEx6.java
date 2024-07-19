package com.exception;

import java.util.Scanner;

class MaxInputException extends Exception
{
	public String toString()
	{
		return "Input can't be greater than 100000.";
	}
	
	public String getMessage()
	{
		return "Input limit is 100000.";
	}
}

class MaxMultiplicationException extends Exception
{
	public String toString()
	{
		return "Multiplication can't be greater than 1000000.";
	}
	
	public String getMessage()
	{
		return "Multiplication limit is 1000000.";
	}
}



class CustomCalc
{
	public void calc()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for addition\nEnter 2 for substraction\nEnter 3 for multiplication\nEnter 4 for division");
		int option = sc.nextInt();
		switch(option)
		{
			case 1->
			{
				
				try
				{
					System.out.println("Enter number 1 ");
					String input = sc.next();
					int a = Integer.parseInt(input);
					
					System.out.println("Enter number 2 ");
					input = sc.next();
					int b = Integer.parseInt(input);
					
					if(a>100000 || b>100000)
					{
						try
						{
							throw new MaxInputException();
						}
						catch(MaxInputException me)
						{
							System.out.println(me.getMessage());
						}
					}
					else
					{ 
						System.out.println("The addition is "+(a+b));
					}
				}
				catch(NumberFormatException ne)
				{
					System.out.println(ne);
				}
			}
			case 2->
			{
				try
				{
					System.out.println("Enter number 1 ");
					String input = sc.next();
					int a = Integer.parseInt(input);
					
					System.out.println("Enter number 2 ");
					input = sc.next();
					int b = Integer.parseInt(input);
					
					if(a>100000 || b>100000)
					{
						try
						{
							throw new MaxInputException();
						}
						catch(MaxInputException me)
						{
							System.out.println(me.getMessage());
						}
					}
					else
					{ 
						System.out.println("The subtraction is "+(a-b));
					}
				}
				catch(NumberFormatException ne)
				{
					System.out.println(ne);
				}
			}
			case 3->
			{
				try
				{
					System.out.println("Enter number 1 ");
					String input = sc.next();
					int a = Integer.parseInt(input);
					
					System.out.println("Enter number 2 ");
					input = sc.next();
					int b = Integer.parseInt(input);
					
					if(a>100000 || b>100000)
					{
						try
						{
							throw new MaxInputException();
						}
						catch(MaxInputException me)
						{
							System.out.println(me.getMessage());
						}
					}
					else
					{
						if ((a*b) > 1000000)
						{
							try 
							{
								throw new MaxMultiplicationException();
							}
							catch(MaxMultiplicationException me)
							{
								System.out.println(me);
							}
							
						}
						else
						{
							System.out.println("The multiplicationtion is "+(a*b));
						}
					}
					
					
				}
				catch(NumberFormatException ne)
				{
					System.out.println(ne);
				}
			}
			case 4->
			{
				try
				{
					System.out.println("Enter number 1 ");
					String input = sc.next();
					int a = Integer.parseInt(input);
					
					System.out.println("Enter number 2 ");
					input = sc.next();
					int b = Integer.parseInt(input);
					
					if(a>100000 || b>100000)
					{
						try
						{
							throw new MaxInputException();
						}
						catch(MaxInputException me)
						{
							System.out.println(me.getMessage());
						}
					}
					else if(b==0)
					{
						try
						{
							throw new ArithmeticException("Divisor can't be zero");
						}
						catch(ArithmeticException ae)
						{
							System.out.println(ae.getMessage());
						}
						
						
					}
					else
					{ 
						System.out.println("The divsion is "+(a/b));
					}
				}
				catch(NumberFormatException ne)
				{
					System.out.println(ne);
				}
				
				
			}
		}
	}
}

public class H_CustomCalcEx6 
{

	public static void main(String[] args) 
	{
		CustomCalc c1 = new CustomCalc();
		c1.calc();
	}

}
