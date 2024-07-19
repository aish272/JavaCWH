package com.multiThreading;

public class F_PracticeSet13 extends Thread
{ 
	private int i =0;
	public void run ()
	{
		while(i<100)
		{
			System.out.println("I'm "+this.getName());
			i++;
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				System.out.println("Caught exception: "+e);		
			}
		}
	}

	public static void main(String[] args) 
	{
		F_PracticeSet13 t1 = new F_PracticeSet13();
		F_PracticeSet13 t2 = new F_PracticeSet13();
		t2.setPriority(8);
	
		System.out.println("Priority of t1 "+t1.getPriority()); //Default priority is 5 which is normal priority.
		System.out.println("Priority of t2 "+t2.getPriority());
		
		System.out.println("State of t2 before running start method "+t2.getState());
		t2.start();
		System.out.println("Reference of current thread."+Thread.currentThread());
		System.out.println("State of t2 after running start method "+t2.getState());
		System.out.println("State of t2 after running start method "+t2.getState());// To check a change in the state, I've used it again.
		
		
		
		

	}

}
