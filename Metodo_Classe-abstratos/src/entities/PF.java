package entities;

public class PF extends Pessoa {

	private Double gastoSaude;

	public PF() {
	}

	public PF(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public double imposto() {
		if (getRendaAnual() < 20000.0){
			return getRendaAnual() * 0.15 - gastoSaude * 0.5;
		}else{
			return getRendaAnual() * 0.25 - gastoSaude * 0.5;
		}
	}
}
