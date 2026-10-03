//Lecture 47
package com.oop;

/**
 * @author aishwarya_mishra
 *
 */

class Base1
{
	private int b1;
	 Base1 (int b1)
	 {
		 this.b1 = b1;
		 System.out.println("Parameterised constructor of base class.");
	 }
	 public int getb1() 
	 {
		 return b1;
	 }
}

class Derived1 extends Base1
{
	private int d1;
	
	/*
	   If the super keyword in the below constructor is removed, then an error will be thrown saying that a default constructor 
	   must be declared in the base class. But, as we are calling the parameterized constructor of the base class by using the super
	   keyword, the parameterized constructor of the base class will be called and the error will be removed.

	   If default constructor in parent class doesn't exist then in the child class
 	   the parameterized constructor must be called using super keyword.
	 */
	Derived1 (int d1, int b1)
	{
		super(b1);  
		this.d1 = d1;
		System.out.println("Parameterised constructor of derived class.");
	}
	
	public int getderivedd1()
	{
		
		return d1;
	}
	
	public int getb1BySuper()
	{
		
		 //Super keyword used to get a method of base class.
		return super.getb1() ;
	}
}
public class I_ThisSuperKeyword
{

	
	public static void main(String[] args) 
	{
		Derived1 d1 = new Derived1(67, 77);
		System.out.println("Derived class property d1 using derived class method: "+d1.getderivedd1());
		System.out.println("Base class property b1 using base class method on derived class object: "+d1.getb1());
		System.out.println("Base class property b1 using derived class method and super keyword on derived class object: "+d1.getb1BySuper());
		

	}

}
