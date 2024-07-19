//lecture 70  Creating Thread using Thread class.

package com.multiThreading;


class Thread1 extends Thread
{
	private int i =0;
	@Override
	public void run()
	{
		while(i<100)
		{
		System.out.println("Eating........"+i); //Added the value of i in print statement to check the order of execution. It's quite interesting.
		i++;
		}
	}
}

class Thread2 extends Thread
{
	private int i =0;
	@Override
	public void run()
	{
		while(i<100)
		{
		System.out.println("Dancing.......");
		i++;
		}
	}
}

public class A_CreatingThread {

	public static void main(String[] args) 
	{
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		
		/*
		 In the output for some time t1 is executed and for some time t2 is. 
		 They are not executed simultaneously but they are managed simultaneously.
		 Some lines have o/p from t1 and some have o/p from t2 then again some lines have o/p from t1 and then t2.
		 This cycle continues until both the sentences (eating and dancing) are printed 10000 times (given condition).  
		 */
		t1.start();  //start contains run. 
		t2.start();
		System.out.println("Running thread1"); // This ran before t2.start(); maybe because t2.start(); was taking too much time, so it moved to execute syso.
		t1.run();
		
	}

}
