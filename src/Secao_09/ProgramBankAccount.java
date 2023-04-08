package Secao_09;

import java.util.Locale;
import java.util.Scanner;

import util.BankAccount;

public class ProgramBankAccount {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		BankAccount account;
		
		System.out.printf("Enter account number: ");
		int account_number = sc.nextInt();
		sc.nextLine();
		System.out.printf("Enter account holder: ");
		String name = sc.nextLine();
		System.out.printf("Is there an initial deposit (y/n)? ");
		char answer = sc.next().charAt(0);
		
		if (answer == 'y') {
			System.out.printf("Enter a deposit value: ");
			double deposit = sc.nextDouble();
			account = new BankAccount(account_number,name,deposit);
		}
		else {
			account = new BankAccount(account_number,name);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account.toString());
		
		System.out.println();
		System.out.printf("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		account.depositValue(deposit);
		System.out.println("Updated account data: ");
		System.out.println(account.toString());
		
		System.out.println();
		System.out.printf("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		account.withdrawValue(withdraw);
		System.out.println("Updated account data: ");
		System.out.println(account.toString());
		
		sc.close();
	}

}
