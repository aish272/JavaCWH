// Lecture 53


package com.oop;

/**
 * @author aishwarya_mishra
 *
 */

abstract class PhoneBluePrint  //Abstract  class which has abstract methods which will be implemented in derived classes.
{
	abstract public void switchOn(String modelname); // the method is public here and the method in concrete class must be public.
	abstract void callType();						// The method is neither public in concrete class nor here.
	abstract void features();						// it is public in concrete class but not here.
}


// This class is implementing all the methods of PhoneBluePrint so, it's a concrete class.
class Nokia1100 extends PhoneBluePrint
{

	@Override
	public void switchOn(String modelname) 
	{
		
		System.out.println("Switching on "+modelname);
	}

	@Override

	void callType() 
	{
		System.out.println("Only audio call available.");
	}

	@Override
	public void features() 
	{
		System.out.println("1. Can Call\n2.Play Radio\n3.Play Snake Game");
	}
	
}

//This class is not implementing any of the methods of PhoneBluePrint and has it's own abstract methods so, it's an abstract class.
abstract class SmartPhoneBluePrint extends PhoneBluePrint
{
	abstract void phoneUnlockTypes();	
	abstract void camSpecs();
}


/*This class is implementing all the methods of PhoneBluePrint and SmartPhoneBluePrint so, it's a concrete class.
  It's imp to implement all the methods of PhoneBluePrint too even though it's extending SmartPhoneBluePrint. Because
  SmartPhoneBluePrint is extending PhoneBluePrint.
 */
class SamsungFE extends SmartPhoneBluePrint
{
	@Override
	public void switchOn(String modelname) 
	{
		
		System.out.println("Switching on "+modelname);
	}

	@Override
	public void callType() 
	{
		System.out.println("Video and audio call available.");
	}

	@Override
	public void features() 
	{
		System.out.println("1.Can Call\n2.Play Radio\n3.Play Snake Game\n4.Click Pics\n5.Use modern apps");
	}
	
	@Override
	public void phoneUnlockTypes()
	{
		System.out.println("Face Unlock\nVoice Unlock");
	}
	
	@Override
	public void camSpecs()
	{
		System.out.println("64megapx, Quad Cam and Faltu Sensors. Lol!");
	}
		
}

public class N_IntroAbstractClass 
{
	
	public static void main(String[] args) 
	{
		SamsungFE mine = new SamsungFE();
		mine.switchOn("Samsung Fe 5g");
		mine.callType();
		mine.camSpecs();
		mine.features();
	}

}
