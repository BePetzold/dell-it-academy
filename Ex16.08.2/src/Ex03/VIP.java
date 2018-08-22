package Ex03;

public class VIP extends Ingresso {
	private double adicional;
	
	public void imprimevalor() {
		System.out.println(super.valor+adicional);
	}
}
