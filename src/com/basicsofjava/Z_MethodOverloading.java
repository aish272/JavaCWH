//Lecture 32


package com.basicsofjava;

public class Z_MethodOverloading 
{
	
	//example of method overloading. The return type must be same.
	static void change(int x)
	{
		x = 5;
	}

	static void change(int []arr)
	{
		arr[2] = 5;
	}

	
	public static void main(String[] args) 
	{
		int x1 = 8;
		int[] arr1 = {5,7,8};
		System.out.println("Old x1: "+x1+" Old arr1[2]: "+arr1[2]);
		change(x1); //pass by value
		change(arr1);// pass by reference
		System.out.println("Unchanged x1: "+x1+" Changed arr1[2]: "+arr1[2]);
	}

}
