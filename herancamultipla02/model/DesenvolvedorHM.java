package model;

public class DesenvolvedorHM extends FuncionarioHM {

	public DesenvolvedorHM() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public DesenvolvedorHM(String nome, double salario) {
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
		return "DesenvolvedorHM [Nome=" + getNome() + ", Salario=" + getSalario() + "]\n";
	}
}
