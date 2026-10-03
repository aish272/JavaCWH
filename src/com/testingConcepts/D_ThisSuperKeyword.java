//Lecture 47
package com.testingConcepts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author aishwarya_mishra
 *
 */

class Base1
{

	 Base1 ()
	 {
		 System.out.println(" constructor of base class.");
	 }
	public List<String> returnMethod()
	{
		return new ArrayList<>();
	}


}

class Derived1 extends Base1
{

	Derived1 ()
	{
		super();
		System.out.println(" constructor of derived class.");
	}
	@Override
	public LinkedList<String> returnMethod()
	{
		return new LinkedList<>();
	}


}
public class D_ThisSuperKeyword
{

	
	public static void main(String[] args) 
	{
		Derived1 d1 = new Derived1();

	}



}
