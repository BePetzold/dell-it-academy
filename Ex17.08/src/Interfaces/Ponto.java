package Interfaces;

public class Ponto implements PrimitivaGrafica{
	private double x;
	private double y;
	private int espessura;
	
	public Ponto(double x, double y) {
		this.setX(x);
		this.setY(y);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public int getEspessura() {
		return espessura;
	}

	public void setEspessura(int espessura) {
		if(espessura > 0)
			this.espessura = espessura;
	}
	
	public String toString() {
		String str = "(" + x + ", " + y + ")";
		return str;
	}
	
	public double area() {
		return 0;
	}
	
	public String getNome() {
		return "Ponto";
	}
	
}
