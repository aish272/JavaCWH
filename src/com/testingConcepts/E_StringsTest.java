package com.testingConcepts;

public class E_StringsTest {

    public static void main(String[] args)
    {
        String s = "pop"; //An object in string constant pool for "pop" will be created with a hashcode
        System.out.println(s.hashCode());
        System.out.println("pop".hashCode());
        s = s.concat("tates");
        System.out.println(s.hashCode());
        System.out.println("poptates".hashCode());
        System.out.println(s);

        String s1 = new String("prop");
    }
}
