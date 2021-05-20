package model;

public class GerenteHM extends FuncionarioHM implements InvestidorHM {
	private String ticker;
	private int quantidade;

	public GerenteHM() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public GerenteHM(String nome, double salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}
	public GerenteHM(String nome, double salario, String ticker, int quantidade) {
		super(nome, salario);
		this.ticker = ticker;
		this.quantidade = quantidade;
	}
	
	public double getBonus() {
		
		double bonus = getSalario() * 0.2;
//		System.out.println("Bônus no Salário: "+bonus+" reais");
		return bonus;
	}
	
	@Override
	public String toString() {
		return "GerenteHM [Ticker=" + ticker + ", Quantidade=" + quantidade + ", Bonus=" + getBonus()
				+ ", Nome=" + getNome() + ", Salario=" + getSalario() + "]\n";
	}

	@Override
	public String getTicker() {
		return ticker;
	}

	@Override
	public void setTicker(String ticker) {
		this.ticker = ticker;	
	}

	@Override
	public int getQuantidade() {
		return quantidade;
	}

	@Override
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;	
	}
}
