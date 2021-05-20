package model;

public class CachorroP extends AnimalP {
	
	public CachorroP() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CachorroP(double x, double y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void desenhar() {
		// TODO Auto-generated method stub
		System.out.println("cachorro");
	}

	@Override
	public String toString() {
		return "Cachorro [x=" + x + ", y=" + y + "]";
	}
}
