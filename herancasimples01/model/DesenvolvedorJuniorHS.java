package model;

public class DesenvolvedorJuniorHS extends DesenvolvedorHS {

	public DesenvolvedorJuniorHS() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public DesenvolvedorJuniorHS(String nome, double salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}
	
	public double getBonus() {
		
		double bonus = getSalario() * 0.05;
		System.out.println("B�nus no Sal�rio: "+bonus+" reais");
		return bonus;
	}
	
	@Override
	public String toString() {
		return "DesenvolvedorHS [Nome=" + getNome() + ", Salario=" + getSalario() + "]\n";
	}

}