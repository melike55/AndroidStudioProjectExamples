package com.nur.javalearning;

public class Variables {
    public static void main(String[] args){
        System.out.println("hello java");
        System.out.println(5*2);
        int age=20;
        System.out.println(10+ age);
        System.out.println(age/5);
        int x=5;
        int y=11;
        System.out.println(y/x);
        long myLong=10;
        System.out.println(myLong/5);
        double z=5.0;
        double a=11.0;
        System.out.println(a/z);
        float myFloat=10.0f;
        System.out.println(myFloat);
        double pi=3.14;
        int r=5;
        System.out.println(2*r*pi);
        //String
        String name="James";
        String surname="Hetfield";
        name="Lars";
        System.out.println(name);
        System.out.println(surname);
        String fullname=name+" "+surname;
        System.out.println(fullname);
        //Boolean
        boolean isAlive=true;
        isAlive=false;
        System.out.println(isAlive);
        //Final
        final int myInteger=5;
        System.out.println("myInteger: "+myInteger);
        //myInteger=4;
        System.out.println("myInteger: "+myInteger);

    }
}
