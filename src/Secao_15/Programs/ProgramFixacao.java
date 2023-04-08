package Secao_15.Programs;

import java.util.Locale;
import java.util.Scanner;

import Secao_15.Entities.Account;
import Secao_15.Exception.FixacaoException;

public class ProgramFixacao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: ");
			String name = sc.nextLine();
			System.out.print("Inicial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			
			Account account = new Account(number, name, balance, withdrawLimit);
			System.out.println();
	
			System.out.print("Enter amount for withdraw:");
			double withdraw = sc.nextDouble();
			
			account.withdraw(withdraw);
			System.out.println("New balance: " + String.format("%.2f", account.getBalance()));
		
		}
		catch(FixacaoException e){
			System.out.println("Withdraw error: " + e.getMessage());
			
		}
		catch(RuntimeException e) {
			System.out.println("Error unexpected.");
		}
		
			sc.close();
		
	}

}
