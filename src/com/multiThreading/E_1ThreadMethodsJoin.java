package com.multiThreading;

public class E_1ThreadMethodsJoin  extends Thread
{
	private int i=0;

	public void run()
	{
		
		while(i<100)
		{
			System.out.println("Thread name "+ this.getName());
			//i++;  //Commenting this will make the while loop infinite.
		}
	}
	
	public static void main(String[] args) 
	{
		E_1ThreadMethodsJoin t1 = new E_1ThreadMethodsJoin();
		E_1ThreadMethodsJoin t2 = new E_1ThreadMethodsJoin();
		
		/*
		   IMPORTANT :
		   If While loop is infinite t1's execution will never stop and t2 will never run because of join method. 
		 */
		t1.start(); 
		try {
			t1.join(); //This is used to make sure that the execution of t1 is completed first before any other thread.
		} 
		catch (InterruptedException e) 
		{	
			e.printStackTrace();
		}
		t2.start(); //This will be executed after t1.

	}

}
