package com.basicsofjava;

public class X_PracticeSet6 {

	public static void main(String[] args) 
	{
		//problem 1 and 3: 
		float [] marks = {23.5f,90.8f,78.9f,89.0f};
		float sum =0;
		for (float element: marks)
		{
			sum+= element;
		}
		System.out.printf("The sum is %f and the average is %f.",sum,sum/4);
		System.out.println();
		
		//problem 2:
		boolean check = true;
		float toBeChecked = 99.0f;
		
		for(float element: marks)
		{
			if (element==toBeChecked)
			{
				System.out.println("Found");
				check = false;
				break;
			}
		}
		if (check) 
		{
			System.out.println("Not Found");
		}
		
		//problem 4:
		int[][] arr1 = new int[2][3];
		int[][] arr2 = new int[2][3];
		int[][] sumArr = new int[2][3];
		arr1 [0][0] = 2;
		arr1 [0][1] = 2;
		arr1 [0][2] = 3;
		arr1 [1][0] = 3;
		arr1 [1][1] = 4;
		arr1 [1][2] = 4;
		arr2 [0][0] = 2;
		arr2 [0][1] = 2;
		arr2 [0][2] = 3;
		arr2 [1][0] = 3;
		arr2 [1][1] = 4;
		arr2 [1][2] = 4;
		for (int outerArr = 0;outerArr<arr1.length;outerArr++)
		{
			for (int innerArr=0;innerArr<arr1[outerArr].length;innerArr++)
			{
				sumArr[outerArr][innerArr] = arr1[outerArr][innerArr] +arr2[outerArr][innerArr];
				System.out.print(sumArr[outerArr][innerArr]+" ");
			}
			System.out.println();
		}
		
		//Checking initialization of array
		int [] arr3 = {1,2 };
		int [] arr4 = new int [2];
		for (int i=0; i<2;i++)
		{
			//System.out.print(arr4[i]+" "); //initially the array is initialized with zero.
			arr4[i] = arr3[i] +arr4[i];
		}
		
		//Problem 5 Array reversal
		int[] revArr = {9,8,7,6};
		int len = revArr.length;
		int halfLen = Math.floorDiv(len,2); //revArr.length/2 can be used too.
		int count;
		for ( count =0;count<halfLen;count++)
		{
			int temp = revArr[count];
			revArr [count] = revArr[len-1-count];
			revArr[len-1-count] = temp;
		}
		for(count=0;count<len;count++)
			System.out.print(revArr[count]+ " ");
			System.out.println();
		
		/*Problem 8 checking if array is sorted in ascending order or not.
		  Problem 6 Find Max element.
		  Problem 7 Find Min element.
		 */
		
		/*
		      if one element is greater than the next element then array will
		      be declared "not sorted" and flag will be updated.
		      System.out.println(Integer.MIN_VALUE); //to print minimum value of integer in Java.
		      System.out.println(Integer.MAX_VALUE); //to print maximum value of integer in Java.
		*/
		int max = revArr[0];
		int min = revArr[0];
		boolean flag = false;
		for (count=0;count<len-1;count++)
		{ 
			if(revArr[count] >revArr[count+1]) 
			{								   
				flag = true;		
			}
			
			/*
				 max has element at index 0 and it is compared with element at index 1 in the first iteration. 
				 This loop will run for "total length -1" times. In for loop we are subtracting length by 1. 
				 Comparison will be done till the last element which is at index 9.
				 
				 Same goes for finding the minimum element.
			 */
			
			if (max< revArr[count+1])
			{
				max = revArr[count+1];
			}
			
			if (revArr[count+1]<min)
			{
				min = revArr[count+1];
			}
				
		}
		System.out.println("Minimum number: "+min);
		System.out.println("Maximum number: "+max);
		if (flag)
		{
			System.out.println("Not sorted");
			
		}
		else 
		{
			System.out.println("Sorted");
		}
				
	}

}
