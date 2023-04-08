package Secao_14.Programa_main;

import java.util.ArrayList;
import java.util.List;

import Secao_14.Entities.Account;
import Secao_14.Entities.BusinessAccount;
import Secao_14.Entities.SavingsAccount;

public class ProgramAbstract {

	public static void main(String[] args) {
		
		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1001, "Bob", 500.00, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.00, 400.00));
		list.add(new SavingsAccount(1004, "Charles", 300.00, 0.01));
		list.add(new BusinessAccount(1003, "Anna", 500.00, 500.00));

		double sum = 0.0;
		for (Account acc: list) {
			sum += acc.getBalance();
		}

		System.out.printf("Total Balance: %.2f%n", sum);
		
		for(Account acc: list) {
			acc.deposit(10.00);
		}
		
		for(Account acc: list) {
			System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
	}

}
