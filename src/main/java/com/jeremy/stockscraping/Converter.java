package com.jeremy.stockscraping;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Scanner;

public class Converter {

    private ScrapeCurrencyCourt  c = new ScrapeCurrencyCourt();
    private FinalChoice choice = new FinalChoice(this);

    public void ConvertEuroToDollar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the amount of Euros you want to convert in Dollars: ");
        String euro = sc.nextLine();
        double nb = Double.parseDouble(euro);
        try {
            double d = c.extractDataWithJsoup("https://www.capital.fr/devises/cours/EUR/USD");
            DecimalFormat df = new DecimalFormat("#.##");
            System.out.println(euro + "e are equals to " + df.format(nb*d) + "$");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        choice.FinalChoiceEuro();
    }

    public void ConvertDollarToEuro() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the amount of Dollars you want to convert in Euros: ");
        String dollar = sc.nextLine();
        double nb = Double.parseDouble(dollar);
        try {
            double d = c.extractDataWithJsoup("https://www.capital.fr/devises/cours/EUR/USD");
            DecimalFormat df = new DecimalFormat("#.##");
            System.out.println(dollar + "$ are equals to " + df.format(nb/d) + "e");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        choice.FinalChoiceDollar();
    }
}
