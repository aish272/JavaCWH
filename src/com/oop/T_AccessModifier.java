//Lecture 67 Refer testingConcepts/T_AccessModifierTest.java

package com.oop;


class AccessMod
{
	private int priv =0;
	int def = 90;
	protected int pro = 88;
	public int pub = 9;
	
}

public class T_AccessModifier 
{
	
	protected int pro1 = 77;
	int def1 = 56;
	public int pub1 = 34;

	public static void main(String[] args)
	{
		AccessMod am = new AccessMod();
		
		/*
		 1. Private member cannot be accessed inside same package, subclass in another package or anywhere else.
		 2. Private members can only be accessed in the same class.
		 3. Create getters and setters, so that they can be accessed elsewhere. Accessibility of getters and setters also depends on their modifier.
		 */
		//System.out.println("Private: "+am.priv);
		
		
		
		/*
		 1. Protected members can be accessed in the same package and in sub class in another package. 
		 2. Protected members can be accessed in the same class.
		 
		 Note: You'll have to import the parent class, if you want to access protected member from a 
		 class that inherits a parent class in another package.
		 */
		System.out.println("Protected: "+am.pro); //Same package

		/* 
		 1. Public members can be accessed everywhere.
		 
		  Note: You'll have to import the class, if you want to access private member in another package.
		 
		 */
		//System.out.println("Public: "+am.pub); //same package
		
		/*
		 1. Default members can be accessed in the same package.
		 2. In a child class in the same package.
		 3. In the same class.
		 4. Default members cannot be accessed in child class in another package. 
		 
		 */
		System.out.println("Default: "+am.def);  //same package
	}

}
