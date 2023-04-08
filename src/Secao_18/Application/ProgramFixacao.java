package Secao_18.Application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import Secao_18.Entities.Contract;
import Secao_18.Entities.Installment;
import Secao_18.Services.ContractService;
import Secao_18.Services.PaypalService;

public class ProgramFixacao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato:");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(),fmt);
		System.out.print("Valor do contrato: ");
		Double totalValue = sc.nextDouble();
		System.out.print("Entre com o numero de parcelas: ");
		int installment = sc.nextInt();
		
		Contract contract = new Contract(number, date, totalValue);
		
		ContractService service = new ContractService(new PaypalService());
		service.processConstract(contract, installment);
		
		System.out.println();
		System.out.println("Parcerlas: ");
		for (Installment installments: contract.getInstallments()) {
			System.out.println(installments);
		}
		
		
		sc.close();

	}

}
