package Interfaces2;

import java.util.*;

public class PaisComparadorNome implements Comparator<Pais>{
	
	public int compare(Pais obj1, Pais obj2) {
		Pais pais1 = obj1;
		Pais pais2 = obj2;
		return pais1.getNome().compareTo(pais2.getNome());
	}
}
