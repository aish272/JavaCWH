package com.multiThreading;

public class E_2SleepJoin extends Thread
{
	private int i=0;

	public void run()
	{		
		while(i<100)
		{
			System.out.println("Thread name "+ this.getName());
			//i++;  //Commenting this will make the while loop infinite.
			try {
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
		E_2SleepJoin t1 =  new E_2SleepJoin(); 
		E_2SleepJoin t2 =  new E_2SleepJoin(); 
		 t1.start();
		 try 
		 {
			t1.join(9000);  
			
			/*
			 * 9 secs is way too much, so t1's execution will be executed first. 
			 * 1 sec would have shown both the threads getting executed.
			 * t1.join(time to wait in milisecs) : You can also specify the time for which you need to wait for
			   the execution of a particular thread by using this method. ;  
			 */
		} 
		 catch (InterruptedException e) 
		{
			
			System.out.println("Caught exception: "+e);
		}
		 t2.start();  

	}

}
