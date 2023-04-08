package Secao_14.Programa_main;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Secao_14.Entities.Employee;
import Secao_14.Entities.OutsourcedEmployee;

public class ProgramExResolvido {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter the number of employeers: ");
		int n = sc.nextInt();
		
		List<Employee> lista = new ArrayList<>();
		
		for (int i=1;i<=n;i++) {
			sc.nextLine();
			System.out.println("Employee #"+i+" data:");
			System.out.print("Outsourced (y/n)? ");
			String x = sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			Integer hours = sc.nextInt();
			sc.nextLine();
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			if (x.equals("y")) {
				System.out.print("Additional charge: ");
				Double valueAdditional = sc.nextDouble();
				
				Employee employee = new OutsourcedEmployee(name, hours, valuePerHour, valueAdditional);
				lista.add(employee);
				}
			else {
				Employee employee = new Employee(name, hours, valuePerHour);
				lista.add(employee);
			}
			System.out.println();
		}
		
		System.out.println("PAYMENTS:");
		for (Employee obj : lista) {
			System.out.println(obj.getName() + " - $ " + String.format("%.2f", obj.payment()));
		}
		
		sc.close();
	}

}
