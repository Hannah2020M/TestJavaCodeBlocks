package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Test java code blocks");
        System.out.println(arrayTestCode1aDeclare.h1);

        //Array Declaration
        int[] array;
        //Array Initialization
        array = new int[]{1,2,3,4,5};
        //Printing the elements of array
        for (int i =0;i < 5;i++)
        {
            System.out.println(array[i]);
        }

        String[] someWords;
        someWords = new String[]{"hello", "world", "123", "LaunchCode ROCKS!", "Java"};
        System.out.println(someWords[1]);

        String[] arr1a = new String[5];
        arr1a = new String[]{"dear", "deer", "clear", "area", "clearly"};
        System.out.println(arr1a[1]);

        String[] alsoArray = {"figment","of","imagination"};
        System.out.println(alsoArray[2]);
        System.out.println(arr1a);
        System.out.print("{");
        for (int i=0; i<arr1a.length;i++){

            System.out.print( arr1a[i] +",");
        } System.out.println("}");
    }
}
