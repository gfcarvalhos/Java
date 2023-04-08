package Secao_10;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números voce vai digitar? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		double soma = 0.0;
		
		for (int i=0;i<vect.length;i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
			soma += vect[i];
		}
		
		System.out.println();
		System.out.print("VALORES= ");
		for (int i=0;i<vect.length;i++) {
			System.out.printf("%.1f ", vect[i]);
		}
		
		System.out.println();
		System.out.printf("SOMA = %.2f%n", soma);
		System.out.printf("MÉDIA = %.2f", soma/vect.length);
		
		sc.close();
	}

}
