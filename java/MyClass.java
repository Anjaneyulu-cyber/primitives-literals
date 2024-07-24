package com.fundamenatals.java;

public class MyClass {

    public static void main(String[] args) {
        char letter;
        letter = 'A';
        int asciiValue = (int)letter;
        System.out.println("ASCII Value of 'A' : " + asciiValue);

        char unicodeChar ;
        unicodeChar = '\u0041' ;
        System.out.println("Unicode Char : " + unicodeChar);

        int age = 35 ;
        double pi = 3.14159 ;
        char grade = 'A' ;
        String message = "Hello World !" ;
        boolean isJavaFun = true ;
        String str = null ;
        System.out.println("Age :" + age);
        System.out.println("Pi :" + pi);
        System.out.println("Grade :" + grade);
        System.out.println("Message :" + message);
        System.out.println(isJavaFun);
        System.out.println("Str :" + str);

    }
}
