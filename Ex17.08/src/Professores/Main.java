package Professores;

import java.util.*;

public class Main {
	public static void main(String args[]) {
		ArrayList<Professor> t = new ArrayList<Professor>();
		Professor a = new Professor ("Joao", 555000, 300);
		Professor b = new Professor ("Jose", 444888, 900);
		Professor c = new Professor ("Jaco", 999000, 400);
		Professor d = new Professor ("Argo", 666333, 700);
		Professor e = new Professor ("Gera", 333444, 100);
		Professor f = new Professor ("UKil", 222999, 200);
		
		t.add(a);
		t.add(b);
		t.add(c);            
		t.add(d);
		t.add(e);
		t.add(f);
		
		System.out.println("------------- Por Nome ------------");
		
		Collections.sort(t);
		for(Professor s: t) {
			System.out.println(s);
		}
	
		System.out.println("----------- Por Matricula ----------");
		
		Collections.sort(t, new ProfessorCompairMatricula());
		for(Professor s: t) {
			System.out.println(s);
		}
		
		System.out.println("--------- Por Carga Horaria ---------");
		
		Collections.sort(t, new ProfessorCompaircargaHoraria());
		for(Professor s: t) {
			System.out.println(s);
		}
		
	}
}
