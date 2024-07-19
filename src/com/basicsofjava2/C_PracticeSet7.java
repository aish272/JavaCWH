//Video No. 35

package com.basicsofjava2;

public class C_PracticeSet7 {

	//Problem 1: Multiplication Method
	static void mult(int x)
	{
		for (int i=1;i<=10;i++)
		{
			
			System.out.printf("%d x %d = %d\n",x,i,x*i);
		}
	}
	
	//Problem 2: Pattern Printing
	static void pattern(int numOfLines)
	{
		for (int i=0;i<=numOfLines;i++)
		{
			for(int space=1;space<=numOfLines-i;space++)
			{
				System.out.print(" ");
			}
			for(int star =1;star<=i;star++)
			{
			    System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	//Problem 8: Same as problem 2 using recursion
	static void patternRecursion(int numOfLines,int charNum)
	{
		if (numOfLines==0) // If we have printed all the numOfLines then return. 
			return;
		else
		{
			for(int i=1;i<=charNum;i++)
			{
				/*
				 	LOGIC:
				   
				 Pattern (numOfLines-i)spaces number of stars = i
				     *   (4-1)spaces          *
				    **   (3-1)spaces         **
				   ***   (2-1)spaces        ***
				  ****   (1-1)spaces       ****
				  
				 
				 */
				
				
				if(i<=numOfLines-1)  
					System.out.print(" ");
				else
					System.out.print("*");
				
			}
			System.out.println();
			patternRecursion(numOfLines-1,charNum);
		}
	}
	
	//Problem 3: Sum of n natural number.
	static int sumOfNatNums(int n)
	{
		if (n==1)
		{
			return (1);
		}
		else
			return (n+sumOfNatNums(n-1));
	}
	
	//Problem 4: Pattern Printing
	static void pattern2(int numOfLines)
	{
		for(int count=numOfLines;count!=0;count--)
		{
		for(int star=count;star!=0;star--)
		{
			System.out.print("*");
		}
		System.out.println();
		}
	}
	
	
	//Problem 7: Same as 4th using recursion
	static void pattern2Recursion(int numOfLines)
	{
		if (numOfLines==0)
		{
			return;
		}
		else
			for(int i=1;i<=numOfLines;i++)
			{
				System.out.print("*");
			}
		System.out.println();
		pattern2Recursion(numOfLines-1);
	}
	
	//Problem 6 :Calculate the average of the array elements using variable arguments concepts.
	
	static float avg(int ...arr1)
	{
		int len = arr1.length;
		float avg = 0;
		for(int count =0; count<len;count++)
		{
			avg += arr1[count];
		}
		return avg/len;
	}
	
	//Problem 9: Celsius to fahrenheit
	
	static float convertTemp(float tempInCel)
	{
		
		return (tempInCel*((float)9/5)) +32;
		
	}
	
	public static void main(String[] args) 
	{
		
		mult(9);
		System.out.println("Pattern1");
		pattern(4);
		System.out.println();
		System.out.println("Pattern2");
		pattern2(7);
		System.out.println();
		System.out.println("Sum of given numbers: "+sumOfNatNums(6));
		patternRecursion(7,7);
		System.out.println();
		pattern2Recursion(7);
		System.out.println();
		System.out.println("The average is "+avg(5,2));
		System.out.println("The average is "+avg(5,2,9));
		System.out.println("The average is "+avg());
		System.out.println();
		System.out.println("The temperature from Celsius to Fahrenheit is: "+convertTemp(9.0f));
		
	}

}
