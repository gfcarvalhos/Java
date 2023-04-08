package util;

public class product_info_new {
	private String name;
	private double price;
	private int qnt;
	
	public product_info_new() {
	}
	
	public product_info_new(String name, double price, int qnt) {
		this.name = name;
		this.price = price;
		this.qnt = qnt;
	}

	public product_info_new(String name, double price) {
		this.name = name;
		this.price = price;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQnt() {
		return qnt;
	}

	public double totalValueInStock() {
		return price*qnt;
	}
	
	public void addProducts(int qnt) {
		this.qnt += qnt;
	}
	
	public void removeProducts(int qnt) {
		this.qnt -= qnt;
	}
	
	public String toString() {
		return name
				+ ", $ "
				+ String.format("%.2f", price)
				+ ", "
				+ qnt
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
