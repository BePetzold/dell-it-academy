package Professores;

import java.util.*;

public class ProfessorCompaircargaHoraria implements Comparator<Professor>{
	
	public int compare(Professor a, Professor b) {
		Professor p1 = a;
		Professor p2 = b;
		Integer aux = (Integer)p1.getCargaHoraria();
		return aux.compareTo((Integer)p2.getCargaHoraria());
	}
}
