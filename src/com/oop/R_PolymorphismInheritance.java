//Lecture 59

package com.oop;

interface Spotify
{
	void playSong();
	
}

interface Whatsapp
{
	void sendMsg();
	void receiveMsg();
}

interface MakeCall
{
	void call();
}

class ModernPhone implements Spotify, Whatsapp, MakeCall

{

	@Override
	public void call() 
	{
		System.out.println("Calling..........");
		
	}

	@Override
	public void sendMsg() 
	{
		System.out.println("Sending Message..........");
		
	}

	@Override
	public void receiveMsg() 
	{
		System.out.println("Received!");
		
	}

	@Override
	public void playSong() 
	{
		System.out.println("Playing from your fav playlist.");
	}
	
}
public class R_PolymorphismInheritance 
{

	public static void main(String[] args) 
	{
		/* 
		 ModernPhone can be used to use Spotify, Wa and to make a call. If the reference is Spotify then you can 
		 not call a method which is declared in Whatsapp.
		 
		 For e.g. If you open Spotify on your phone then you can't send a Whatsapp msg.
		 */
		
		Spotify playSong = new ModernPhone();
		playSong.playSong();
		//playSong.sendMsg(); //won't work. Reference is Spotify.
		((Whatsapp) playSong).sendMsg(); //Typecasting to Whatsapp works.
		

	}

}
