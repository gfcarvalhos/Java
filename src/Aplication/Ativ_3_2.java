package Aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Ativ_3_2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Employee info_empregado = new Employee();
		
		System.out.println("Name: ");
		info_empregado.name = sc.nextLine();
		System.out.println("Gross Salary: ");
		info_empregado.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		info_empregado.tax = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Employee: %s, $ %.2f%n", info_empregado.name,info_empregado.NetSalary());
		
		System.out.println();
		System.out.println("Which percentage to increase salary: ");
		int percentage = sc.nextInt();
		info_empregado.IncreaseSalary(percentage);
		
		System.out.println();
		System.out.printf("Updated data: %s, $ %.2f", info_empregado.name,info_empregado.NetSalary());

		
		sc.close();
	}

}
