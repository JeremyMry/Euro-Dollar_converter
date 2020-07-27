package com.jeremy.stockscraping;

import java.util.Scanner;

public class FinalChoice {

    Converter converter;

    public FinalChoice(Converter converter) {
        this.converter = converter;
    }

    public void FinalChoiceDollar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("If you want to enter another value (enter Y), swap the convert order (enter S) or quit the app (enter Q):");
        String choice = sc.nextLine();

        if (choice.contains("Y")) {
            converter.ConvertDollarToEuro();
        } else if (choice.contains("S"))  {
            converter.ConvertEuroToDollar();
        } else {
            System.out.println("Bye !");
            System.exit(0);
        }
    }

    public void FinalChoiceEuro() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to enter another value (enter Y), swap the convert order (enter S) or quit the app (enter Q):");
        String choice = sc.nextLine();

        if (choice.contains("Y")) {
            converter.ConvertEuroToDollar();
        } else if (choice.contains("S"))  {
            converter.ConvertDollarToEuro();
        } else {
            System.out.println("Bye !");
            System.exit(0);
        }
    }
}
