package Secao_14.Programa_main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Secao_14.Entities.ImportedProduct;
import Secao_14.Entities.Product;
import Secao_14.Entities.UsedProduct;

public class ProgramProducts {

	public static void main(String[] args) throws ParseException{
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> lista = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for (int i=1;i<=n;i++) {
			sc.nextLine();
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			String x = sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			if (x.equals("i")) {
				System.out.print("Customs fee: ");
				Double customsFee = sc.nextDouble();
				Product product = new ImportedProduct(name, price, customsFee);
				lista.add(product);
			}
			if (x.equals("u")) {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				Product product = new UsedProduct(name, price, manufactureDate);
				lista.add(product);
			}
			if (x.equals("c")) {
				Product product = new Product(name, price);
				lista.add(product);
			}
			System.out.println();
		}
		
		System.out.println("PRICE TAGS:");
		for (Product obj: lista) {
			System.out.println(obj.priceTag());
		}
		sc.close();
	}

}
