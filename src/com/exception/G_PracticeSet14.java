//Video Number 86

package com.exception;
import java.util.Scanner;

//For solution 3, 4 and 5
class IndexOutOfBoundException extends Exception
{
	public String getMessage()
	{
		return "Array index out of bound";
	}
	
	public String toString()
	{
		return "Given Array index is greater than array length.";
	}
}

public class G_PracticeSet14 
{
	//For solution 3, 4 and 5
	public static void correctIndex(int[] arr, int length)
	{
		Scanner sc = new Scanner(System.in);
		int attempts = 0;
		
		while(attempts<5)
		{
			try	
			{
				
				System.out.println("Attempt "+(attempts+1));
				System.out.println("Enter the index");
				int index = sc.nextInt();
				if(index>=length)
				{
					throw new IndexOutOfBoundException();
				}
				System.out.println("The array element "+arr[index]);
				break;
			}
			catch(IndexOutOfBoundException e)	
			{
				System.out.println("Invalid index");
				attempts++;
			}
		}
		
		if (attempts==5)
		{
			System.out.println("Error");
			IndexOutOfBoundException e = new IndexOutOfBoundException();
			System.out.println(e.getMessage());
		}
		
		
		sc.close();
	}
	
	public static void add(int a, int b)
	{
		System.out.println("answer"+a+b);
	}
	public static void main(String[] args) 
	{
		//For solution 3, 4 and 5
		int[] arr = new int[3];
		arr[0] = 8;
		arr[1] = 6;
		arr[2] = 4;
		correctIndex(arr, 3);
		
		//For solution 2
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a");
		int a;
		a = sc.nextInt();
		System.out.println("Enter b");
		int b = sc.nextInt();
//		try
//		{
//			add(a,b);
//		}
//		catch (IllegalArgumentException e) 
//		{
//			System.out.println(e.getMessage());
//			System.out.println("Haha");
//		}
	}

}
