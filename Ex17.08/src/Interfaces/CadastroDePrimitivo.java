package Interfaces;

import java.util.ArrayList;

public class CadastroDePrimitivo {
	private ArrayList<PrimitivaGrafica> arr;
	
	public CadastroDePrimitivo() {
		arr = new ArrayList<PrimitivaGrafica>();
	}
	
	public void addObj(PrimitivaGrafica obj) {
		arr.add(obj);
	}
	
	public void printAll() {
		for(PrimitivaGrafica obj: arr) {
			System.out.println(obj);
		}
	}
}
