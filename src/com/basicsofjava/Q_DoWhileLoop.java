//Lecture 22

package com.basicsofjava;

public class Q_DoWhileLoop {

	public static void main(String[] args) 
	{
		int notDivisibleBy2 = 5;
		
		//This will print 5 even though 5 is not divisible by 2 because we are using do-while loop here.
		do 
		{
			System.out.println(notDivisibleBy2);
			notDivisibleBy2 += 2;
		}while(notDivisibleBy2%2==0);
		

	}

}
