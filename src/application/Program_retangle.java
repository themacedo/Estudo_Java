package src.application;


import java.util.Locale;
import java.util.Scanner;

import src.entities.Retangle;

public class Program_retangle {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangle x;
        x = new Retangle();

        System.out.println("Enter rectangle width: ");
        x.width = sc.nextDouble();

        System.out.println("Enter rectangle height: ");
        x.height = sc.nextDouble();

        double area = x.area();
        double perimeter = x.perimeter();
        double diagonal = x.diagonal();

        System.out.println();
        System.out.println("Area: " + area);

        System.out.println();
        System.out.println("Perimeter: " + perimeter);

        System.out.println();
        System.out.println("Diagonal: " + diagonal);

        sc.close();
    }
}
