package model;

public class AssociadoO2 implements AssociadoVipO2 {
	
	private String nome;
	private double valorCota;
	private int qdeCotas;
	
	@Override
	public double lucros(int qdeCotas, double valorCota) {
		// TODO Auto-generated method stub

		 double lucros = qdeCotas * valorCota;
	
		return lucros;
	}
	
	public AssociadoO2() {
		super();
	}

	public AssociadoO2(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "AssociadoO2 [nome=" + nome + ", valorCota=" + valorCota + ", qdeCotas=" + qdeCotas + "]\n";
	}

	@Override
	public int getQdeCotas() {
		// TODO Auto-generated method stub
		return this.qdeCotas;
	}

	@Override
	public double getValorCota() {
		// TODO Auto-generated method stub
		return this.valorCota;
	}

	@Override
	public void setQdeCotas(int qdeCotas) {
		// TODO Auto-generated method stub
		this.qdeCotas = qdeCotas;
	}

	@Override
	public void setValorCota(double valorCota) {
		// TODO Auto-generated method stub
		this.valorCota = valorCota;
	}
}
