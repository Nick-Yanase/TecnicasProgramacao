package PorjetoBanco;

public class Cliente {
		private String nome;
	    private String cpf;
	    
	    /*Neste construtor ele esta possibilitando que em "Cliente cli = new Cliente();"
	    Possamos colocar apenas os nomes dos atributos que demos no construtor para chamar ficando
	    Cliente cli = new Cliente(nome, cpf);
	    */
	    public Cliente(String nome, String cpf){
	        this.nome = nome; //variaveis acima são colocadas como parametro para receber valores da main e se igualar aos artributos privados da classe Cliente
	        this.cpf = cpf;
	    }
	    
	    //se chamarmos a titular sem over vai mostrar um cod estranho de espaço de memoria
	    @Override
	    public String toString() {
	        return ("\nNome: "+nome+" \nCPF: "+cpf); 
	    }
}
