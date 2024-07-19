package com.basicsofjava;

public class I_IntroToStrings {

	public static void main(String[] args)
	{
		String str1 = "Aish"; //this will be in string constant pool in heap.
		String str2 = new String("Hi this is "); //this will be in heap.
		System.out.printf("%s%s",str2,str1);

	}

}
