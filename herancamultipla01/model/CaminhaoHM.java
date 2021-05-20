package model;

public class CaminhaoHM extends VeiculoHM implements AutomovelHM {
	
	private int capacidadeDeCarga;
	private String renavam;
	private String chassi;
	private String placa;
	
	public CaminhaoHM() {
		super();
	}
	
	public CaminhaoHM(int capacidadeDeCarga, String renavam, String chassi, String placa) {
		super();
		this.capacidadeDeCarga = capacidadeDeCarga;
		this.renavam = renavam;
		this.chassi = chassi;
		this.placa = placa;
	}

	public CaminhaoHM(int numeroDeEixos, String propulsao, String marca, String modelo, int anoFabricacao, int capacidadeDeCarga, String renavam, String chassi, String placa) {
		super(numeroDeEixos, propulsao, marca, modelo, anoFabricacao);
		this.capacidadeDeCarga = capacidadeDeCarga;
		this.renavam = renavam;
		this.chassi = chassi;
		this.placa = placa;
	}

	public int getCapacidadeDeCarga() {
		return capacidadeDeCarga;
	}
	public void setCapacidadeDeCarga(int capacidadeDeCarga) {
		this.capacidadeDeCarga = capacidadeDeCarga;
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
		return "CaminhaoHM [Numero de Eixos = " + getNumeroDeEixos()  + ", Propulsão = " + getPropulsao() + ", Marca = " + getMarca()
		+ ", Modelo = " + getModelo() + ", Ano de Fabricacao = " + getAnoFabricacao() + ", Capacidade de Carga= " + capacidadeDeCarga
		+ ", Renavam = " + renavam + ", Chassi = " + chassi	+ ", Placa = " + placa + "]\n";
	}
	

}
