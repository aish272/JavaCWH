//Lecture 82

package com.exception;
import java.util.Scanner;
public class C_NestedTryCatch {

	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5,6,7,8};
		Scanner sc = new Scanner(System.in);
		int index;
		try 
		{
			System.out.println("Chance1\nEnter any valid index of the array ");
			index =  sc.nextInt();
			System.out.println("Array element at the given index is "+arr[index]);
			
		}
		catch(ArrayIndexOutOfBoundsException ar)
		{
			try 
			{
				System.out.println("Chance2\nEnter any valid index of the array ");
				index =  sc.nextInt();
				System.out.println("Array element at the given index is "+arr[index]);
			}
			
			catch(ArrayIndexOutOfBoundsException ar1)
			{
				try 
				{
					System.out.println("Final Chance\nEnter any valid index of the array ");
					index =  sc.nextInt();
					System.out.println("Array element at the given index is "+arr[index]);
				}
				
				catch(ArrayIndexOutOfBoundsException ar2)
				{
					
					System.out.println(ar2);
				}
			}
			
		}
		
				

	}

}
