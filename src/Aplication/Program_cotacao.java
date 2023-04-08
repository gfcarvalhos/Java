package Aplication;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator_cotacao;

public class Program_cotacao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		double dollar = sc.nextDouble();
		System.out.println("How many dollars will be bought? ");
		double dollar_buy = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais is = %.2f", Calculator_cotacao.cotacao(dollar, dollar_buy));
		
		sc.close();
	}

}
