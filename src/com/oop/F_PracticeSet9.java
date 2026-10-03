//Lecture 44
package com.oop;

/**
 * @author aishwarya_mishra
 *
 */
//Problem 1, 2 and 3
//Using getter and constructor.
class Cylinder
{
	private float height;
	private float radius;
	public Cylinder(int height, int radius) //int will be converted to float automatically.
	{
		this.height = height;
		this.radius = radius;
	}
	public float getHeight() {
		return height;
	}
	public float getRadius() {
		return radius;
	}
	public float getSurfaceArea()
	{
		return (float) ( ( 2*Math.PI*radius*height)+ (2*Math.PI*radius*radius));  //2Πrh + 2Πr²
	}
	
	public float getVolume()
	{
		return (float) (Math.PI*radius*radius*height); //Πr²h
	}
	
}

//Problem 5
//Using getter and setter methods and not using constructor.
class Sphere
{
	private float radius;

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public float getSurfaceArea()
	{
		return (float) ((4*Math.PI*radius*radius));  //4Πr²
	}
	public float getVolume()
	{
		return (float) ((4/3f)*Math.PI*radius*radius*radius);//  4/3Πr³
	}
	
}
public class F_PracticeSet9 {

	
	public static void main(String[] args) 
	{
		Cylinder c = new Cylinder(8,7);
		System.out.println("The height is "+c.getHeight());
		System.out.println("The radius is "+c.getRadius());
		System.out.println("The surface area is "+c.getSurfaceArea());
		System.out.println("The volume is "+c.getVolume());
		
		Sphere s = new Sphere();
		s.setRadius(8); //no need to pass 8f.
		System.out.println("The radius is "+s.getRadius());
		System.out.println("The surface area is "+s.getSurfaceArea());
		System.out.println("The volume is "+s.getVolume());
		
		
		

	}

}
