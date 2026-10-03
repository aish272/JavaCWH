//Lecture 38

package com.oop;


class Shampoo
{
	int price;
	int quantityInMl;
	String type;
	public void functions()
	{
		System.out.println("Price : "+price+" Quantity: "+quantityInMl);
		if (type=="Natural")
			System.out.println("Soothing, Natural and cleanses hair.");
		else if (type=="Chemical")
			System.out.println("Chemical infused and cleanses hair");
	}
}

public class A_CreatingAclass {

	public static void main(String[] args) 
	{
		Shampoo ttc = new Shampoo();
		ttc.price = 549;
		ttc.quantityInMl = 90;
		ttc.type = "Natural";
		ttc.functions();
		
		
		Shampoo pantene = new Shampoo();
		pantene.price = 54;
		pantene.quantityInMl = 90;
		pantene.type = "Chemical";
		pantene.functions();


	}

}
