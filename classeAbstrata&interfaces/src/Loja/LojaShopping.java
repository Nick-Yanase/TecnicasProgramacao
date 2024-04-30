package Loja;

public class LojaShopping extends Loja implements Registro {
	public String endereco;
	public String gerente;
	
	public LojaShopping(String cnpj, String razaoSocial, boolean aberta, String endereco, String gerente) {
		super(cnpj, razaoSocial);
		this.endereco = endereco;
		this.gerente = gerente;
		this.aberta = false;
	}
	
	@Override
	public String toString() {
		return super.toString()+ "\nEndereço: "+this.endereco+ "\nGerente: "+this.gerente;
	}

	@Override
	public boolean registra_abertura_dia() {
		if(this.aberta = false) {
			return true;
		}
		return false;
	}

	@Override
	public boolean registra_fechamento_dia() {
		if(this.aberta = true) {
			return false;
		}
		return true;
	}
}
