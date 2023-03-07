package src.application;


import java.util.Locale;
import java.util.Scanner;

import src.entities.Aluno;

public class Program_Aluno {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno x;
        x = new Aluno();

        System.out.println("Enter name of Student: ");
        x.name = sc.nextLine();

        System.out.println("Enter with the student's first grade: ");
        x.N1 = sc.nextDouble();

        System.out.println("Enter with the student's second grade: ");
        x.N2 = sc.nextDouble();

        System.out.println("Enter with the student's third grade: ");
        x.N3 = sc.nextDouble();



        System.out.println();
        System.out.println("Final Grade = " + x.FinalGrade() );

        if (x.FinalGrade() > 60) {

            System.out.println();
            System.out.println("PASS ");

        }

        else {

            System.out.println();
            System.out.println("FAILED");
            System.out.println("Missing " + x.Missing() + " POINTS");

        }


        sc.close();
    }
}
