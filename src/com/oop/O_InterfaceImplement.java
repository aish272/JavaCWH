/**
 Lecture 55 
 */
package com.oop;

/**
 * @author aishwarya_mishra
 *
 */
interface Bicycle
{
	int constant = 9;              //Can't be changed using the object;
	
	public int constant1 = 10;     //Can't be changed using the object;
	public void speedUp(); 				//Writing public here is redundant because methods in interfaces are already redundant.
	void speedSlow();
	void applyBreak();
}

interface Features
{
	public void blowhorn();				//Writing public here is redundant because methods in interfaces are already redundant.
	void turnOnHeadlight();
}

class Avon 
{
	int price = 9000;
	void details ()
	{
		System.out.println("Price: 9k\nModel: A222");
	}
	
}

class MyBike implements Features, Bicycle 
{

	
	//super.constant = 88; //only possible in cases of class.
	@Override
	public void speedUp() 
	{
		System.out.println("Speed Increased");
	}

	@Override
	 public void speedSlow() 
	{
		System.out.println("Speed Decreased");
		
	}

	@Override
	public void applyBreak() 
	{
		System.out.println("Speed Decreased and bicycle stopped.");
		
	}

	@Override
	public void blowhorn() 
	{
		System.out.println("Blowing horn! Peee pein poooon");
		
	}

	@Override
	public void turnOnHeadlight() 
	{
		
		System.out.println("Headlight turned on!");
	}
	
}
public class O_InterfaceImplement {

	
	public static void main(String[] args) 
	{
		
		MyBike mine = new MyBike();
		mine.blowhorn();
		mine.speedSlow();
		mine.speedUp();
		mine.turnOnHeadlight();
		mine.applyBreak();
		//mine.constant = 88;  //Error: The final field Bicycle.constant cannot be assigned
		//mine.constant1 =0;	//Error: The final field Bicycle.constant cannot be assigned
	}

}
