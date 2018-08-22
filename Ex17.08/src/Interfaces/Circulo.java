package Interfaces;

public class Circulo implements PrimitivaGrafica{
	private Ponto a;
	private double raio;
	private int espessura;
	
	public Circulo(Ponto a, double raio) {
		this.a = a;
		this.raio = raio;
	}
	
	public String getNome() {
		return "Circulo";
	}
	
	public void setEspessura(int espessura) {
		if(espessura > 0)
			this.espessura = espessura;
	}
	
	public double area() {
		double area;
		area = PrimitivaGrafica.Pi * raio * raio;
		return area;
	}
	
	public String toString() {
		String str = "(centro " + a + ", raio: " + raio + ", area: " + area() + ")";
		return str;
	}
}
