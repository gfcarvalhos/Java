package Secao_14.Entities.Contribuintes;

public abstract class ContribuintesModel {
	
	private String nome;
	private Double renda;
	
	public ContribuintesModel() {
	}

	public ContribuintesModel(String nome, Double renda) {
		this.nome = nome;
		this.renda = renda;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRenda() {
		return renda;
	}

	public void setRenda(Double renda) {
		this.renda = renda;
	}
	
	public abstract Double imposto();

}