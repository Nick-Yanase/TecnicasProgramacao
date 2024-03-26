package PorjetoBanco;
import java.util.ArrayList;
import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		  
		 
		 
		//  PROGRAMA QUE MOSTRA OS DADOS DE ContaLimite e ContaCorrente E FAZ OPERAÇÕES ENTRE AS DUAS
		 Cliente cli = new Cliente("nicolas", "123123123");
		 ContaLimite cl = new ContaLimite(1,cli, 1000, 200);
		 ContaCorrente cc = new ContaCorrente(1,cli, 500);
		 
		 cl.depositar(100);
		 cc.depositar(350);
		 
		 
		 cl.transferir(cc, 200);
		 
		 System.out.println(cc);
		 System.out.println(cl);
		 
		 
		 
		 /* PROGRAMA PARA ALTERAR SENHA DO GERENTE
		  int decisao=0;
		  
		  System.out.println("Digite o id do gerente:");
		  int id = in.nextInt();
		  
		  System.out.println("Digite o nome do gerente");
		  String nome = in.next();
		  
		  System.out.println("Digite o salario do gerente");
		  double salario = in.nextDouble();
		  
		  
		  System.out.println("Digite o numero de funcionarios gerenciasdos pelo gerente:");
		  int numeroFunc = in.nextInt();
		  
		  System.out.println("Digite a senha do gerente");
		  String senhaAtual = in.next();
		  
		  Gerente g = new Gerente(id, nome, salario, numeroFunc, senhaAtual);
		  
		
		  
		  do{
			  System.out.println("Escolha uma das opções: \n[1] Mostrar dados \n[2] Alterar senha do gerente \n[3] Sair");
			  decisao = in.nextInt();
			  
			  if(decisao==1) {
				  System.out.println(g);
			  }
			  
			  if(decisao==2) {
				  g.alterarSenha(senhaAtual);
			  }
		  }while(decisao!=3);
		  System.out.println("banco finalizado");
		  */
		  
		  
		  
		  /* PROGARAMA QUE CRIA VARIAS CONTAS E ADICIONA DENTRO DE UM ARRAYLIST
		     int decisao=0;
		     int cont=0;
		     
		     ArrayList<Conta> ListaCont = new ArrayList<Conta>();
		     
		     do {
		        System.out.println("Digite o id da conta");
		        int id = in.nextInt();
		        
		        System.out.println("Digite o nome do cliente");
		        String nome = in.next();
		        
		        System.out.println("Digite o CPF do cliente");
		        String cpf = in.next();
		        
		        System.out.println("Digite o saldo da conta");
		        double saldo = in.nextDouble();
		                
		        Cliente cli =  new Cliente(nome, cpf);
		        
		        Conta c = new Conta(id, cli, saldo );
		        
		        ListaCont.add(c);
		        
		         System.out.println("\n[1]Adicionar mais uma conta? \n[2]Sair");
		         decisao = in.nextInt();
		         
		         cont++;
		     }while(decisao==1);
		        
		        System.out.println("Foram inseridas "+cont+" contas");
		        System.out.println(ListaCont);
		     */
		     
		     
		     
		     /*  PROGRAMA QUE PEDE DADOS E MOSTRA OS DADOS, FAZ SAQUES E DEPOSITO
		     
		        System.out.println("Digite o id da conta:");
		        int id = in.nextInt();
		     
		        System.out.println("Digite o nome da cliente:");
		        String nome = in.next();
		        
		        System.out.println("Digite o CPF do cliente:");
		        String cpf = in.next();
		        
		        System.out.println("Digite o saldo da conta:");
		        double saldo = in.nextDouble();
		        
		        // Criar objeto Cliente com as informações fornecidas
		        Cliente cli = new Cliente(nome, cpf);
		     
		        // Criar objeto Conta com o id, cliente e saldo fornecidos
		        Conta c = new Conta(id, cli, saldo );
		        
		        //operações
		        int decisao1=0, decisao2=0;
		            
		        do{
		            System.out.println("\nDigite a opção desejada: \n[1] Mostrar dados \n[2] Saque \n[3] Deposito");
		            decisao1 = in.nextInt();
		            
		            if(decisao1 == 1){
		                 System.out.println(c);
		                
		            }
		            if(decisao1 == 2){
		                System.out.println("\nSeu saldo disponivel é "+c.getSaldo()+ "\nDigite o valor de saque:" );
		                double valSacar = in.nextDouble();
		                c.sacar(valSacar);
		              
		            }
		                    
		            if(decisao1 == 3){
		                System.out.println("\nSeu saldo disponivel é "+c.getSaldo()+ "\nDigite o valor de deposito:" );
		                double valDepositar = in.nextDouble();
		                c.depositar(valDepositar);
		                
		            }
		             System.out.println("\n[1] finalizar \n[2]outra operação");
		             decisao2 = in.nextInt();
		        }while(decisao2 != 1);
		        
		        System.out.println("Saindo do banco!");*/


	}

}
