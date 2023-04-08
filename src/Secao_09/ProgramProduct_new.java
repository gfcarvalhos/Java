package Secao_09;

import java.util.Locale;
import java.util.Scanner;

import util.product_info_new;

public class ProgramProduct_new {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");	
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Price: ");
		double price = sc.nextDouble();
		//System.out.println("Quantity in stock: ");
		//int qnt = sc.nextInt();
		
		product_info_new product = new product_info_new(name, price);
		
		product.setName("Computer");
		product.setPrice(200.00);
		System.out.println("Update name: " + product.getName());
		System.out.println("Update price: " + product.getPrice());
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		sc.close();
	}

}
