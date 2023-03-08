package src.application;

import java.util.Locale;
import java.util.Scanner;

import src.entities.CurrencyConverter;
import src.entities.calculator2;

public class Program_dolar {


    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("What is the dollar price? ");
        double dollar = sc.nextDouble();

        System.out.println("How many dollars will be bought? ");
        double vdollar = sc.nextDouble();

        double c = CurrencyConverter.converter(dollar, vdollar);


        System.out.println("Amount to be paid in reais = : " + c);


        sc.close();
    }


}