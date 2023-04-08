package entities;

public class product_info {
	public String name;
	public double price;
	public int qnt;
	
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
