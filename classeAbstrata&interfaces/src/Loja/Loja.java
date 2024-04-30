package Loja;

public abstract class Loja {
	public int identificador;
	public String cnpj;
	public String razaoSocial;
	public boolean aberta;
	
	public Loja(String cnpj, String razaoSocial ) {
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.aberta = false;
	}
	
	@Override
	public String toString() {
		return "\nCNPJ: "+this.cnpj+ "\nrazao social:" +this.razaoSocial+ "\nStatus: "+this.aberta;
	}
	
}
