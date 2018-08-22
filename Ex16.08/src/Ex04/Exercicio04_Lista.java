package Ex04;

import java.util.ArrayList;
import java.util.HashSet;

public class Exercicio04_Lista<E extends Object> {

	public static void main(String[] args) {	
		long inicialTime;
		long finalTime;
		Exercicio04_Lista<Integer> e = new Exercicio04_Lista<Integer>();
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		ArrayList<Integer> list3;
		ArrayList<Integer> list4;
		ArrayList<Integer> list5;
		ArrayList<Integer> list6;
		ArrayList<Integer> list7;
		ArrayList<Integer> list8;

		for (int i = 0; i < 100000; i++) {
			list1.add(i);
		}
		for (int i = 50000; i < 150000; i++) {
			list1.add(i);
		}

		// Teste union por lista
		inicialTime = System.nanoTime();
		list3 = e.UnionList(list1, list2);
		finalTime = System.nanoTime();
		System.out.println("Duração UNION com LISTA: ");
		System.out.println((finalTime - inicialTime)/1000000);
		System.out.println();

		// Teste union por conjunto
		inicialTime = System.nanoTime();
		list4 = e.UnionConjunto(list1, list2);
		finalTime = System.nanoTime();
		System.out.println("Duração UNION com CONJUNTO: ");
		System.out.println((finalTime - inicialTime)/1000000);
		System.out.println();

		// Teste difference por lista
		inicialTime = System.nanoTime();
		list5 = e.DifferenceList(list1, list2);
		finalTime = System.nanoTime();
		System.out.println("Duração DIFFERENCE com LISTA: ");
		System.out.println((finalTime - inicialTime)/1000000);
		System.out.println();

		// Teste difference por conjunto
		inicialTime = System.nanoTime();
		list6 = e.DifferenceConjunto(list1, list2);
		finalTime = System.nanoTime();
		System.out.println("Duração DIFFERENCE com CONJUNTO: ");
		System.out.println((finalTime - inicialTime)/1000000);
		System.out.println();

		// Teste intersection por conjunto
		inicialTime = System.nanoTime();
		list7 = e.IntersectList(list1, list2);
		finalTime = System.nanoTime();
		System.out.println("Duração INTERSECT com LISTA: ");
		System.out.println((finalTime - inicialTime)/1000000);
		System.out.println();

		// Teste intersection por conjunto
		inicialTime = System.nanoTime();
		list8 = e.IntersectConjunto(list1, list2);
		finalTime = System.nanoTime();
		System.out.println("Duração INTERSECT com CONJUNTO: ");
		System.out.println((finalTime - inicialTime)/1000000);
		System.out.println();

	}

	public ArrayList<E> UnionList(ArrayList<E> l1, ArrayList<E> l2) {
		ArrayList<E> aux = new ArrayList<E>();
		for (E obj : l1) {
			if (!aux.contains(obj)) {
				aux.add(obj);
			}
		}
		for (E obj : l2) {
			if (!aux.contains(obj)) {
				aux.add(obj);
			}
		}
		return aux;
	}

	public ArrayList<E> UnionConjunto(ArrayList<E> l1, ArrayList<E> l2) {
		HashSet<E> hash = new HashSet<E>();
		ArrayList<E> aux = new ArrayList<E>();
		for (E obj : l1) {
			if (hash.add(obj)) {
				aux.add(obj);
			}
		}
		for (E obj : l2) {
			if (hash.add(obj)) {
				aux.add(obj);
			}
		}
		return aux;
	}

	public ArrayList<E> IntersectList(ArrayList<E> l1, ArrayList<E> l2) {
		ArrayList<E> aux = new ArrayList<E>();
		boolean found = false;
		for (E obj : l1) {
			found = false;
			for (E o : l2) {
				if (o == obj) {
					found = true;
				}
			}
			if (found) {
				aux.add(obj);
			}
			/*if (l2.contains(obj)) {
				aux.add(obj);
			}*/
		}
		return aux;
	}

	public ArrayList<E> IntersectConjunto(ArrayList<E> l1, ArrayList<E> l2) {
		HashSet<E> hash1 = new HashSet<E>();
		HashSet<E> hash2 = new HashSet<E>();
		ArrayList<E> aux = new ArrayList<E>();
		for (E obj : l1) {
			hash1.add(obj);
		}
		for (E obj : l2) {
			hash2.add(obj);
		}
		for (E obj : hash1) {
			if (hash2.contains(obj) ) {
				aux.add(obj);
			}
		}
		return aux;
	}

	public ArrayList<E> DifferenceList(ArrayList<E> l1, ArrayList<E> l2) {
		ArrayList<E> aux = new ArrayList<E>();
		for (E obj : l1) {
			if (!aux.contains(obj)) {
				aux.add(obj);
			}
		}
		for (E obj : l2) {
			if (aux.contains(obj)) {
				aux.remove(obj);
			}
		}
		return aux;
	}

	public ArrayList<E> DifferenceConjunto(ArrayList<E> l1, ArrayList<E> l2) {
		HashSet<E> hash = new HashSet<E>();
		ArrayList<E> aux = new ArrayList<E>();
		for (E obj : l1) {
			if (hash.add(obj)) {
				aux.add(obj);
			}
		}
		for (E obj : l2) {
			if (hash.contains(obj)) {
				aux.remove(obj);
			}
		}
		return aux;
	}
}


