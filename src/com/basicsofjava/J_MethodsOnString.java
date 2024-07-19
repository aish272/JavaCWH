package com.basicsofjava;

public class J_MethodsOnString {

	public static void main(String[] args)
	{
		String s1 = "FishBone";
		
		String s2 = new String(" dogbone ");
		
		//s1 = "jk"; //assigning new value.
		//s2 = "kl"; //assigning new value.
		//System.out.println(s1+s2);//jkkl. This worked.
		
		int length  =  s1.length();
		System.out.println("The length of the string is "+length);
		
		System.out.println(s1.toLowerCase());
		
		System.out.println(s2.toUpperCase());
		
		System.out.println(s2.trim());
		
		System.out.println(s2.startsWith("F")); //false
		
		System.out.println(s2.endsWith("F"));   //false
		
		System.out.println(s1.substring(1));
		
		System.out.println(s1.substring(1,6));
		
		System.out.println(s2.replace(' ','_'));
		
		System.out.println(s2.replace("bone","one"));
		
		System.out.println(s1.charAt(5));
		
		System.out.println(s2.indexOf('o'));
		
		System.out.println(s2.indexOf('o',4));
		
		
		String str = "elaelaela";
		System.out.println(str.lastIndexOf("ela"));
		System.out.println(str.lastIndexOf("ela",8)); //searches from backwards
		
		System.out.println(str.equals("ela"));
		
		System.out.println(s1.equalsIgnoreCase("fishbone"));

		System.out.println("harry\twilliam");

		System.out.println(s1.contains("on"));
		
		
		
		
		

	}

}
