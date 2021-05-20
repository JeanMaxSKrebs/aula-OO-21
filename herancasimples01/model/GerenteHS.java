package model;

public class GerenteHS extends FuncionarioHS {

	public GerenteHS() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GerenteHS(String nome, int salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}
	
	public double getBonus() {
		double bonus = getSalario() * 0.2;
		System.out.println("Bônus no Salário: "+bonus+" reais");
		return bonus;
	}

	@Override
	public String toString() {
		return "GerenteHS [Nome=" + getNome() + ", Salario=" + getSalario() + "]\n";
	}
}
