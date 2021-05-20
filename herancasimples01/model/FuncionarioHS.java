package model;

public abstract class FuncionarioHS {
	private String nome;
	private double salario;
	
	public FuncionarioHS() {
		super();
	}
	public FuncionarioHS(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void reajuste(int taxa) {
		this.salario += salario * taxa / 100;
		System.out.println("Reajuste de "+taxa+"% no Salário: \n"+"Salário ajustado = "+this.salario+" reais");
	}
	
	public abstract double getBonus();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
