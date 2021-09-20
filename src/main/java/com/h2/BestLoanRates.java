package com.h2;

import java.util.Scanner;
import java.util.Map;

public class BestLoanRates {

    public static final Map<Integer, Float> bestRates;

    static {
        bestRates = Map.of(1, 5.50f, 2, 3.45f, 3, 2.67f);
    }

    public static void main( String[] args )
    {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter your name");
        String name  = myObj.nextLine();  // Read user input
        System.out.println("Hello " + name );  // Output user input

        System.out.println("Enter the loan term (in years)");
        int loanTermInYears  = myObj.nextInt();  // Read user input

        float bestRate = getRates(loanTermInYears);

        if (bestRate == 0) {
            System.out.println("No available rates for term: " + loanTermInYears + " years"  );
        } else {
            System.out.println("Best Available Rate: " + getRates(loanTermInYears) + "%"  );
        }
        myObj.close();
    }

    public static float getRates(int     loanTermInYears ) {
        float retorno = 0.0f;
        if (bestRates.containsKey(loanTermInYears)) retorno = bestRates.get(loanTermInYears);
        return (retorno);
    }
}
