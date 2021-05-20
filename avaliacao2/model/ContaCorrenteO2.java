package model;

public class ContaCorrenteO2 extends ContaO2 implements AssociadoVipO2 {

	public double valorCota;
	public int qdeCotas;
	
	public ContaCorrenteO2(double saldo) {
		super(saldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double lucros(int qdeCotas, double valorCota) {
		// TODO Auto-generated method stub
		 double lucros = qdeCotas * valorCota;
	
		return lucros;
	}
	
	@Override
	public String toString() {
		return "ContaCorrenteO2 [valorCota=" + valorCota + ", qdeCotas=" + qdeCotas + ", saldo=" + saldo + "]\n";
	}

	@Override
	public int getQdeCotas() {
		// TODO Auto-generated method stub
		return qdeCotas;
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
