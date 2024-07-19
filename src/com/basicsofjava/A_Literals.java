//Lecture 4

package com.basicsofjava;

public class A_Literals {

	public static void main(String[] args) 
	{
		
		//integral data types
		int i1 = 999999999; //on adding one more digit to the number(total 10 digits) the limit will be exceeded.
		byte b1 = 127;// on adding +1 the limit will be exceeded.
		short s1 = 9999; //on adding one more digit to the number(total 5 digits) the limit will be exceeded.
		long l1 = 99999999999l;// important to mention l or L at the end otherwise it will be considered an int variable.
		  
		//float data types
		float f1 = 7.9f; //important to mention f or F otherwise it will be considered double data type.
		double d1 = 6.0; //it's optional to mention d or D.
		
		//char data type
		char c1 = 'a';
		c1++;
		
		System.out.println(i1+" "+b1+" "+s1+" "+l1+" "+f1+" "+d1+" "+c1);
	} 

}
