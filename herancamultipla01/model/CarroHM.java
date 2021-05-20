package model;

public class CarroHM extends VeiculoHM implements AutomovelHM {
	
	private int capacidadePortaMalas;
	private String renavam;
	private String chassi;
	private String placa;

	public CarroHM() {
		super();
	}
	
	public CarroHM(int capacidadePortaMalas, String renavam, String chassi, String placa) {
		super();
		this.capacidadePortaMalas = capacidadePortaMalas;
		this.renavam = renavam;
		this.chassi = chassi;
		this.placa = placa;
	}
	
	public CarroHM(int numeroDeEixos, String propulsao, String marca, String modelo, int anoFabricacao, int capacidadePortaMalas, String renavam, String chassi, String placa) {
		super(numeroDeEixos, propulsao, marca, modelo, anoFabricacao);
		this.capacidadePortaMalas = capacidadePortaMalas;
		this.renavam = renavam;
		this.chassi = chassi;
		this.placa = placa;
	}

	public int getCapacidadePortaMalas() {
		return capacidadePortaMalas;
	}

	public void setCapacidadePortaMalas(int capacidadePortaMalas) {
		this.capacidadePortaMalas = capacidadePortaMalas;
	}
	
	@Override
	public String getRenavam() {
		// TODO Auto-generated method stub
		return this.renavam;
	}

	@Override
	public void setRenavam(String renavam) {
		// TODO Auto-generated method stub
		this.renavam = renavam;
		
	}

	@Override
	public String getChassi() {
		// TODO Auto-generated method stub
		return this.chassi;
	}

	@Override
	public void setChassi(String chassi) {
		// TODO Auto-generated method stub
		this.chassi = chassi;
	}

	@Override
	public String getPlaca() {
		// TODO Auto-generated method stub
		return this.placa;
	}

	@Override
	public void setPlaca(String placa) {
		// TODO Auto-generated method stub
		this.placa = placa;
	}

	@Override
	public String toString() {
		return "CarroHM [Numero de Eixos = " + getNumeroDeEixos()  + ", Propuls�o = " + getPropulsao() + ", Marca = " + getMarca()
		+ ", Modelo = " + getModelo() + ", Ano de Fabricacao = " + getAnoFabricacao() + ", Capacidade do Porta Malas = " + capacidadePortaMalas
		+ ", Renavam = " + renavam + ", Chassi = " + chassi	+ ", Placa = " + placa + "]\n";
	}
	

}
