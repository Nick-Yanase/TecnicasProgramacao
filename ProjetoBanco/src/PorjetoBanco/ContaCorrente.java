package PorjetoBanco;

public class ContaCorrente extends Conta {
	public ContaCorrente(int id, Cliente titular, double saldo) {
		super(id, titular, saldo);
	}
	@Override
	public String toString() {
		return ("::: Conta Corrente :::")+super.toString();
	}
	
}
