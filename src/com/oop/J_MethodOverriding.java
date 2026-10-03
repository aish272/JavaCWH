//Lecture 48
package com.oop;

/**
 * @author aishwarya_mishra
 *
 */

class Parent
{
	int x=9;
	public void justMethod(int time)
	{
		System.out.println("It's "+time+" am. Get up!");
	}
}

/* 
  list of parameters, return type and access modifier of the base class method must match overridden method of derived class.
  
  @Override: Useful in case of any changes in the list of parameters, return type or access modifier of the base class method.
	         In case of such changes, method will not be overridden and an error will be thrown. It will ask to remove @Override
	         annotation.
 */


class TheChild extends Parent
{
	int x;
	TheChild()
	{
		//super.x =0;
		this.x = 99;
	}
	@Override          
	public void justMethod(int minutes)
	{
		//super.justMethod(minutes); calling the overridden method of super class.
		System.out.println("You have "+minutes+" minutes to get ready for the dance class.");
	}		
}
public class J_MethodOverriding 
{	
	public static void main(String[] args) 
	{
		TheChild c1 = new TheChild();
		c1.justMethod(8);
		
		Parent c2= new TheChild(); //Reference is base class
		System.out.println("Value of x:"+c2.x);  // This will print the value of x from parent class. I reassigned it in the child class using super keyword.
		c2.justMethod(8989);

		TheChild c3 = new TheChild(); //Reference is child class.
		System.out.println("Value of x:"+c3.x);	// 	This will print the value of x from child class.
		
		c3.x = 78;
		System.out.println("Value of x:"+c3.x);  //Value can be changed. This is not possible in interfaces. Refer O_InterfaceImplement.java
		
				
	}
}

