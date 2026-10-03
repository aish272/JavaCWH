//Lecture 57
package com.oop;

interface Camera
{
	/*
	  1. Not mandatory for all the classes to implement this therefore, it must be defined in the interface.
	  2. It can be overridden in the class that implements this interface.
	  
	  Note: 1. Private method is supported from java 9 onwards. Refer to an article on geeks for geeks for an example.
	  		2. They can be called inside default methods for data hiding. 
	  		3. They must be defined.
	  		4. Private static method can also be called inside default methods.
	 */
	
	default void hdVideo()  
	{
		privMeth();
		privStatMeth();
		System.out.println("Capturing Hd video.");
		//multipleSnaps();  //calling static method inside default method. It is possible.
	}
	
	
	private void privMeth()
	{
		System.out.println("This is a private method.");
	}
	
	private static void privStatMeth()
	{
		System.out.println("This is a private static method.");
	}
	
	void takePic(); //abstract method.
	
	static void multipleSnaps()  //static method
	{
		System.out.println("Capturing multiple snaps.");
	}



}

interface Wifi
{
	String[] getAllWifi();
	void connectToWifi();	
}

class CellPhone 
{
	void makeCall(int num)
	{
		System.out.println("Calling "+num);
	}
}

class MySmartPhone extends CellPhone implements Wifi, Camera
{
	void openSpotify()   //Original Method of MySmartPhone
	{
		System.out.println("Opening Spotify!");
	}
	
	public String[] getAllWifi()  // Implemented Wifi Method
	{
		String[] wifiAvailable = {"My5g","JioFiber"};
		return wifiAvailable;
	}
	
	public void connectToWifi() // Implemented Wifi Method
	{
		System.out.println("Connecting to Wifi.........");
	}
	
	public void takePic() // Implemented Camera Method
	{
		System.out.println("Taking a snap!");
	}
	
	
}

public class P_DefaultMethods {

	
	public static void main(String[] args) 
	{
		MySmartPhone samFe = new MySmartPhone();
		samFe.openSpotify();
		String[] list = samFe.getAllWifi();
		for(String wifiname : list)
		{
			System.out.println(wifiname);
		}
		samFe.connectToWifi();
		samFe.takePic();
		samFe.makeCall(899);

		//samFe.multipleSnaps();  //Must be called using the interface in which it is declared. Because it is a static method.
		Camera.multipleSnaps();
		
		Camera c1 = new MySmartPhone();
		c1.hdVideo();//default method called using interface
		samFe.hdVideo();//default method called using child class
		//c1.multipleSnaps();  //Won't work. object is of type MySmartPhone
		
		MySmartPhone samFe5g = new MySmartPhone();
		//samFe5g.multipleSnaps();  // this worked when a new multipleSnaps was created in MySmartPhone
		

	}

}

