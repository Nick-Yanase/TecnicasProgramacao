package PorjetoBanco;

public class ContaLimite extends Conta {
	private double limite;
	
	public ContaLimite(int id, Cliente titular, double saldo, double limite) {
		super(id, titular, saldo);
		this.limite = limite;
	}
	
	
	// SOBRESCREVI OS METODOS DE CONTA 
	@Override
	public void transferir(Conta destino, double transferir) {
		double resto = (saldo + this.limite) - transferir;
		saldo -= transferir;
		destino.depositar(transferir);
	}
	
	@Override
	public void sacar(double sacar) {
		double resto = (saldo + this.limite) - sacar;
		
		  if(this.saldo>0){
	            if(sacar <= saldo ){
	                this.saldo = this.saldo - sacar;
	                
	                System.out.println("Saque realizado com sucesso");
	            }
	            
	            else{
	                System.out.println("Você não tem esse saldo disponivel para saque!");
	            }
	        }
	        else{
	            System.out.println("você não tem Saldo suficiente para saque");
	        }
	}
	
	@Override
	public void depositar(double deposito) {
		saldo += deposito; 
	}
	
	@Override
	public String toString() {
		return ("::: Conta Limite :::")+super.toString() + ("\nLimite: "+limite+ " \nTotal em conta R$"+(saldo+limite));
	}
	
}
