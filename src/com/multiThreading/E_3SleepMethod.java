package com.multiThreading;

class Thread_1 extends Thread
{
	
	private int i=0;
	public void run()
	{		
		while(i<100)
		{
			System.out.println("Thread without sleep method. "+ this.getName());
			i++;  //Commenting this will make the while loop infinite.
			
		}
	}
}

public class E_3SleepMethod extends Thread
{
	private int i=0;

	public void run()
	{		
		while(i<100)
		{
			System.out.println("Thread with sleep method. "+ this.getName());
			i++;  //Commenting this will make the while loop infinite.
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) 
	{
		E_3SleepMethod t1 = new E_3SleepMethod();  // This will run less because it has sleep method.
		Thread_1 t2 = new Thread_1();
		t1.start();
		t2.start();
		
	}
}
