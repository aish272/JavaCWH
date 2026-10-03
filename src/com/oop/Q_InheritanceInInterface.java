//Lecture 58

package com.oop;

interface BaseInterface
{
	void method1();
	void method2();
	
}

interface DerivedInterface extends BaseInterface   //an interface inheriting from another interface.
{
	void method3();
	void method4();
	
}

class JustAClass implements DerivedInterface
{

	@Override
	public void method1() 
	{
		
		 System.out.println("method1");
	}    
         
	@Override
	public void method2() 
	{    	 
		System.out.println("method2");
	}    
         
	@Override
	public void method3() 
	{
		 
		System.out.println("method3");
	}    
         
	@Override
	public void method4() 
	{
		System.out.println("method4");
		
	}
	
}

public class Q_InheritanceInInterface 
{

	public static void main(String[] args) 
	{
	  JustAClass j1 = new JustAClass();
	  j1.method1();
	  j1.method2();
	  j1.method3();
	  j1.method4();

	}

}
