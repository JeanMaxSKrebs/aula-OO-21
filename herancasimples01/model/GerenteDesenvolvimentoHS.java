package model;

public class GerenteDesenvolvimentoHS extends GerenteHS {

	public GerenteDesenvolvimentoHS() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GerenteDesenvolvimentoHS(String nome, int salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}
	
	public double getBonus() {
		double bonus = getSalario() * 0.2;
		System.out.println("B�nus no Sal�rio: "+bonus+" reais");
		return bonus;
	}

	@Override
	public String toString() {
		return "GerenteHS [Nome=" + getNome() + ", Salario=" + getSalario() + "]\n";
	}
}
