package Interfaces;

public class Quadrado implements PrimitivaGrafica{
	private Ponto a;
	private Ponto b;
	private int espessura;
	
	public Quadrado(Ponto a, Ponto b) {
		this.a = a;
		this.b = b;
	}
	
	public String getNome() {
		return "Quadrado";
	}
	
	public void setEspessura(int espessura) {
		if(espessura > 0)
			this.espessura = espessura;
	}
		
	public double area() {
		double area;
		double x = a.getX() - b.getX();
		double y = a.getY() - b.getY();
		area = x * y;
			if(area<0) {
				area *= -1;
			}
		return area;
	}
	
	public String toString() {
		String str = "(" + a + ", " + b + ", area: " + area() + ")";
		return str;
	}
	
}
