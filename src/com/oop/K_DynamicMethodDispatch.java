//Lecture 49

package com.oop;


import java.util.Arrays;
import java.util.List;

class Phone
{
	public void switchOn()
	{
		System.out.println("Switching on phone!!");
	}
	 
	public void features()
	{
		System.out.println("Can make a call and play radio.");
	}
}

class SmartPhone extends Phone
{
	@Override
	public void switchOn()
	{
		System.out.println("Switching on SmartPhone!");
	}
	public void newFeatures()
	{
		System.out.println("Can make a call, play radio and click pictures.");
	}
}
public class K_DynamicMethodDispatch {

	public static void main(String[] args) 
	{
		Phone p1 = new SmartPhone();  //upcasting, runtime polymorphism, dynamic method dispatch.
		p1.switchOn(); //This run the method of subclass, the one that overrode the base class method.
		p1.features(); //This will run base class method as it's not defined in subclass

		//p1 can't run child class method that has not been defined in base class, so we will typecast it.
		((SmartPhone) p1).newFeatures();
	}

}
