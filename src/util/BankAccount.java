package util;

public class BankAccount {
	private int account_number;
	private String name;
	private double value;
	
	public BankAccount() {
			}
	
	
	public BankAccount(int account_number, String name, double initialdeposit) {
		this.account_number = account_number;
		this.name = name;
		depositValue(initialdeposit);
	}


	public BankAccount(int account_number, String name) {
		this.account_number = account_number;
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public void depositValue(double value) {
		this.value += value;
	}
	
	public void withdrawValue(double value) {
		this.value -= value + 5.0;
	}
	
	public String toString() {
		return "Account: " + 
				account_number + 
				", Holder: " + 
				name + 
				", Balance: $ " + 
				String.format("%.2f", value);
	}
}

