//Lecture 8

package com.basicsofjava;

public class E_Operators {

	public static void main(String[] args) 
	{
		//Arithmetic Operator
		//% works with float variables too
		float f1 =  7.8f;
		float mod = (float) (f1%2.3);
		System.out.println("The modulus of 7.8 and 2.3 is "+mod);
		
		//assignment operator
		int b=9;
		b +=8;
		System.out.println("The new value of b is "+b);
		
		//relational operators 
		boolean res = 67>9;
		System.out.println("The result of 67>9 is "+res);
		
		//logical operators
		boolean result = (67>9) && (67>0);
		System.out.println("The result of (67>9) && (67>0) is "+result);
		
		//bitwise operator
		int bitRes = 4&6;  //100 & 110
		System.out.println("The result of 4&6 is "+bitRes);
		
	}

}
