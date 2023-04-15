package Desafios.DesafioIR.Entities;

public class Tax {
	
	private Double anualSalary;
	private Double serviceGain;
	private Double capitalGain;
	private Double healthExpense;
	private Double educationalExpense;
	
	public Tax() {
	}

	public Tax(Double anualSalary, Double serviceGain, Double capitalGain, Double healthExpense,
			Double educationalExpense) {
		this.anualSalary = anualSalary;
		this.serviceGain = serviceGain;
		this.capitalGain = capitalGain;
		this.healthExpense = healthExpense;
		this.educationalExpense = educationalExpense;
	}

	public Double getAnualSalary() {
		return anualSalary;
	}

	public void setAnualSalary(Double anualSalary) {
		this.anualSalary = anualSalary;
	}

	public Double getServiceGain() {
		return serviceGain;
	}

	public void setServiceGain(Double serviceGain) {
		this.serviceGain = serviceGain;
	}

	public Double getCapitalGain() {
		return capitalGain;
	}

	public void setCapitalGain(Double capitalGain) {
		this.capitalGain = capitalGain;
	}

	public Double getHealthExpense() {
		return healthExpense;
	}

	public void setHealthExpense(Double healthExpense) {
		this.healthExpense = healthExpense;
	}

	public Double getEducationalExpense() {
		return educationalExpense;
	}

	public void setEducationalExpense(Double educationalExpense) {
		this.educationalExpense = educationalExpense;
	}
	
	public Double taxSalary() {
		if ((anualSalary/12.0)>=3000.00 && (anualSalary/12.0)<=5000.00) {
			return anualSalary*0.1;
		}
		if((anualSalary/12.0)>5000.00) {
			return anualSalary*0.2;
		}
		else {
			return 0.0;
		}
	}
	
	public Double taxService() {
		if (serviceGain != 0.00) {
			return serviceGain*0.15;
		}
		else {
			return 0.0;
		}
	}
	
	public Double taxCapital() {
		if (capitalGain != 0.0) {
			return capitalGain*0.2;
		}
		else {
			return 0.0;
		}
	}
	
	public Double redution() {
		double totalTax = (taxService() + taxCapital() + taxSalary())*0.3;
		double totalExpense = educationalExpense + healthExpense;
		if(totalTax<=totalExpense) {
			return totalTax;
		}
		else {
			return totalExpense;
		}
	}


}
