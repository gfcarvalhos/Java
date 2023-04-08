package Secao_14.Entities;

public final class ImportedProduct extends Product{

	private Double customsFee;
	
	public ImportedProduct() {
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public void totalPrice() {
		price += customsFee;
	}
	
	@Override
	public String priceTag() {
		return super.getName() + " $ " + super.getPrice() +
				"(Customs fee: $" + customsFee + ")";
	}
}
