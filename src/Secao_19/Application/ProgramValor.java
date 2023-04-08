package Secao_19.Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import Secao_19.Entities.Product;
import Secao_19.Services.CalculationService;

public class ProgramValor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		String path = "C:\\Users\\gabri\\OneDrive\\Documents\\Cursos\\Java\\Atividades\\in2.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			Product x  = CalculationService.max(list);
			System.out.println("Max: ");
			System.out.println(x);
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
