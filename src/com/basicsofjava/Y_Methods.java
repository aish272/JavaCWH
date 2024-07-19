//Lecture 31

package com.basicsofjava;

import java.util.Scanner;

public class Y_Methods {

	static int fact(int x)
	{
		int res=1;
		for(;x>1;x--)
		{
			res = res*x;
		}
		return res;
		
	}
	static void passByRef(int [] arr1)
	{
		arr1[0] =90;
	}
		
	public static void main(String[] args) 
	{
		
		int factNum;
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter a number to calculate its factorial: ");
		factNum = ip.nextInt();
		ip.close();
		int result = fact(factNum);
		System.out.println("The result is "+result);
		
		
		//Lecture 32
		//Pass by reference example by using an array. The value of the first element will be changed.
		int [] arr = {1,23,5,7,4};
		passByRef(arr);
		System.out.println("The value of 1st element after calling the method using pass by reference: "+arr[0]);
	}

}
