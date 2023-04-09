package Secao_20.Aplications;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import Secao_20.Entities.Employee;

public class ProgramEmployee {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		String path = "C:\\Users\\gabri\\OneDrive\\Documents\\Cursos\\Java\\Atividades\\employees.txt";
		
		System.out.println("Full file path: " + path);
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			List<Employee> employee = new ArrayList<>();
			
			String line = br.readLine();
			
			while(line!= null) {
				String[] fields = line.split(",");
				employee.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
			System.out.print("Enter salary: ");
			double minSalary = sc.nextDouble();
			System.out.println("Email of people whose salary is more than " + minSalary + ":");
			
			Comparator<String> name = (n1,n2) -> n1.toUpperCase().compareTo(n2.toUpperCase());
			
			List<String> emails = employee.stream()
					.filter(e -> e.getSalary() > minSalary)
					.map(e -> e.getEmail())
					.sorted(name)
					.collect(Collectors.toList());
			
			emails.forEach(System.out::println);
			
			double sum = employee.stream()
					.filter(e -> e.getName().charAt(0) == 'M')
					.map(e -> e.getSalary())
					.reduce(0.0, (x,y) -> x + y);
			
			System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sum));
			
		}
		catch (IOException e) {
			System.out.println("Error = " + e.getMessage());
		}
		

		sc.close();
	}

}
