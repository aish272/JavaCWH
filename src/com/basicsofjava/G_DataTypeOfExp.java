//Lecture 10

package com.basicsofjava;

public class G_DataTypeOfExp {

	public static void main(String[] args) 
	{
		//data type of expressions
		int i = 9+6; //int
		float f1= 9.0f+7; //float
		double d1 = 9l + 6.4; //double. 6.4 is of double type, no need to mention it.
		int i1 = (short)8 + (byte)9; //int
		int i2 = 'a'+ 7; //int
		int i3 = 'b'+(short)9;//int
		System.out.println(i+" "+f1+" "+d1+" "+i1+" "+i2+" "+i3);
		
		//increment decrement operator
		int a = 9;
		char ch = 'a';
		System.out.println(++a);
		System.out.println(a--);
		System.out.println(a++);
		System.out.println(--a);
		System.out.println(++ch);
		
	}

}
