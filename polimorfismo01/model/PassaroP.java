package model;

public class PassaroP extends AnimalP {
	private double z = 0;

	public PassaroP() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PassaroP(double x, double y, double z) {
		super(x, y);
		this.z = z;
		// TODO Auto-generated constructor stub
	}

	public void mover(double x, double y, double z) {
//		System.out.println("estou em movimento");
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	@Override
	public void desenhar() {
		// TODO Auto-generated method stub
		System.out.println("passaro");
	}

	@Override
	public String toString() {
		return "Passaro [z=" + z + ", x=" + x + ", y=" + y + "]\n";
	}
}
