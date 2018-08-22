package Interfaces2;

import java.util.*;


public class Main {
	public static void main (String args []) {
		ArrayList<Pais> t = new ArrayList<Pais>();
		Pais a = new Pais ("Arg", 1000, 30000);
		Pais b = new Pais ("Bra", 5000, 90000);
		Pais c = new Pais ("Can", 8000, 40000);
		Pais d = new Pais ("Rus", 9000, 70000);
		Pais e = new Pais ("Ger", 4000, 10000);
		Pais f = new Pais ("UKi", 2000, 20000);
		
		t.add(a);
		t.add(b);
		t.add(c);            
		t.add(d);
		t.add(e);
		t.add(f);
		
		System.out.println("------------- Por Área ------------");
		
		Collections.sort(t);
		for(Pais s: t) {
			System.out.println(s);
		}
		
		System.out.println("------------- Por Nome ------------");
		
		Collections.sort(t, new PaisComparadorNome());
		for(Pais s: t) {
			System.out.println(s);
		}
		
		System.out.println("---------- Por População ----------");
		
		Collections.sort(t, new PaisComparadorPopul());
		for(Pais s: t) {
			System.out.println(s);
		}
	}
}
