//Lecture 34

package com.basicsofjava2;

public class B_Recursion {

	static int fibo(int nTerm)  //0 1 1 2 3 5 8 13
	{
		if (nTerm == 3 || nTerm==2)
		{
			return 1;
		}
		else if(nTerm ==1)
		{
			return 0;
		}
		else
		{
			return fibo(nTerm-1)+fibo(nTerm-2);
		}
	}
	
	static int fact(int num)
	{
		if(num==0||num==1)
			return 1;
		else
			return num*fact(num-1);
	}
	public static void main(String[] args) 
	{
		System.out.println("The factorial of 8: "+fact(8));
		System.out.println("The 8th term in fibonacci series: "+fibo(8));

	}

}
