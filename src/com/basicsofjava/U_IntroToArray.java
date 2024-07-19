package com.basicsofjava;

public class U_IntroToArray {

	public static void main(String[] args) 
	{
		int [] marks = new int[5];
		marks[0]= 100;
		marks[1]= 89;
		marks[2]= 90;
		marks[3]= 67;
		marks[4]= 90;
		
		//String [] subs = new String [5]; //one way to declare reference variable and allocate memory.
		String [] subs = {"maths", "eng","sanskrit","phy","chem"}; //way to declare reference variable, initialize and allocate memory.
		int counter =0;
		while(counter<=4)
		{
			System.out.println(subs[counter]+" = "+marks[counter]);
			counter++;
			
		}
		
	}

}
