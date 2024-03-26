package PorjetoBanco;

public class Funcionario {
	private int id;
	private String nome;
	private double salario;
	
	public Funcionario(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return ("id: "+id+" \nNome: "+nome+" \nSalario: "+salario);
	}
	
}


	