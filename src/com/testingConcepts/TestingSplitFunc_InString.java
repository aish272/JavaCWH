package com.testingConcepts;

public class TestingSplitFunc_InString {
    public static void main(String[] args)
    {
        String str = "Please use temporary password 'rahulshettyacademy' to Login.";
        String [] str1  = str.split("'");
        for (String ele:str1)
        {
            System.out.println(ele);
        }
    }
}
