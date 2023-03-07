package src.application;

import java.util.Scanner;
import java.util.Locale;

import src.entities.product;

import java.util.Locale;

public class program_estoque {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        product produto = new product();

        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        produto.name = sc.nextLine();
        System.out.println("Price: ");
        produto.price = sc.nextDouble();
        System.out.println("Quantity in stock: ");
        produto.quantity = sc.nextInt();

        System.out.println();
        System.out.println("Product data: " + produto);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
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

