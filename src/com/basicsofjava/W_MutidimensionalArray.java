package com.basicsofjava;

public class W_MutidimensionalArray {

	public static void main(String[] args) 
	{
		
		int [][]flats = new int [2][4]; //1st way to initialize
		int [][]flats1 = {{1,2,3,4},{5,6,7,8}}; //2nd way to initialize
		flats [0][0]= 90;
		flats [0][1]= 91;
		flats [0][2]= 92;
		flats [1][0]= 80;
		flats [1][1]= 81;
		flats [1][2]= 82;
		for (int []element: flats)
		{
			System.out.println(element); //output [I@15db9742 [I@6d06d69c
		
		}
		for (int element: flats[0])
		{
			System.out.println(element);
		}
		
		for (int outerArr =0;outerArr<flats1.length;outerArr++)
		{
			for (int innerArr =0;innerArr<flats1[outerArr].length;innerArr++)
			{
				System.out.printf("%d ",flats1[outerArr][innerArr]);
			}
			System.out.println();
		}
	}

}
