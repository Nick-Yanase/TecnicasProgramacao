package Banco;

public interface Conta {
	boolean depositar(double valor);
	boolean sacar(double valor);
	double getSaldo();
}
