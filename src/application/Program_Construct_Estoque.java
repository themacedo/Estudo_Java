package src.application;

import java.util.Scanner;
import java.util.Locale;

import src.entities.Product_construtores;

import java.util.Locale;

public class Program_Construct_Estoque {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);



        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Price: ");
        double price = sc.nextDouble();
        System.out.println("Quantity in stock: ");
        int quantity = sc.nextInt();

        Product_construtores produto = new Product_construtores(name, price, quantity);

        System.out.println();
        System.out.println("Product data: " + produto);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        quantity = sc.nextInt();
        produto.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + produto);

        System.out.println();
        System.out.println("Enter the number of products to be removed in stock: ");
        quantity = sc.nextInt();
        produto.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + produto);

        sc.close();
    }
}

