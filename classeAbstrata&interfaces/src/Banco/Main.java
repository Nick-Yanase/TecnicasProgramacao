package Banco;

public class Main {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(1000);
		
		
		
		System.out.println(cc.sacar(900));
		System.out.println(cc.getSaldo());
		System.out.println(cc.depositar(900));
		

	}

}
