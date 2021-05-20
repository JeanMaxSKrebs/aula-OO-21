package model;

public class DesenvolvedorHS extends FuncionarioHS {

	public DesenvolvedorHS() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public DesenvolvedorHS(String nome, double salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}
	
	public double getBonus() {
		
		double bonus = getSalario() * 0.05;
		System.out.println("Bônus no Salário: "+bonus+" reais");
		return bonus;
	}
	
	@Override
	public String toString() {
		return "DesenvolvedorHS [Nome=" + getNome() + ", Salario=" + getSalario() + "]\n";
	}
}
