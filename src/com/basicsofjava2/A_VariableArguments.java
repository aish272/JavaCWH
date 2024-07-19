//Lecture 33

package com.basicsofjava2;

public class A_VariableArguments {

	static int summation(int ...arr) //arr is an array
	{
		int sum =0;
		for(int a : arr)
		{
			sum+=a;
			
		}
		//System.out.println(arr[0]); // Values of arr array can be checked. It depends on the arguments passed.
		return sum;
	}
	
	
	
	/*
	 * In this, it is compulsory to pass one value which will be assigned to x.
	 * In the previous one, on not passing any argument array was left empty which did not produce any error.
	 * This was commented because, it caused ambiguity in the 1, 2 and 3 function call.
	
	static int summation(int x, int ...arr) 
	{
		int sum =0;
		for(int a : arr)
		{
			sum+=a;
			
		}
		
		return sum;
	}
	*
	*
	*
	*
	*/
	public static void main(String[] args) 
	{
		System.out.println("Addition of 1 and 2: "+summation(1,2));
		System.out.println("Addition of 1, 2 and 3: "+summation(1,2,3));
		System.out.println("Addition of 1,7,8 and 2: "+summation(1,7,8,2));
		System.out.println("Addition of nothing: "+summation()); // This will return 0 because array is empty.
	}

}
