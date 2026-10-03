//Lecture 46

package com.oop;

/**
 * @author aishwarya_mishra
 *
 */
class GrandF {
	private int grandx;

	GrandF(int x) 
	{
		
		grandx = x;
		System.out.println("Overloaded constructor of Grand F. Value of grandx: "+grandx);
	}

	GrandF() // default constructor
	{ 
		System.out.println("Default constructor of GrandF");
	}
}

class Father extends GrandF
{
	private int fatherx;

	Father(int x) //parameterized constructor of Father.
	{
		
		fatherx = x;
		System.out.println("Overloaded constructor of Father. Value of fatherx: "+fatherx);
	}
	
	Father(int x, int y)  // This will call parameterized constructor of GrandF.
	{
		super(y);
		fatherx = x;
		System.out.println("Overloaded constructor of Father which calls parameterized constructor of GrandF. Value of fatherx: "+fatherx);
		
	}

	Father() // default constructor
	{ 
		System.out.println("Default constructor of Father");
	}
}

class Child extends Father
{
	private int childx;

	Child(int x) //parameterized constructor of Child.
	{
		
		childx = x;
		System.out.println("Overloaded constructor of Child. Value of childx: "+childx);
	}
	
	Child(int x, int y)  // This will call parameterized constructor of Father.
	{
		super(y);
		childx = x;
		System.out.println("Overloaded constructor of Child which calls parameterized constructor of Father. Value of childx: "+childx);
		
	}
	
	Child(int x, int y, int z)  // This will call parameterized constructor of GrandF andFtaher.
	{
		super(y,z);
		childx = x;
		System.out.println("Overloaded constructor of Child which calls parameterized constructor of GrandF and Father. Value of childx: "+childx);
		
	}

	Child() // default constructor
	{

		System.out.println("Default constructor of Child");
	}
}

public class H_ConstructorInheritance {

	public static void main(String[] args) 
	{
		Father f1 = new Father(); 			//Will call default constructor of GrandF and Father.
		Father f2 = new Father(8);			//Will call default constructor of GrandF and parameterized constructor of Father.
		Father f3 = new Father(7,6);	//Will call parameterized  constructor of GrandF and Father.
		Child c1 = new Child(); 			//Will call default constructor of GrandF, Father and Child.
		Child c2 = new Child(3);   			//Will call default constructor of GrandF, Father and parameterized constructor of Child.
		Child c3 = new Child(4,5);	//Will call default constructor of GrandF and parameterized constructor of Father and Child.
		Child c4 = new Child(7,8,9);  //Will call parameterized constructor of GrandF, Father and Child.
		
	}

}
