package com.h2;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    private static int add(int[] numbers) {
        int sum = 0;

        for(Integer number : numbers){
           sum += number;
        }
        return (sum);
    }
    public static int doubleTheNumber(int number) {
        return (number * 2);
    }



}
