package model;

public class BicicletaHM extends VeiculoHM {
	
	private int tamanhoRoda;
	private String chassi;
	
	public BicicletaHM() {
		super();
	}

	public BicicletaHM(int tamanhoRoda, String chassi) {
		super();
		this.tamanhoRoda = tamanhoRoda;
		this.chassi = chassi;
	}
	
	public BicicletaHM(int numeroDeEixos, String propulsao, String marca, String modelo, int anoFabricacao, int tamanhoRoda, String chassi) {
		super(numeroDeEixos, propulsao, marca, modelo, anoFabricacao);
		this.tamanhoRoda = tamanhoRoda;
		this.chassi = chassi;
	}

	public int getTamanhoRoda() {
		return tamanhoRoda;
	}

	public void setTamanhoRoda(int tamanhoRoda) {
		this.tamanhoRoda = tamanhoRoda;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	@Override
	public String toString() {
		return "BicicletaHM [Numero de Eixos = " + getNumeroDeEixos()  + ", Propulsão = " + getPropulsao() + ", Marca = " + getMarca()
		+ ", Modelo = " + getModelo() + ", Ano de Fabricacao = " + getAnoFabricacao() + ", Tamanho da roda = " + tamanhoRoda 
		+ ", Chassi = " + chassi + "]\n";
	}
	
	
	
	
}
