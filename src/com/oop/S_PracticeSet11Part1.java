//Video No. 60

package com.oop;


//Problem 1 and 2
abstract class Pen
{
	abstract void write(String sentence);
	abstract void refill();
	
}

class FountainPen extends Pen
{

	@Override
	void write(String sentence) 
	{
		
		System.out.println("Writing.."+sentence);
	}

	@Override
	void refill() 
	{
		
		System.out.println("Refilled pen.");
	}
	
	void changeNib()
	{
		System.out.println("Changed the nib of the pen.");
	}
	
}

public class S_PracticeSet11Part1 {

	public static void main(String[] args) 
	{
		
		//Polymorphism
		Pen p1 = new FountainPen();
		p1.refill();
		p1.write("Hey there!");
		//p1.changeNib(); Won't work.
		((FountainPen) p1).changeNib();
		
		
		
	}

}
