package curso_progamacao;

import java.util.Scanner;

public class Structure_repetitiva {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Exemplo 1
		int x = sc.nextInt();
		int soma = 0;

		while (x != 0) {
			soma += x;
			x = sc.nextInt();
		}
		System.out.println(soma);
		//Exemplo 2
		char resp;
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
			System.out.print("Deseja repetir (s/n)? ");
			resp = sc.next().charAt(0);
		} while (resp != 'n') ;
		sc.close();
	}
}
