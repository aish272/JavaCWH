//Video no. 25

package com.basicsofjava;
import java.util.Scanner;
public class T_PracticeSet5 {

	public static void main(String[] args)
	{
		
		//Problem 1: Pattern Program
		int i =4,i2 =0;
		while(i!=0)
		{
			i2=i;
			while(i2!=0)
			{
			System.out.print("*");
			i2--;
			}
			i--;
			System.out.println();
			
		}
		
		//Problem 2: Sum of first n even numbers
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value of even numbers which have to be added: ");
		int n = scan.nextInt();
		int multipleOf2=0;
		int count1 =  1;
		while(count1<=n)
		{
			multipleOf2 += 2*count1;
			count1++;
		}
		System.out.println("The addition of even numbers is "+multipleOf2);
		
		//Problem 3, 4 and 8: Write a program to print the table of a given number in reverse or forward order
		System.out.print("Enter the num to print its table: ");
		n = scan.nextInt();
		System.out.println("Enter 1 for forward order\nEnter -1 for reverse order");
		byte order = scan.nextByte();
		int count =1;
		int total=0;
		while(count<=10)
		{
			if (order==1)
			{
				total += n*count;
				System.out.println(n*count);
				
			}
			else if (order==-1)
			{
				total += (n*10)-n*(count-1);
				System.out.println((n*10)-n*(count-1));
						
			}
			else {
				count =10;  // making the condition of while loop false so, "invalid Input" doesn't get printed 10 times.
				System.out.println("Invalid Input");
			}
			count++;
		}
		System.out.println("The total of all the mutiples is: "+total);
		
		//Problem 5: Factorial
		System.out.println("Enter number to find its factorial");
		n = scan.nextInt();
		scan.close();
		int fact=1;
		for(;n>1;n--) //no need to multiply by one so, n>1.
		{
			fact = fact*n;
			
			
		}
		System.out.println("The factorial is "+fact);
		
		
	}

}
