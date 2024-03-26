package PorjetoBanco;

public class Conta {
    protected int id;
    protected Cliente titular;//titular vai receber dois atributos de cliente, o nome e cpf
    protected double saldo;
    
   
    /*Os construtores servem pra gente poder adicionar os valores de forma automatica dentro de
    Conta c = new Conta( CONSTRUTOR )
    colocando apenas os nomes dos atributos que colocamos no construtor */
    public Conta(int id, Cliente titular, double saldo){
        this.id = id;
        this.titular = titular;
        this.saldo = saldo;
    }
    
    //get e set
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
   public Cliente getTitular(){
        return titular;
    }
    
    public void setTitular(Cliente titular){
        this.titular = titular;
    }
    
     public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    //METHODS
    
    //vai mostrar tudo bunitinho quando printar so a conta (c)
    @Override
    public String toString(){
        return ("\n\nid: "+id+ titular+ "\nSaldo:" +saldo+"\n"); 
        
    }

    public void sacar(double sacar) {
        int decisao=0;
        
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
    
    public void transferir(Conta destino, double transferir) {
    	this.saldo -= transferir;
    }
    
    public void depositar(double deposito){
        this.saldo += deposito;
        System.out.println("Deposito realizado com sucesso");
    }

}
