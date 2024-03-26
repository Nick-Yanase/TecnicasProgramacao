package PorjetoBanco;

import java.util.Scanner;

public class Gerente extends Funcionario {
	
	private String senhaAtual;
	private int numeroDeFuncionariosGerenciados;
	
	/* pega os valores digitados na main, colocados dentro da instancia do gerente e smepre
	 coloque o mesmo numero de campos na instancia e no construtor. 
	
	*/
	public Gerente(int id, String nome, double salario, int numeroDeFuncionariosGerenciados, String senhaAtual) {
		super(id, nome, salario);
		this.senhaAtual = senhaAtual;
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}
	
	public void alterarSenha(String senhaNova) {
	Scanner in = new Scanner(System.in);
	int cont=0;
	
	//este loop vai fazer com que o usuario seja forçado a escrever a senha correta para sair
	do {
		System.out.println("\nDigite sua senha atual: ");
		String senha = in.next();
		
		if(senha.equalsIgnoreCase(senhaAtual)) {
			System.out.println("Certo! Digite sua nova senha:");
			senhaNova = in.next();
			senhaAtual = senhaNova;
			cont++;
		}
		else {
			System.out.println("Digite a senha correta para trocar!");
		}
		}while(cont==0);
		System.out.println("\nSenha trocada com sucesso!");
		
		
	}
	
	/*Estou usando o toString de funcnioarnio para pegar o id, nome e salario, e dps coloca
	 o toString da classe gerente para mostrar a senha atual e num de func gerenciados
	  */
	@Override
	public String toString() {
		return super.toString() + ("\nSenha Atual: "+senhaAtual+ "\nNúmero de funcionarios gerenciados: "+numeroDeFuncionariosGerenciados);
	}
}

	
