package model;

public abstract class AnimalP {
	protected double x;
	protected double y;
	
	public AnimalP() {
		super();
	}
	
	public AnimalP(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public void mover(double x, double y) {
//		System.out.println("estou em movimento");
		this.x = x;
		this.y = y;
	}
	
	public abstract void desenhar();

	@Override
	public String toString() {
		return "Animal [x=" + x + ", y=" + y + "]\n";
	}
}
