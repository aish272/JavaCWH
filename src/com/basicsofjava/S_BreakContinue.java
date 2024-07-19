//Lecture 24

package com.basicsofjava;
import java.util.Scanner;


public class S_BreakContinue {

	public static void main(String[] args) 
	{
		
		//demonstrating break
		String str = "Lola Cola Dola re dola gola shola";
		Scanner scan = new Scanner(str); // this will scan the str string.
	
		while (scan.hasNext())
		{
			String str1 = scan.next();
			if (str1.equals("gola")) // == didn't work. It will break when the value of str1 becomes "gola".
				break;
			System.out.println("The substring is "+str1);
		}
		scan.close();
		
		
		//demonstrating continue
		int i =0;
		System.out.print("Enter the number of common multiples of 3 and 4 you wish to get printed: ");
		Scanner ip = new Scanner(System.in);
		int n = ip.nextInt();
		do 
		{
			i++;
			if (i%3!=0 || i%4!=0)  // i must be multiple of both 4 and 3 otherwise the loop will move to the next iteration.
				continue;
			System.out.println(i);
			n--;
			
		}while(n!=0);
		
		ip.close();
	}

}
