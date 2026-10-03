//Video No. 60


package com.oop;

//Problem 3
class Monkey
{
	void jump()
	{
		System.out.println("It's Jumpin'");
	}
	
	void bite()
	{
		System.out.println("Charlie bit me! Lol!");
	}		
}

interface Mammal
{
	void eat();
	void sleep();
}

class Human extends Monkey implements Mammal
{

	@Override
	public void eat() 
	{
		System.out.println("Eatin'");
		
	}

	@Override
	public void sleep() 
	{
		System.out.println("Sleepin'");
		
	}
	
	public void speak()
	{
		System.out.println("Singin'");
	}
	
}


public class S_PracticeSet11Part2 
{

	public static void main(String[] args) 
	{
		
		//Problem 5: Polymorphism
		Mammal you = new Human();
		you.eat();
		((Human) you).speak();
		
	}

}
