package model;

public class GerenteGeralHS extends GerenteHS {

	public GerenteGeralHS() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GerenteGeralHS(String nome, int salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}
	
	public double getBonus() {
		double bonus = getSalario() * 0.4;
		System.out.println("Bônus no Salário: "+bonus+" reais");
		return bonus;
	}

	@Override
	public String toString() {
		return "GerenteHS [Nome=" + getNome() + ", Salario=" + getSalario() + "]\n";
	}
}
