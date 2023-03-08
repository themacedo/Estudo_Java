package src.application;


import java.util.Locale;
import java.util.Scanner;

import src.entities.calculator2;

public class Program_StaticMember_v3 {


    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = calculator2.circumference(radius);

        double v = calculator2.volume(radius);


        System.out.println("Circumference: " + c);


        System.out.println("Volume: " + v);


        System.out.println("PI value: " + calculator2.PI);


        sc.close();
    }


}
