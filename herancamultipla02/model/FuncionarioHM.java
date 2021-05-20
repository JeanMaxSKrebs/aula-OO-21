package model;

public abstract class FuncionarioHM {
	private String nome;
	private double salario;
	
	public FuncionarioHM() {
		super();
	}
	public FuncionarioHM(String nome, double salario) {
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
	
	public abstract double getBonus();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
