//Lecture 39

package com.oop;
//Problem 1
class Employee
{ 
	int grade;
	int salary;
	public void setValues(int grade, int salary)
	{
		this.grade = grade;
		this.salary = salary;		
	}
	public void getValues()
	{
		System.out.println("The salary of the employee is: "+salary+" and the grade is: "+grade+".");
	}
	
}

//Problem 3,4 and 6
class Shapes
{
	char type;
	float side;
	float length, breadth;
	float radius;
	Shapes(char type)
	{
		this.type = type;
		
	}
	
	public void setSqDeets(float side)
	{
		this.side = side;
	}
	public void setRectDeets(float len, float br)
	{
		length = len;
		breadth = br;
	}
	public void setCircDeets(float rad)
	{
		radius = rad;
	}
	
	public void calculate ()
	{
		if(type=='S')
		{
			System.out.println("Area: "+side*side+" Perimeter: "+4*side);
		}
		else if(type=='R')
		{
			System.out.println("Area: "+length*breadth+" Perimeter: "+2*(length+breadth));
		}
		else if(type=='C')
		{
			System.out.println("Area: "+(3.14*radius*radius)+" Circumference: "+2*3.14*radius);
		}
		else
		{
			System.out.println("Entered Invalid type.");
		}
	}
}
public class B_PracticeSet8 {

	public static void main(String[] args) 
	{
		Employee emp1 = new Employee();
		emp1.setValues(3, 30000);
		emp1.getValues();
		 
		Shapes square= new Shapes('S');
		square.setSqDeets(8f);
		square.calculate();
		
		Shapes rect= new Shapes('R');
		rect.setRectDeets(8f,9.0f);
		rect.calculate();
		
		Shapes circ= new Shapes('C');
		circ.setCircDeets(8f);
		circ.calculate();
		
		Shapes square1= new Shapes('s');
		square1.setSqDeets(8);
		square1.calculate();
		
		//int is automatically converted to float if int is assigned to float.
		 int a =9;
		 float b;
		 b = a;
		 System.out.println(b);
		 
		 //to convert string to int
		 String h = "7";
		 a = Integer.parseInt(h);
		 System.out.println(a);
		
		

	}

}
