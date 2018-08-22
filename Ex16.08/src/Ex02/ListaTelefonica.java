package Ex02;
import java.util.Map;
import java.util.HashMap;

public class ListaTelefonica {
	private Map<String, String> colecao = new HashMap<String, String>();
	
	public void add(String nome, String numero) {
		colecao.put(nome, numero);
	}
	
	public String buscarNumero(String nome) {
		return colecao.get(nome);
	}
		
	public void remover(String nome) {
		colecao.remove(nome);
	}
	
	public int tamanho() {
		return colecao.size();
	}
	
	public void printAllNum() {
		for(String E: colecao.keySet()) {
			System.out.println(buscarNumero(E));
		}
	}
		
	public static void main(String arg[]) {
		ListaTelefonica t = new ListaTelefonica();
		
		t.add("joao", "3333-5555");
		t.add("maria", "5555-8888");
		
		t.printAllNum();
		
		t.remover("joao");
		
		t.printAllNum();
		
		System.out.println(t.tamanho());
	}
	
}
