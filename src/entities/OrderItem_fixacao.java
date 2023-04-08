package entities;

public class OrderItem_fixacao {
	
	private Integer quantity;
	private Double price;
	
	private Product_fixacao produto;

	public OrderItem_fixacao(Integer quantity, Double price, Product_fixacao produto) {
		this.quantity = quantity;
		this.price = price;
		this.produto = produto;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product_fixacao getProduto() {
		return produto;
	}

	public void setProduto(Product_fixacao produto) {
		this.produto = produto;
	}
	
	public double subTotal() {
		return price * quantity;
	}
	
	@Override
	public String toString() {
		return produto.getName() 
				+ ", $" 
				+ String.format("%.2f", price) 
				+ ", Quantity: " 
				+ quantity + 
				", Subtotal: $" 
				+ String.format("%.2f", subTotal());
	}
}
