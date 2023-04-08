package Aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Ativ_3_1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rectangle width and height: ");
		Rectangle lados = new Rectangle();
		lados.b = sc.nextDouble();
		lados.l = sc.nextDouble();
		
		System.out.printf("Area: %.2f%n", lados.area());
		System.out.printf("Perimeter: %.2f%n", lados.perimeter());
		System.out.printf("Diagonal: %.2f%n", lados.diagonal());
		
		sc.close();
	}

}
