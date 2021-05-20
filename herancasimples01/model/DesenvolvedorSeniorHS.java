package model;

public class DesenvolvedorSeniorHS extends DesenvolvedorHS {

	public DesenvolvedorSeniorHS() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public DesenvolvedorSeniorHS(String nome, double salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}
	
	public double getBonus() {
		
		double bonus = getSalario() * 0.1;
		System.out.println("Bônus no Salário: "+bonus+" reais");
		return bonus;
	}
	
	@Override
	public String toString() {
		return "DesenvolvedorHS [Nome=" + getNome() + ", Salario=" + getSalario() + "]\n";
	}

}
