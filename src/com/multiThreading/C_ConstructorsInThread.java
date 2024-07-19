package com.multiThreading;

class MyThread extends Thread
{
	//The class thread contains a variable called 'name'(or something else which stores the name of the thread)
	//and this passed argument 'name' is assigned to the variable declared in the class Thread. 
	//We are using super keyword to call the constructor of Thread class and passing the argument 'name'.
	//This constructor of Thread class will set the name of the constructor.
	//If we did not use the super keyword then Thread-0 and Thread-1 names were printed.
	
	MyThread(Runnable bullet, String name)
	
	{
		super(name);  
		System.out.println("Constructor with Runnable bullet, String name formal arguments.");
	}
	
	MyThread( String name)
	
	{
		super(name);
		System.out.println("Constructor with String name formal argument.");
	}
	
	public void run ()
	{
		System.out.println("I'm run method from MyThread Class.");
	}
	
	
}

class Runnable3 implements Runnable
{
	public void run ()
	{
		System.out.println("I'm run method from runnable 3.");
	}
}
public class C_ConstructorsInThread 
{

	public static void main(String[] args) 
	{
		//My thread constructor with just one argument which is the name of the thread.
		MyThread thWith1arg = new MyThread("thWith1arg");
		
		Runnable3 bullet1 = new Runnable3();
		//My thread constructor with two argument which are the name of the thread and object of runnable3 which implements runnable interface.
		MyThread thWith2args = new MyThread(bullet1,"thWith2args");
		
		thWith1arg.start();
		thWith2args.start();
		System.out.println("Name of thread with 1 argument "+thWith1arg.getName()+" and id of the same thread is "+thWith1arg.getId());
		System.out.println("Name of thread with 2 argument "+thWith2args.getName()+" and id of the same thread is "+thWith2args.getId());
		
	}

}
