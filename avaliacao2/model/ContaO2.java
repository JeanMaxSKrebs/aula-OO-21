package model;

public class ContaO2 {

	protected double saldo;
	
	public ContaO2(double saldo) {
		super();
		this.saldo = saldo;
	}

	public void deposita(double valor) {
		saldo += valor;
	}
	
	public void saca(double valor) {
		saldo -= valor;
	}
	
	public void atualiza(double taxa) {
		taxa = taxa / 100;
		saldo += saldo *= taxa;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}