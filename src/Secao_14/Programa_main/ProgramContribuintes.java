package Secao_14.Programa_main;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Secao_14.Entities.Contribuintes.ContribuintesModel;
import Secao_14.Entities.Contribuintes.PessoaFisica;
import Secao_14.Entities.Contribuintes.PessoaJuridica;

public class ProgramContribuintes {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<ContribuintesModel> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers:");
		int x = sc.nextInt();
		
		for (int i=1; i<=x;i++) {
			System.out.println("Tax payer #"+i+" data:");
			System.out.print("Individual or company (i/c)?: ");
			char type = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Annual income: ");
			Double income = sc.nextDouble();
			if (type == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpend = sc.nextDouble();
				list.add(new PessoaFisica(name, income, healthExpend));
			}
			else {
				System.out.print("Number of employees: ");
				int numberOfemployees = sc.nextInt();
				sc.nextLine();
				list.add(new PessoaJuridica(name, income, numberOfemployees));
			}
		}
		System.out.println();
		double sum = 0.0;
		System.out.println("TAXES PAID: ");
		for (ContribuintesModel obj: list) {
			System.out.println(obj.getNome()+ ": $ " + String.format("%.2f", obj.imposto()));
			sum += obj.imposto();
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES : $ " + String.format("%.2f", sum));

		sc.close();

	}

}
