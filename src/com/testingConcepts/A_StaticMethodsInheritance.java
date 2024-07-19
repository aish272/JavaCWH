package com.testingConcepts;


class Base
{
	public static void  meth1()
	{
		System.out.println("Static from base");
	}
	
	public void meth2()
	{
		System.out.println("Non static from base");
	}
	
	public void add (int a, int b)
	{
		System.out.println(a+b);
	}
}

class Derived extends Base
{
	public static void  meth1()
	{
		System.out.println("Static from derived");
	}
	
	public void meth2()
	{
		System.out.println("Non static from derived");
	}
	/*
	  Overloading works in inheritance in case of Java but not in C++.
	 */
	public void add (int a, int b, int c)  
	{
		System.out.println(a+b+c);
	}
}

public class A_StaticMethodsInheritance 
{

	public static void main(String[] args) 
	{
		Derived d1 = new Derived();
		d1.meth2();  //Non static from derived
		d1.meth1();  //Static from derived. This should be called in a static way.
		d1.add(9, 0);
		d1.add(99, 80, 0);
		
		
		Base b1 = new Derived();  // Reference is base.
		b1.meth2();  //Non static from derived. 
		b1.meth1();  //Static from base. This should be called in a static way.
		b1.add(77, 0);
		//b1.add(9,7, 0);  //error. Reference is base.

	}
//68
}
