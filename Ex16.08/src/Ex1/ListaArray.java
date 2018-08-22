package Ex1;

public class ListaArray<E> {
	private E arr[];
	
	public ListaArray(int qtd) {
		arr = (E[])new Object[qtd];
	}
	

	public boolean add(E it) { //adiciona ao final
		for(int i=0; i < arr.length; i++) {
			if (arr[i] == null) {
				arr[i] = it;
				return true;
			}
		}
		return false;
	}
	
	
	public boolean add(E it, int pos) { //adiciona a posição
		E aux = arr[pos];
		E aux2;
		for (int i=pos; i < arr.length-1; i++) {
			aux2 = arr[i+1];
			arr[i+1] = aux;
			aux = aux2;
		}
		arr[pos] = it;
		return true;
	}
	
	
	public double remove(int pos) { //remove na posição
		for (int i=pos; i < arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = null;
		return 0;
	}
	
	
	public E get(int pos) { //retorna na posição
		return arr[pos];
	}
	
	public void printAll() {
		for (int i=0; i<arr.length; i++)
		System.out.println(arr[i]);
	}
	
	
	public static void main (String args[]) {
		ListaArray<String> t = new ListaArray<String>(5);
		
		t.add("ta dando certo");
		t.add("e contuinua");
		
		System.out.println(t.get(0));
		System.out.println(t.get(1));		
		
		t.remove(1);
		
		t.printAll();
		
	}
}