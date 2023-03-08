package src.application;


import java.util.Locale;
import java.util.Scanner;

import src.entities.calculator;

public class Program_StaticMember_v2 {



    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        calculator calc = new calculator();

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = calc.circumference(radius);

        double v = calc.volume(radius);


        System.out.println("Circumference: " + c);


        System.out.println("Volume: " + v);


        System.out.println("PI value: " + calc.PI);


        sc.close();
    }




}
