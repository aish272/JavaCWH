//Lecture 40
package com.oop;

class AccessModDemo
{
	private int i ;
	private String designation;
	public void seti(int i)
	{
		this.i = i;
	}
	
	public void setDes(String des)
	{
		designation = des;
	}
	
	public void geti()
	{
		System.out.println(i);
	}
	public void getdes()
	{
		System.out.println(designation);
	}
}

public class C_AccessModifier {

	public static void main(String[] args)
	{
		AccessModDemo d1 = new AccessModDemo();
		d1.seti(9);
		d1.setDes("dev");
		d1.getdes();
		d1.geti();
		
	}

}
