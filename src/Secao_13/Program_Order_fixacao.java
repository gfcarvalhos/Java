package Secao_13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client_fixacao;
import entities.OrderItem_fixacao;
import entities.Order_fixacao;
import entities.Product_fixacao;
import entities.enums.OrderStatus;

public class Program_Order_fixacao {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter cliente data:");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birth = sdf.parse(sc.next());
		
		Client_fixacao client = new Client_fixacao(name, email, birth);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order_fixacao order = new Order_fixacao(new Date(), status, client);
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.println("Enter #" + i + " item data: ");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Procut price: ");
			double productPrice = sc.nextDouble();
			
			Product_fixacao product = new Product_fixacao(productName, productPrice);
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			OrderItem_fixacao orderItem = new OrderItem_fixacao(quantity, productPrice, product);
			
			order.addItem(orderItem);
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);

		sc.close();
	}

}
