package com.jeremy.stockscraping;

import java.util.Scanner;

public class CurrencyChoice {

    Converter converter = new Converter();

    public void ChooseCurrency() {
        Scanner sc = new Scanner(System.in);
        System.out.println("If you want to convert Euros to Dollars enter E, if you prefer convert Dollars to Euros enter D: ");
        String choice = sc.nextLine();

        if (choice.contains("E")) {
            converter.ConvertEuroToDollar();
        } else if (choice.contains("D")) {
            converter.ConvertDollarToEuro();
        } else {
            System.out.println("Wrong input, try again !");
            ChooseCurrency();
        }
    }
}
