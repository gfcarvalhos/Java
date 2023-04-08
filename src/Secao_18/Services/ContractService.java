package Secao_18.Services;

import java.time.LocalDate;

import Secao_18.Entities.Contract;
import Secao_18.Entities.Installment;

public class ContractService {
	
	private OnlinePaymentService onlinePaymentService;
	
	public ContractService() {
	}
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processConstract(Contract contract, Integer months) {
		
		double basicQuota = contract.getTotalValue()/months;
		
		for (int i=1;i<=months;i++) {
			LocalDate dueDate = contract.getDate().plusMonths(i);
			
			double interest = onlinePaymentService.interest(basicQuota, i);
			double fee = onlinePaymentService.paymentFee(interest+basicQuota);
			
			contract.getInstallments().add(new Installment(dueDate,basicQuota+fee+interest));
		}
	}
	

}
