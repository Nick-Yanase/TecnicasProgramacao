package Banco;

public class ContaCorrente implements Conta {
	public double valor;
	
	public ContaCorrente(double valor){
		this.valor = valor;
	}
	
	@Override
	public boolean depositar(double valorDep) {
		if (valorDep > this.valor) {
			this.valor += valorDep;
			return true;
		}
		return false;
	}

	@Override
	public boolean sacar(double valorSaq) {
		if (valorSaq >= this.valor) {
			this.valor -= valorSaq;
			return true;
		}
		return false;
	}

	@Override
	public double getSaldo() {
		return this.valor;
	}

}
