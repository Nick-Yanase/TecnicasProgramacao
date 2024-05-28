package Futebol;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;

import Persistencia.GravarArquivo;
import Persistencia.LerArquivo;


public class Jogador {
	private int id;
	private String nome;
	private String apelido;
	private String dataNascimento;
	private int numero;
	private String posicao;
	private int qualidade;
	private int cartoes;
	private boolean suspenso;
	
	public Jogador(){}
	
	public Jogador(int id, String nome, String apelido, String dataNascimento, int numero, String posicao, int qualidade, int cartoes, boolean suspenso) {
		this.id = id;
		this.nome = nome;
		this.apelido = apelido;
		this.dataNascimento = dataNascimento;
		this.numero = numero;
		this.posicao = posicao;
		this.qualidade = qualidade;
		this.cartoes = cartoes;
		this.suspenso = suspenso;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		apelido = apelido;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public int getQualidade() {
		return qualidade;
	}

	public void setQualidade(int qualidade) {
		this.qualidade = qualidade;
	}

	public int getCartoes() {
		return cartoes;
	}

	public void setCartoes(int cartoes) {
		this.cartoes = cartoes;
	}

	public boolean isSuspenso() {
		return suspenso;
	}

	public void setSuspenso(boolean suspenso) {
		this.suspenso = suspenso;
	}
	
	public boolean verificarCondicaoDeJogo() {
		return (this.cartoes >= 3) ? true : false;
		
	}
	
	
	public void aplicarCartao(ArrayList<Jogador> ListaJogadores, int quantidade) {
		System.out.println("\nJogadores do time: ");
		for(Jogador jogador : ListaJogadores) {
			System.out.println(jogador.getId() + ": " + jogador.getNome()+ " - Cartões:"+jogador.getCartoes());
		}
		id=Integer.parseInt(JOptionPane.showInputDialog("Digite o id do jogador:"));
		
		// Encontrar o jogador correspondente ao ID selecionado
		Jogador jogadorSelecionado = null;
		for(Jogador jogador: ListaJogadores) {
			if(jogador.getId() == id) {
				jogadorSelecionado = jogador;
				break;
			}
		}
		//se jogador for selecionado pegue os cartões que ele tem + a quantidade adicionada
		if(jogadorSelecionado != null) {
			jogadorSelecionado.setCartoes(jogadorSelecionado.getCartoes()+ quantidade);
			JOptionPane.showMessageDialog(null, "Cartões adicionados com sucesso! \n"+jogadorSelecionado.nome+ " possui " +jogadorSelecionado.cartoes+ " cartão/cartões.");
		 } else {
            System.out.println("Jogador não encontrado.");
        }
	}
	
	public void cumprirSuspensao(ArrayList<Jogador> ListaJogadores) {
		for(Jogador jogador : ListaJogadores) {
			System.out.println(jogador.getId() + ": " + jogador.getNome());
		}
		
		int id=Integer.parseInt(JOptionPane.showInputDialog("Digite o id do jogador:"));
		
		Jogador jogadorSelecionado = null;
		for(Jogador jogador : ListaJogadores) {
			if(jogador.getId() == id) {
				jogadorSelecionado = jogador;
				break;
			}
		}
		
		if(jogadorSelecionado != null) {
			jogadorSelecionado.setCartoes(0);
			JOptionPane.showMessageDialog(null, "Suspensão cumprida com sucesso! \n"+jogadorSelecionado.nome+ " possui " +jogadorSelecionado.cartoes+ " cartões.");
		 } else {
           System.out.println("Jogador não encontrado.");
		}
	}
	
	public void sofrerLesao(Time time01, Time time02) {
		/*LISTAGEM DE TODOS OS JOGADORES*/
		System.out.println("\nJogadores do "+time01.getNome());
		for(Jogador jogador : time01.getPlantel()) {
			System.out.println(jogador.getId() + ": " + jogador.getNome()+ " - Qualidade:"+jogador.getQualidade());
		}
		System.out.println("\nJogadores do "+time02.getNome());
		for(Jogador jogador : time02.getPlantel()) {
			System.out.println(jogador.getId() + ": " + jogador.getNome()+ " - Qualidade:"+jogador.getQualidade());
		}
		int id=Integer.parseInt(JOptionPane.showInputDialog("Digite o id do jogador:"));
		
		Jogador jogadorSelecionado = null;
		for(Jogador jogador1 : time01.getPlantel()) {
			if(jogador1.getId() == id) {
				jogadorSelecionado = jogador1;
			}else {
				for(Jogador jogador2 : time02.getPlantel()) {
					if(jogador2.getId() == id) {
						jogadorSelecionado = jogador2;
						break;
					}
				}
				
			}
		}
		
		if(jogadorSelecionado != null) {
			Random random = new Random();
		// Gerar um número aleatório para representar a gravidade da lesão (entre 1 e 100)
			int gravidade = random.nextInt(100)+1;
			
			int reducaoQualidade;
			
			if(gravidade <= 5) {
				reducaoQualidade = (int) (0.15 * jogadorSelecionado.getQualidade());
			}
			else if (gravidade <= 15) {
	            reducaoQualidade = (int) (0.10 * jogadorSelecionado.getQualidade());
	        } 
			else if (gravidade <= 30) {
	            reducaoQualidade = (int) (0.05 * jogadorSelecionado.getQualidade());
	        } 
			else if (gravidade <= 60) {
	            reducaoQualidade = 2; 
	        } 
			else {
	            reducaoQualidade = 1; 
	        }
			
			if(reducaoQualidade >= jogadorSelecionado.getQualidade()) {
				jogadorSelecionado.setQualidade(0);
			}
			else {
				jogadorSelecionado.setQualidade(jogadorSelecionado.getQualidade() - reducaoQualidade);
				JOptionPane.showMessageDialog(null, "Lesão adicionada! \n"+jogadorSelecionado.nome+ " sofreu " +reducaoQualidade+ " de lesão, ficando com "+jogadorSelecionado.qualidade);
			}
		}
		 else {
      System.out.println("Jogador não encontrado.");
		 }
	}
	
	public void executarTreinamento(Time time01, Time time02) {
		System.out.println("\nJogadores do "+time01.getNome());
		for(Jogador jogador : time01.getPlantel()) {
			System.out.println(jogador.getId() + ": " + jogador.getNome()+ " - Qualidade:"+jogador.getQualidade());
		}
		System.out.println("\nJogadores do "+time02.getNome());
		for(Jogador jogador : time02.getPlantel()) {
			System.out.println(jogador.getId() + ": " + jogador.getNome()+ " - Qualidade:"+jogador.getQualidade());
		}
		int id=Integer.parseInt(JOptionPane.showInputDialog("Digite o id do jogador:"));
		
		Jogador jogadorSelecionado = null;
		for(Jogador jogador1 : time01.getPlantel()) {
			if(jogador1.getId() == id) {
				jogadorSelecionado = jogador1;
			}else {
				for(Jogador jogador2 : time02.getPlantel()) {
					if(jogador2.getId() == id) {
						jogadorSelecionado = jogador2;
						break;
					}
				}
				
			}
		}
		if(jogadorSelecionado != null) {
			Random random = new Random();
			int probabilidade = random.nextInt(100)+1;;
			int aumentoQualidade;
			
			if(probabilidade < 5) {
				aumentoQualidade = 5;
			}
			else if (probabilidade <= 15) {
				aumentoQualidade = 4;
	        } 
			else if (probabilidade <= 30) {
				aumentoQualidade = 3;
	        } 
			else if (probabilidade <= 60) {
				aumentoQualidade = 2; 
	        } 
			else {
				aumentoQualidade = 1; 
	        }
			
			if((aumentoQualidade + jogadorSelecionado.getQualidade()) >= 100) {
				jogadorSelecionado.setQualidade(100);
				JOptionPane.showMessageDialog(null, "jogador está com qualidade no máximo");
			}
			else {
				jogadorSelecionado.setQualidade(jogadorSelecionado.getQualidade() + aumentoQualidade);
				JOptionPane.showMessageDialog(null, "Treinamento concluido! \n"+jogadorSelecionado.nome+ " aumentou " +aumentoQualidade+ " pontos de qualidade, ficando com "+jogadorSelecionado.qualidade);
			}
		}
		 else {
		      System.out.println("Jogador não encontrado.");
			 }
	}
	
	
	@Override
	public String toString() {
		return "\n" +this.posicao+": " +this.id+ " - " +this.nome+ " ("+this.apelido+") - " +this.dataNascimento+ " CONDIÇÃO: "+ verificarCondicaoDeJogo()+ " - QUALIDADE: "+this.qualidade ;
	}
	
	
}
