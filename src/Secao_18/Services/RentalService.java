package Secao_18.Services;

import java.time.Duration;

import Secao_18.Entities.CarRental;
import Secao_18.Entities.Invoice;

public class RentalService {

	private Double pricePerDay;
	private Double pricePerHour;
	
	private TaxService taxService;

	public RentalService(Double pricePerDay, Double pricePerHour, TaxService taxservice) {
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxService = taxservice;
	}
	
	public void processInvoice(CarRental carRental) {
		
		double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		double hours = minutes/60;
		
		double basicPayment;
		if (hours <= 12.00) {
			basicPayment = pricePerHour * Math.ceil(hours);
		}
		else {
			basicPayment = pricePerDay * Math.ceil(hours/24);
		}
		double tax = taxService.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment,tax));
	}
	
}
