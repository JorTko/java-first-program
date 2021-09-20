package com.h2;


import java.time.LocalDate;

public class App
{
    public static void main( String[] args )
    {
        String[] creditsAsString = args[0].split(",");
        String[] debitsAsString = args[1].split(",");

        float[] credits =  new float[creditsAsString.length];
        float[] debits =  new float[creditsAsString.length];
        for(int i=0; i < creditsAsString.length; i++) credits[i]=Float.parseFloat(creditsAsString[i]);
        for(int i=0; i < debitsAsString.length; i++) debits[i]=Float.parseFloat(debitsAsString[i]);

        SavingsCalculator calculator;
        calculator = new SavingsCalculator(credits, debits);
        float netSavings =  calculator.calculate();



    }
    public static void mainx( String[] args )
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
