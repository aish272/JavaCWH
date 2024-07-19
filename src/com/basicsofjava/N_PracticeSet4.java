// video no. 19

package com.basicsofjava;
import java.util.Scanner;

public class N_PracticeSet4 {

	public static void main(String[] args) 
	{
		//problem 1: what will be the output?
//		int a = 11; //This will cause an error.
//		if (a=11)
//			System.out.println("Equal to 11.");
		
		//problem 2: Pass if all the subjects have marks above or equal to 33 and total average is 40 otherwise fail
		byte s1, s2, s3;
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter the marks of maths: ");
		s1 = ip.nextByte();
		System.out.print("Enter the marks of maths: ");
		s2 = ip.nextByte();
		System.out.print("Enter the marks of maths: ");
		s3 = ip.nextByte();
		float avg = (s1+s2+s3)/3.0f;
		if (avg>=40 && s1>=33 && s2>=33 && s3>=33)
		{
			System.out.println("You Passed!");
		}
		else
		{
			System.out.println("Oops failed!");
		}
		//problem 3: Calculate income tax
		System.out.print("Enter your income in lakhs. DO NOT ADD THE ZEROES.");
		float income = ip.nextFloat();
		float tax =0;
		if (income<=2.5)
		{
			System.out.println("You're tax free!");
		}
		else if(income>2.5 && income<=5.0)
		{
			tax = tax + (float) (0.05*(income -2.5));
		}
		else if(income>5.0 && income<=10.0)
		{
			tax = (float) (tax+ 0.05*(5.0-2.5));
			tax = tax + (float) (0.2*(income -5.0));
		}
		else
		{
			tax = (float) (tax+ 0.05*(5.0-2.5));
			tax = tax + (float) (0.2*(5.0-10.0));
			tax = (float) (tax + (float) (0.3)*(income - 10.0));
			
		}
		System.out.println("Payable tax is: "+tax);
		
		//problem 4:
		System.out.print("Enter the number of the day: ");
		int day = ip.nextInt();
		switch(day)
		{
			case 1:
				System.out.println("MONDAY");
				break;
				
			case 2:
				System.out.println("TUESDAY");
				break;
				
			case 3:
				System.out.println("WEDNESDAY");
				break;
				
			case 4:
				System.out.println("THURSDAY");
				break;
				
			case 5:
				System.out.println("FRIDAY");
				break;
				
			case 6:
				System.out.println("SATURDAY");
				break;
				
			case 7:
				System.out.println("SUNDAY");
				break;
		}
		
		//problem 5: leap year
		System.out.print("Enter an year: ");
		int year = ip.nextInt();
		if ((year%100==0) && (year%400!=0))
			System.out.println("Not a leap year.");
		else if (year%4==0)
			System.out.println("Leap year.");
		else 
			System.out.println("Not a leap year.");
		
		
		//problem 6: 
		ip.nextLine();
		System.out.println("Enter the name of your website.");
		String website = ip.nextLine();
		if (website.endsWith(".com"))
			System.out.println("Commercial website");
		else if (website.endsWith(".org"))
			System.out.println("Organisational website");
		else if (website.endsWith(".in"))
		System.out.println("Indian website");
		
		
		ip.close();
		
		
	}

}
