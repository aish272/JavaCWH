package com.multiThreading;

class Thread_01 extends Thread
{
	
	private int i=0;
	public void run()
	{		
		while(i<5)
		{
			System.out.println("Thread without sleep method. "+ this.getName());
			i++;  //Commenting this will make the while loop infinite.
			
		}
	}
}

public class E_4Interrupt extends Thread
{
	private int i=0;

	public void run()
	{		
		while(i<5)
		{
			System.out.println("Thread with sleep method. "+ this.getName());
			i++;  //Commenting this will make the while loop infinite.
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				System.out.println("Caught exception: "+e);
			}
		}
		System.out.println("Thread is running."); //To show that the thread comes out of the sleeping state, but it does not stop working.
	}

	public static void main(String[] args) 
	{
		E_4Interrupt t1 = new E_4Interrupt();  // This class contains sleep method.
		t1.start();
		t1.interrupt();
		System.out.println("Main thread");
		
		/*
		   This is to show the below mentioned fact.
		   
		  -> The interrupt() method will not throw the InterruptedException 
		   if the thread is not in the sleeping/blocked state, but the interrupt flag will be changed to true.
		  
		 */
		Thread_01 t2 = new Thread_01(); // This class does not contain sleep method.
		t2.start();
		t2.interrupt();
		

	}

}
