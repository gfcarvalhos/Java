package Secao_14.Entities.Contribuintes;

public class PessoaFisica extends ContribuintesModel{
	
	private Double gastosEmSaude;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double renda, Double gastosEmSaude) {
		super(nome, renda);
		this.gastosEmSaude = gastosEmSaude;
	}

	public Double getGastosEmSaude() {
		return gastosEmSaude;
	}

	public void setGastosEmSaude(Double gastosEmSaude) {
		this.gastosEmSaude = gastosEmSaude;
	}
	
	public Double imposto() {
		if (super.getRenda()<20000.00) {
			return super.getRenda()*0.15 - gastosEmSaude*0.50;
		}
		else {
			return super.getRenda()*0.25 - gastosEmSaude*0.50;
		}
	}

}
