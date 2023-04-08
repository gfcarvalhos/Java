package Secao_10;

import java.util.Locale;
import java.util.Scanner;

import entities.Alturas_alunos;

public class Alturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		Alturas_alunos[] vect = new Alturas_alunos[n];
		
		for (int i=0; i<vect.length;i++) {
			sc.nextLine();
			System.out.printf("Dados da %da pessoa: \n",i+1);
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			vect[i] = new Alturas_alunos(name, age, height);
			
		}
		
		double soma = 0.0;
		double count = 0.0;
		for (int i=0;i<vect.length;i++) {
			soma += vect[i].getHeight();
			if (vect[i].getAge()<16) {
				count += 1.0;
			}
		}
		
		System.out.println();
		System.out.printf("Altura média: %.2f%n", soma/vect.length);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", 100*count/vect.length);
		
		for (int i=0;i<vect.length;i++) {
			if (vect[i].getAge()<16) {
				System.out.println(vect[i].getName());
			}
		}
		
		sc.close();
	}

}
