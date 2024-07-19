//lecture 67

package com.testingConcepts;

import com.oop.T_AccessModifier;

class Child extends T_AccessModifier
{
	void access()
	{
		Child c = new Child();
		
		c.pro1 =0;  //Accessing Protected member.
		
		//c.def1 =9; default cannot be accessed.
		
		
	}
}

class AccessPublic
{
	void accessPub()
	{
		T_AccessModifier ap = new T_AccessModifier(); //Creating the object of the class which has the public field.
		ap.pub1 = 90;

	}
}
class AccessPublic1 extends T_AccessModifier
{
	void accessPub()
	{
		AccessPublic1 a1 = new AccessPublic1(); //To access public member from an object subclass parent class must be inherited.
		a1.pub1 = 90;

	}
}



public class T_AccessModifierTest {

	public static void main(String[] args) 
	{
		
	}

}
