//Lecture 6

package com.basicsofjava;
import java.util.Scanner;
public class C_PracticeProgram1 {

	public static void main(String[] args)
	{
		short total;
		float avg;
		short eng, hin, maths, phy, chem;
		Scanner marks = new Scanner(System.in);
		System.out.println("Enter the marks of subjects against their names.");
		System.out.println("English: ");
		eng = marks.nextShort();
		System.out.println("Hindi: ");
		hin = marks.nextShort();
		System.out.println("Maths: ");
		maths = marks.nextShort();
		System.out.println("Physics: ");
		phy = marks.nextShort();
		System.out.println("Chemistry: ");
		chem = marks.nextShort();
		total = (short) (eng+hin+maths+phy+chem);
		avg = total/5;
		System.out.println("The average is: "+avg);
		
		marks.close();
		
	}

}
