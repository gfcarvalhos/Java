package Secao_10;

import java.util.Locale;
import java.util.Scanner;

public class Problem_negativos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números voce vai digitar? ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		
		for (int i=0;i<vect.length;i++) {
			//sc.nextLine();
			System.out.println("Digite um número: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS NEGATIVOS:");
		for (int i=0;i<vect.length;i++) {
			if (vect[i]<0) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();
	}

}
