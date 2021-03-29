package model;

public class Veiculo {
	private String renavam;
	private String placa;
	private String cor;
	private Integer num_rodas;
	private String combustivel;
	private Integer quilometragem;
	private String chassi;
	private Double valorLocacao;
	
	public Veiculo() {
	}

	public Veiculo(String renavam, String placa, String cor, Integer num_rodas, String combustivel,
			Integer quilometragem, String chassi, Double valorLocacao) {
		super();
		this.renavam = renavam;
		this.placa = placa;
		this.cor = cor;
		this.num_rodas = num_rodas;
		this.combustivel = combustivel;
		this.quilometragem = quilometragem;
		this.chassi = chassi;
		this.valorLocacao = valorLocacao;
	}

	public String getRenavam() {
		return renavam;
	}

	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getNum_rodas() {
		return num_rodas;
	}

	public void setNum_rodas(Integer num_rodas) {
		this.num_rodas = num_rodas;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public Integer getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(Integer quilometragem) {
		this.quilometragem = quilometragem;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public Double getValorLocacao() {
		return valorLocacao;
	}

	public void setValor_locacao(Double valorLocacao) {
		this.valorLocacao = valorLocacao;
	}

	@Override
	public String toString() {
		return "Veiculo [renavam=" + renavam + ", placa=" + placa + ", cor=" + cor + ", num_rodas=" + num_rodas
				+ ", combustivel=" + combustivel + ", quilometragem=" + quilometragem + ", chassi=" + chassi
				+ ", valor_locacao=" + valorLocacao + "]\n";
	}
	
	
}
