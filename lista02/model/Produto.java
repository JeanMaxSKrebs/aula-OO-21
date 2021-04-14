package model;

public class Produto {
	private String nome;
	private double valor ;
	private int estoque;
	
	public Produto() {
	}

	public Produto(String nome) {
		super();
		this.nome = nome;
	}

	public Produto(String nome, double valor, int estoque) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.estoque = estoque;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		int novoEstoque = this.estoque + estoque;
		if(novoEstoque >= 0)
		this.estoque = estoque;
	}

	public String toString() {
		return "\nProduto [nome=" + nome + ", valor=" + valor + ", estoque=" + estoque + "]";
	}
	
	
}
