
package com.oop;

import java.util.Random;
import java.util.Scanner;

/**
 * @author aishwarya_mishra
 *
 */
class numGame
{
	int randNum;
	int userinput;
	int attempts;
	Scanner scan;
	Random randObj;
	boolean flag;
	public numGame() 
	{
		randObj = new Random();
		randNum = randObj.nextInt(101);	
		scan = new Scanner(System.in);
		attempts =0;
		flag = true;
	}

	public void input()
	{
		
		System.out.print("Enter the number: ");
		userinput = scan.nextInt();
		attempts++;
		
	}
	
	public void check()
	{
		while (flag)
		{
			if (attempts>10)
			{
				System.out.println("You have used all your 10 chances. Try next time.");
				flag = false;
				break;
			}
			if(randNum==userinput)
			{
				System.out.println("Attempt: "+attempts+"\nYou Won!");
				flag = false;
				break;
				
			}
			else if(randNum>userinput && (randNum-userinput)<=10)
			{
				System.out.println("Attempt: "+attempts+"\nToo close. Increase your number by 10 or less units.");
				userinput = scan.nextInt();
				attempts++;
			}
			
			else if(randNum>userinput && (randNum-userinput)>10)
			{
				System.out.println("Attempt: "+attempts+"\nIncrease your number by more than 10");
				userinput = scan.nextInt();
				attempts++;
			}
			
			else if(randNum<userinput && (userinput-randNum)<=10)
			{
				System.out.println("Attempt: "+attempts+"\nToo close. Decrease your number by 10 or less units.");
				userinput = scan.nextInt();
				attempts++;
			}
			
			else if(randNum<userinput && (userinput-randNum)>10)
			{
				System.out.println("Attempt: "+attempts+"\nDecrease your number by more than 10.");
				userinput = scan.nextInt();
				attempts++;
			}
		}
	}
	
}
public class E_GuessTheNumber {

	
	public static void main(String[] args) 
	{
		numGame player = new numGame();
		player.input();
		player.check();

	}

}
