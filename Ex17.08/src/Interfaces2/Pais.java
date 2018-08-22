package Interfaces2;

public class Pais implements Comparable<Pais>{
	private String nome;
	private float area;
	private Integer popul;
	
	public Pais(String n, float a, int popul) {
		setNome(n);
		setArea(a);
		setPopul(popul);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}

	public Integer getPopul() {
		return popul;
	}

	public void setPopul(int popul) {
		this.popul = popul;
	}
	
	public String toString() {
		return(nome + ", área: " + area + ", população: " + popul);
	}
	
	public int compareTo(Pais p) {
		if (this.area < p.area)
			return -1;
		if (this.area > p.area)
			return 1;
		return 0;
	}
	
}
