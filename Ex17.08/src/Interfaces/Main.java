package Interfaces;

public class Main {
	public static void main(String args[]) {
		CadastroDePrimitivo t = new CadastroDePrimitivo();
		Ponto a = new Ponto(0, 0);
		Ponto b = new Ponto(20, 20);
		Quadrado q = new Quadrado(a, b);
		Circulo c = new Circulo(a, 10);
		
		t.addObj(a);
		t.addObj(b);
		t.addObj(q);
		t.addObj(c);
		
		t.printAll();
		
		
	}
}
