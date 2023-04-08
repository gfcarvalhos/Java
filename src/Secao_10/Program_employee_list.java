package Secao_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee_list;

public class Program_employee_list {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		List<Employee_list> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for (int i=1;i<=n;i++) {
			sc.nextLine();
			System.out.println();
			System.out.println("Employee #"+ i + ": ");
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Employee_list(id, name, salary));
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int idSalary = sc.nextInt();
		
		Integer pos = hasId(list, idSalary);
		//Employee_list emp = list.stream().filter(x->x.getId()==id).findFirst().orElse(null);
		
		if (pos == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			list.get(pos).increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for (Employee_list obj: list) {
			System.out.println(obj);
		}
		
		sc.close();

	}
	
	public static Integer hasId(List<Employee_list> list, int id) {
		for (int i=0;i<list.size();i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}
