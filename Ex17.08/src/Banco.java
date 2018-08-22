import java.util.InputMismatchException;
import java.util.Scanner;


public class Banco {
	private int idade;
	private String nome;
	private Banco arr[];
	private int cont = 0;
	
	public Banco() {
		arr = new Banco[10];
		menu();
	}
	
	private Banco(int id, String no) {
		setIdade(id);
		setNome(no);
	}
	
	public void menu() {
		boolean ok = false;
		do {
			System.out.println("Digite 1 para cadastrar novo cliente.");
			System.out.println("Digite 2 para proximo da fila.");
			Scanner scan = new Scanner(System.in);
			int k = scan.nextInt();
			if (k == 1) {
				cadastraCliente();
				ok = true;
			} else if(k == 2) {
				proximoCliente();
				ok = true;
			}else {
				System.out.println("digite um valor valido");
			}
		}while (ok == false);
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void cadastraCliente(){
		Scanner scan = new Scanner(System.in);
		System.out.println("digite o nome do cliente: ");
		String no = (scan.nextLine());
		System.out.println("digite a idade do cliente " + no + " :");
		Exception a = null;
		int id = 0;
		try {
			id = (scan.nextInt());
		} catch (java.util.InputMismatchException e) {
			System.out.println("Erro: " + e + " digite um valor valido");
			a = e;
		}finally{
			if(a == null) {
				arr[cont] = new Banco(id, no);
				System.out.println("cadastro concluido.");
			}
		}	
		menu();
	}
	
	public void proximoCliente() {
		System.out.println("Digite o numero do caixa: ");
		Scanner scan = new Scanner(System.in);
		try {
			int k = scan.nextInt();
		} catch (java.util.InputMismatchException e) {
			System.out.println("Erro: " + e + " digite um valor valido de 1 a 20: ");
			proximoCliente();
		}
		
	}
	
}
