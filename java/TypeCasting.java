package com.fundamenatals.java;

public class TypeCasting {

    public static void main(String[] args) {

        /*
    Implicit Type Casting
     */

        byte age ;
        age = 35 ;
        int ageValue ;
        ageValue = age ;
        System.out.println("Age Value : " + ageValue);

        /*
        Explicit Type Casting
         */

        float value ;
        value = 2325.5f ;

        int intValue ;
        intValue = ( int ) value ;
        System.out.println(" Int Value : " + intValue);

    }




}
