package com.multiThreading;

class Runnable1 implements Runnable
{

	@Override
	public void run() 
	{
	    int i =0;  //modifier is final
		while(i<100)
		{
			System.out.println("Rifle!!!!!!!");
			i++;
		}
	}
	
}

class Runnable2 implements Runnable
{

	@Override
	public void run() 
	{
		int i =0;  //modifier is final
		while(i<100)
		{
			System.out.println("Shotgun!!!!!!!");
			i++;
		}

		
	}
	
}

public class B_CreatingThreadRunnableInterface 
{

	public static void main(String[] args) 
	{
		/*
		  If we extend thread class we get a loaded gun(bullet = run method)  
		  whereas if we implement runnable interface you have to load the gun with bullet(runnable class object).
		 */
		
		Runnable1 rifBullet = new Runnable1();
		Thread rifle = new Thread(rifBullet);
		
		Runnable2 shotGunBullet = new Runnable2();
		Thread shotgun = new Thread(shotGunBullet);
		
		rifle.start();
		shotgun.start();
		

	}

}
