//Lecture 42 Constructors and overloading in constructors

package com.oop;

class Movie
{
	String movieName;
	int rating;
	int ticPrice;
	public Movie()
	{
		movieName= "k3g";
		rating =5;
		ticPrice = 0;
	}
	public Movie(int rate, int ticprice, String name)
	{
		movieName= name;
		rating =rate;
		this.ticPrice = ticprice;
	}
	
	public Movie(int ticprice, String name)
	{
		movieName= name;
		//rating =5;
		this.ticPrice = ticprice;
	}
	
	public void printDeets()
	{
		System.out.printf("Movie name: %s Rating: %d Ticket Price: %d",movieName,rating,ticPrice);
		System.out.println();
	}
	
	
}



public class D_Constuctors {

	public static void main(String[] args) 
	{
	    Movie fav = new Movie();
	    Movie fav2 = new Movie(5,80,"Room");
	    Movie fav3 = new Movie(100,"Troy");
	    fav.printDeets();
	    fav2.printDeets();
	    fav3.printDeets();

	}

}
