package com.basicsofjava;

public class V_ForEachLoop {

	public static void main(String[] args) 
	{
		int [] numArr = new int [3];
		numArr [0]= 12;
		numArr [1] = 9;
		numArr [2] =0;
		System.out.println("Using normal for loop."); 
		for(int i =0;i< numArr.length;i++)  //This gives the element and the index i too.
		{
			
			System.out.println("Element: "+numArr[i]);
		}
		
		System.out.println("Using for-each loop.");
		for (int number: numArr)  //This only gives the element
		{
			
			System.out.println("Element: "+number);
		}
	}
		

}
