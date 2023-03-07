package src.application;

import java.util.Locale;
import java.util.Scanner;

import src.entities.triangle;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        triangle x, y;
        x = new triangle();
        y = new triangle();

        System.out.println("Digite o valor de xA: ");
        x.a = sc.nextDouble();

        System.out.println("Digite o valor de xB: ");
        x.b = sc.nextDouble();

        System.out.println("Digite o valor de xC: ");
        x.c = sc.nextDouble();


        System.out.println("Digite o valor de yA: ");
        y.a = sc.nextDouble();

        System.out.println("Digite o valor de yB: ");
        y.b = sc.nextDouble();

        System.out.println("Digite o valor de yC: ");
        y.c = sc.nextDouble();

        double areaX = x.area();

        double areaY = y.area();

        System.out.println("Area do triangulo X : " + areaX);

        System.out.println("Area do triangulo Y : " + areaY);

        if (areaX > areaY) {

            System.out.println("Maior area = X");

        } else {

            System.out.println("Maior area = Y");

        }

        sc.close();
    }
}
