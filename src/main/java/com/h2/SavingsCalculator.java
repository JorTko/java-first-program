package com.h2;

import java.time.LocalDate;
import java.time.YearMonth;

public class SavingsCalculator {

    private float[] credits;
    private float[] debits;




    public  SavingsCalculator(float[] credits,  float[] debits) {
        this.credits = credits;
        this.debits = debits;
    }


    public static void main( String[] args )
    {
        String[] creditsAsString = args[0].split(",");
        String[] debitsAsString = args[1].split(",");

        creditsAsString = "10.0,20.0".split(",");
        debitsAsString = "5.0".split(",");
        float[] credits =  new float[creditsAsString.length];
        float[] debits =  new float[creditsAsString.length];
        for(int i=0; i < creditsAsString.length; i++) credits[i]=Float.parseFloat(creditsAsString[i]);
        for(int i=0; i < debitsAsString.length; i++) debits[i]=Float.parseFloat(debitsAsString[i]);

        SavingsCalculator calculator;
        calculator = new SavingsCalculator(credits, debits);
        float netSavings =  calculator.calculate();



    }

    private float sumOfCredits() {
        float sum = 0f;
        for(float credit : this.credits){
            sum += credit;
        }

        return sum;
    }

    private float sumOfDebits() {
        float sum = 0f;
        for(float Debit : this.debits){
            sum += Debit;
        }

        return sum;
    }

    private static int remainingDaysInMonth(LocalDate date) {
        YearMonth yearMonth = YearMonth.of(date.getYear(), date.getMonth());
        int totalDaysInMonth = yearMonth.lengthOfMonth();
        int remainingDays = totalDaysInMonth - date.getDayOfMonth();
        return remainingDays;
    }

    public float calculate() {
        return sumOfCredits() - sumOfDebits();
        //System.out.println("Net Savings = " + netSavings + ", remaining days in month = " + calculator.remainingDaysInMonth());
    }
}
