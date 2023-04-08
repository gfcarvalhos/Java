package Secao_14.Entities.Contribuintes;

public class PessoaJuridica extends ContribuintesModel{
	
	private Integer numeroFuncionarios;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double renda, Integer numeroFuncionarios) {
		super(nome, renda);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public Integer getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}
	
	public Double imposto() {
		if(numeroFuncionarios<10) {
			return super.getRenda()*0.16;
		}
		else {
			return super.getRenda()*0.14;
		}
	}

}
