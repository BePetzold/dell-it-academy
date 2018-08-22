package Professores;

public class Professor implements Comparable<Professor>{
	private String nome;
	private int matricula;
	private int cargaHoraria;
	
	public Professor(String n, int m, int c) {
		setNome(n);
		setMatricula(m);
		setCargaHoraria(c);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public String toString() {
		return ("Nome: "+nome+"\nMatricula: "+matricula+"\nCarga Horaria: "+cargaHoraria);
	}
	
	public int compareTo(Professor p) {
		return p.getNome().compareTo(getNome());
		
	}
}
