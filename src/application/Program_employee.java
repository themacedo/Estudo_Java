package src.application;


import java.util.Locale;
import java.util.Scanner;

import src.entities.employee;

public class Program_employee {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        employee x;
        x = new employee();

        System.out.println("Enter name of employee: ");
        x.name = sc.nextLine();

        System.out.println("Enter Gross Salary: ");
        x.GrossSalary = sc.nextDouble();

        System.out.println("Enter Tax: ");
        x.Tax = sc.nextDouble();



        System.out.println();
        System.out.println("Employee: " + x.name + ", " + " $ " + x.NetSalary());

        System.out.println();
        System.out.println("Which percentage to increase salary: ");
        x.Percentage = sc.nextDouble();

        System.out.println();
        System.out.println("Update Data: " + x.name + ", " + "$ " + x.IncreaseSalary());

        sc.close();
    }
}
