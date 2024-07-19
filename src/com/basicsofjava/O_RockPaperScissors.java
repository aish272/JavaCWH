//Video No. 20

package com.basicsofjava;
import java.util.Random;
import java.util.Scanner;

public class O_RockPaperScissors {

	public static void main(String[] args) 
	{
		Random randNum = new Random();
		Scanner ip = new Scanner(System.in);
		int botChoice = randNum.nextInt(3);
		System.out.println("Enter your choice:\n0 For Paper\n1 For Scissors\n2 For Rock");
		byte userChoice = ip.nextByte();
		System.out.println("The bot's choice: "+botChoice);
		switch(userChoice)
		{
			case 0:
			{
				if(botChoice==1)
					System.out.println("You Lost!");
				else if(botChoice==2)
					System.out.println("You Won!");
				else
					System.out.println("Draw!");
			}
			break;
			case 1:
			{
				if(botChoice==2)
					System.out.println("You Lost!");
				else if(botChoice==0)
					System.out.println("You Won!");
				else
					System.out.println("Draw!");
			}
			break;
			case 2:
			{
				if(botChoice==0)
					System.out.println("You Lost!");
				else if(botChoice==1)
					System.out.println("You Won!");
				else
					System.out.println("Draw!");
			}
			break;
			default:
				System.out.println("Invalid Input!");
		}
		ip.close();
	}

}
