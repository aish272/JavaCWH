package com.multiThreading;


class ItIsThread extends Thread
{
	private int i =0;
	ItIsThread(String name)
	{
		super(name);
	}
	
	public void run()
	{
		while(i<25)
		{
			/*
			 'this' is used to refer to the object and therefore the methods and 
			  the variable of that object can be called using 'this' keyword. 
			 */
			
			System.out.println("Running "+this.getName());
			i++;
		}
	}
}
public class D_PriorityInThreading 
{

	public static void main(String[] args) 
	{
		ItIsThread th1 = new ItIsThread("Thread1");
		ItIsThread th2 = new ItIsThread("Thread2");
		ItIsThread th3 = new ItIsThread("Thread3");
		ItIsThread th4 = new ItIsThread("Thread4");
		ItIsThread th5 = new ItIsThread("Thread5");
		
		/*
		 Thread.MAX_PRIORITY =10
		 Thread.NORM_PRIORITY =5
		 Thread.MIN_PRIORITY =1
		 Setting priority also depends upon the OS.
		 */
		th1.setPriority(Thread.MAX_PRIORITY);  //Value of Thread.MAX_PRIORITY is 10. So, Thread.MAX_PRIORITY can be replaced by 10.
		th2.setPriority(5);
		th3.setPriority(Thread.NORM_PRIORITY);
		th4.setPriority(Thread.MIN_PRIORITY);
		th5.setPriority(1);
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();
		
		
		
	}

}
