package Desafios.DesafioIR.Application;

import java.util.Locale;
import java.util.Scanner;

import Desafios.DesafioIR.Entities.Tax;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Renda anual com salário: ");
		double salary = sc.nextDouble();
		System.out.print("Renda anual com prestação de serviço: ");
		double service = sc.nextDouble();
		System.out.print("Renda anual com ganho de capital: ");
		double gain = sc.nextDouble();
		System.out.print("Gastos médicos: ");
		double healthExpense = sc.nextDouble();
		System.out.print("Gastos educacionais: ");
		double educationalExpense = sc.nextDouble();
		
	
		Tax tax = new Tax(salary, service, gain, healthExpense, educationalExpense);
		
		double totalTax = tax.taxCapital()+tax.taxSalary()+tax.taxService();
		
		System.out.println();
		System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
		System.out.println();
		
		System.out.println("CONSOLIDADO DE RENDA:");
		System.out.println("Imposto sobre salário: " + String.format("%.2f", tax.taxSalary()));
		System.out.println("Imposto sobre serviços: " + String.format("%.2f",tax.taxService()));
		System.out.println("Imposto sobre ganho de capital: " + String.format("%.2f",tax.taxCapital()));
		
		System.out.println();

		System.out.println("DEDUÇÕES:");
		System.out.println("Máximo dedutível: " + String.format("%.2f",(totalTax*0.3)));
		System.out.println("Gastos dedutíveis: " + String.format("%.2f",(healthExpense+educationalExpense)));
		
		System.out.println();
		
		System.out.println("RESUMO");
		System.out.println("Imposto bruto total: " + String.format("%.2f",totalTax));
		System.out.println("Abatimento: " + String.format("%.2f",tax.redution()));
		System.out.println("Imposto devido: " + String.format("%.2f",(totalTax - tax.redution())));
		
		
		sc.close();
	}

}
