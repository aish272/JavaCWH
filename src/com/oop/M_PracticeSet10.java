//Video No. 52

package com.oop;

//Problem 1 and 3

class Circle
{
	int radius;
	public float area()
	{
		return (float) (Math.PI*radius*radius);
	}
	public int getRadius() {
		return radius;
	}
	public float cirumference()
	{
		return (float) (2*Math.PI*radius);
	}
}

class Cylinder1 extends Circle
{
	 int height;
	 public void setHeightRad(int r, int h)
	 {
		 height = h;
		 radius = r; //declared in base class.
	 }
	 public float surfaceArea()
	 {
		 return (float)((2*Math.PI*radius*height)+(2*Math.PI*radius*radius));
	 }
	 public float volume()
	 {
		 return (float) (Math.PI*radius*radius*height);
	 }
	 
	 
}

public class M_PracticeSet10 
{

	public static void main(String[] args) 
	{
		Cylinder1 c1 = new Cylinder1();
		c1.setHeightRad(7, 9);
		System.out.println(c1.surfaceArea());
		System.out.println(c1.volume());
				

	}

}
