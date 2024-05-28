package Futebol;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;
import Persistencia.GravarArquivo;
import Persistencia.LerArquivo;

public class Time {
	private String nome;
	private String apelido;
	private String fundacao;
	 private ArrayList<Jogador> plantel = new ArrayList<>(); 
	    private ArrayList<Jogador> relacionados = new ArrayList<>(); 
	
	
	public Time() {}
	
	public Time(String nome, String apelido, String fundacao, ArrayList<Jogador> plantel, ArrayList<Jogador> relacionados) {
		this.nome = nome;
		this.apelido = apelido;
		this.fundacao = fundacao;
		  this.plantel = (plantel != null) ? plantel : new ArrayList<>(); // Inicializa a lista plantel se não estiver nula
	        this.relacionados = (relacionados != null) ? relacionados : new ArrayList<>();
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
		this.apelido = apelido;
	}
	public String getFundacao() {
		return fundacao;
	}
	public void setFundacao(String fundacao) {
		this.fundacao = fundacao;
	}
	public ArrayList<Jogador> getPlantel() {
		return plantel;
	}
	public void setPlantel(ArrayList<Jogador> plantel) {
		this.plantel = plantel;
	}
	public ArrayList<Jogador> getRelacionados() {
		return relacionados;
	}
	public void setRelacionados(ArrayList<Jogador> relacionados) {
		this.relacionados = relacionados;
	}
	
	
	public void cadastrarTimeAutomatico(Time time01, Time time02) {
		
		time01.setNome("Corinthians");
		time01.setApelido("COR");
		time01.setFundacao("Bando_de_loco");
		Jogador jogador1 = new Jogador(1, "João Silva", "Joãozinho", "1995-03-10", 10, "Atacante", 80, 2, false);
		time01.plantel.add(jogador1);

		Jogador jogador2 = new Jogador(2, "Pedro Santos", "Pedrinho", "1990-07-15", 7, "Meio-campo", 85, 1, true);
		time01.plantel.add(jogador2);

		Jogador jogador3 = new Jogador(3, "Lucas Oliveira", "Luquinhas", "1992-11-20", 5, "Defensor", 75, 3, false);
		time01.plantel.add(jogador3);

		Jogador jogador4 = new Jogador(4, "Maria Costa", "Mariinha", "1998-02-28", 22, "Goleiro", 90, 0, false);
		time01.plantel.add(jogador4);

		Jogador jogador5 = new Jogador(5, "Ana Pereira", "Aninha", "1996-09-05", 3, "Meio-campo", 82, 2, true);
		time01.plantel.add(jogador5);

		Jogador jogador6 = new Jogador(6, "Felipe Santos", "Felipinho", "1994-04-12", 9, "Atacante", 79, 1, false);
		time01.plantel.add(jogador6);

		Jogador jogador7 = new Jogador(7, "Carla Oliveira", "Carlinha", "1993-06-25", 16, "Defensor", 77, 4, true);
		time01.plantel.add(jogador7);

		Jogador jogador8 = new Jogador(8, "Paulo Souza", "Paulinho", "1991-12-15", 14, "Meio-campo", 83, 2, false);
		time01.plantel.add(jogador8);

		Jogador jogador9 = new Jogador(9, "Laura Lima", "Laurinha", "1997-08-18", 8, "Atacante", 78, 3, true);
		time01.plantel.add(jogador9);

		Jogador jogador10 = new Jogador(10, "Mariana Alves", "Marizinha", "1999-01-30", 20, "Goleiro", 88, 1, false);
		time01.plantel.add(jogador10);

		Jogador jogador11 = new Jogador(11, "Gabriel Pereira", "Gabrielzinho", "1993-10-07", 11, "Meio-campo", 86, 2, true);
		time01.plantel.add(jogador11);

		Jogador jogador12 = new Jogador(12, "Rafaela Silva", "Rafinha", "1996-05-22", 4, "Defensor", 76, 0, false);
		time01.plantel.add(jogador12);

		Jogador jogador13 = new Jogador(13, "Luiz Santos", "Luizinho", "1990-03-17", 19, "Atacante", 81, 1, true);
		time01.plantel.add(jogador13);

		Jogador jogador14 = new Jogador(14, "Juliana Costa", "Julinha", "1994-11-12", 18, "Meio-campo", 84, 3, false);
		time01.plantel.add(jogador14);

		Jogador jogador15 = new Jogador(15, "Fernanda Oliveira", "Fernandinha", "1998-07-05", 6, "Defensor", 74, 2, true);
		time01.plantel.add(jogador15);

		Jogador jogador16 = new Jogador(16, "André Souza", "Andrezinho", "1992-02-20", 17, "Goleiro", 87, 1, false);
		time01.plantel.add(jogador16);

		Jogador jogador17 = new Jogador(17, "Camila Lima", "Camilinha", "1991-09-10", 2, "Meio-campo", 79, 0, true);
		time01.plantel.add(jogador17);

		Jogador jogador18 = new Jogador(18, "Roberto Pereira", "Bertinho", "1997-06-28", 15, "Atacante", 80, 2, false);
		time01.plantel.add(jogador18);

		Jogador jogador19 = new Jogador(19, "Beatriz Alves", "Bia", "1995-04-25", 12, "Defensor", 75, 1, true);
		time01.plantel.add(jogador19);

		Jogador jogador20 = new Jogador(20, "Ricardo Costa", "Ricardinho", "1993-08-30", 21, "Goleiro", 89, 3, false);
		time01.plantel.add(jogador20);

		Jogador jogador21 = new Jogador(21, "Cristina Silva", "Cristinha", "1990-12-03", 13, "Meio-campo", 82, 2, true);
		time01.plantel.add(jogador21);

		Jogador jogador22 = new Jogador(22, "Eduardo Oliveira", "Edu", "1994-10-15", 23, "Atacante", 77, 1, false);
		time01.plantel.add(jogador22);

		Jogador jogador23 = new Jogador(23, "Carolina Santos", "Carol", "1996-01-08", 1, "Defensor", 73, 2, true);
		time01.plantel.add(jogador23);
		
	
		time02.setNome("Palmeiras");
		time02.setApelido("PAL");
		time02.setFundacao("Porco");
		Jogador jogador24 = new Jogador(24, "Antonio Rodrigues", "Toninho", "1997-04-10", 9, "Atacante", 78, 3, false);
		time02.plantel.add(jogador24);

		Jogador jogador25 = new Jogador(25, "Fernanda Silva", "Fer", "1993-03-22", 5, "Meio-campo", 81, 1, true);
		time02.plantel.add(jogador25);

		Jogador jogador26 = new Jogador(26, "Ricardo Mendes", "Ricardão", "1995-08-15", 11, "Defensor", 76, 2, false);
		time02.plantel.add(jogador26);

		Jogador jogador27 = new Jogador(27, "Patrícia Lima", "Pat", "1996-12-10", 10, "Goleiro", 88, 0, true);
		time02.plantel.add(jogador27);

		Jogador jogador28 = new Jogador(28, "Thiago Costa", "Thiaguinho", "1994-07-05", 7, "Atacante", 79, 1, false);
		time02.plantel.add(jogador28);

		Jogador jogador29 = new Jogador(29, "Mariana Souza", "Mari", "1992-05-18", 8, "Meio-campo", 82, 2, true);
		time02.plantel.add(jogador29);

		Jogador jogador30 = new Jogador(30, "Felipe Fernandes", "Felipe", "1991-06-30", 6, "Defensor", 74, 3, false);
		time02.plantel.add(jogador30);

		Jogador jogador31 = new Jogador(31, "Juliana Nunes", "Juju", "1998-09-12", 4, "Goleiro", 90, 0, true);
		time02.plantel.add(jogador31);

		Jogador jogador32 = new Jogador(32, "Gustavo Alves", "Guga", "1990-10-20", 13, "Atacante", 80, 2, false);
		time02.plantel.add(jogador32);

		Jogador jogador33 = new Jogador(33, "Beatriz Santos", "Biazinha", "1997-11-25", 15, "Meio-campo", 85, 1, true);
		time02.plantel.add(jogador33);

		Jogador jogador34 = new Jogador(34, "Henrique Silva", "Henrique", "1995-01-30", 18, "Defensor", 77, 4, false);
		time02.plantel.add(jogador34);

		Jogador jogador35 = new Jogador(35, "Camila Fernandes", "Cami", "1993-12-15", 12, "Goleiro", 89, 0, true);
		time02.plantel.add(jogador35);

		Jogador jogador36 = new Jogador(36, "Eduardo Oliveira", "Dudu", "1992-04-05", 2, "Atacante", 83, 1, false);
		time02.plantel.add(jogador36);

		Jogador jogador37 = new Jogador(37, "Rafaela Costa", "Rafa", "1996-11-11", 14, "Meio-campo", 80, 2, true);
		time02.plantel.add(jogador37);

		Jogador jogador38 = new Jogador(38, "André Gomes", "André", "1990-07-23", 20, "Defensor", 75, 3, false);
		time02.plantel.add(jogador38);

		Jogador jogador39 = new Jogador(39, "Bianca Lima", "Bibi", "1991-09-17", 3, "Goleiro", 87, 0, true);
		time02.plantel.add(jogador39);

		Jogador jogador40 = new Jogador(40, "Daniel Pereira", "Dani", "1997-02-28", 19, "Atacante", 78, 2, false);
		time02.plantel.add(jogador40);

		Jogador jogador41 = new Jogador(41, "Larissa Nunes", "Lari", "1993-06-19", 22, "Meio-campo", 84, 1, true);
		time02.plantel.add(jogador41);

		Jogador jogador42 = new Jogador(42, "Roberto Silva", "Betão", "1992-01-25", 16, "Defensor", 76, 3, false);
		time02.plantel.add(jogador42);

		Jogador jogador43 = new Jogador(43, "Gabriela Alves", "Gabi", "1998-08-08", 17, "Goleiro", 91, 0, true);
		time02.plantel.add(jogador43);

		Jogador jogador44 = new Jogador(44, "Lucas Mendes", "Luquinha", "1994-03-14", 21, "Atacante", 79, 1, false);
		time02.plantel.add(jogador44);

		Jogador jogador45 = new Jogador(45, "Sofia Costa", "Sofi", "1990-05-07", 23, "Meio-campo", 82, 2, true);
		time02.plantel.add(jogador45);

		Jogador jogador46 = new Jogador(46, "Rodrigo Fernandes", "Rodrigão", "1996-02-22", 24, "Defensor", 77, 3, false);
		time02.plantel.add(jogador46);
		JOptionPane.showMessageDialog(null, "Jogadores foram cadastrados com sucesso!");
	}
	
	public void cadastrarTimeArquivo(Time time01, Time time02) throws IOException {
	String nome = JOptionPane.showInputDialog("Digite o nome do arquivo.txt :");
	  if (nome != null && !nome.trim().isEmpty()) {
		  
            String nomeArquivo = "C:\\Users\\nicol\\" + nome;
            File arquivo = new File(nomeArquivo);
            if (arquivo.exists() && arquivo.isFile()) {
            LerArquivo.importar(nomeArquivo, time01, time02);
            } else {
                JOptionPane.showMessageDialog(null, "Arquivo não encontrado: " + nomeArquivo, "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else { 
            JOptionPane.showMessageDialog(null, "Nome de arquivo inválido.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
	}
	public void listagemConsole(Time time01, Time time02) {
		System.out.println("Dados do time 01:");
    	System.out.println("\nNome: "+time01.getNome() + "\nApelido: "+time01.getApelido() + "\nFundação: "+time01.getFundacao());
		System.out.println("Jogadores do time 01: ");
		for(Jogador jogador : time01.getPlantel()) {
			System.out.println(jogador);
		}
		System.out.println(" ");
		System.out.println("\nDados do time 02: ");
		System.out.println("\nNome: "+time02.getNome() + "\nApelido: "+time02.getApelido() + "\nFundação: "+time02.getFundacao());
		System.out.println("Jogadores do time 02: ");
		for(Jogador jogador : time02.getPlantel()) {
			System.out.println(jogador);
		}
	}
	
	public void listagemArquivo(Time time01, Time time02) throws IOException {
		String nomeArquivo = "C:\\Users\\nicol\\ListagemTimes.txt";
		GravarArquivo.gravar(nomeArquivo, time01, time02);
		JOptionPane.showMessageDialog(null, "Confira o seu time em: \nC:\\Users\\nicol\\ListagemTimes.txt");
	}
	
	public void relacionarJogadores(ArrayList<Jogador> ListaJogadores) {
			 ArrayList<Jogador> jogadoresSelecionados = new  ArrayList<Jogador>();
			 Collections.sort(ListaJogadores, new Comparator<Jogador>() {
		            @Override
		            public int compare(Jogador j1, Jogador j2) {
		                return Integer.compare(j2.getQualidade(), j1.getQualidade());
		            }
		        });		
			 
			  for (int i = 0; i < Math.max(11, ListaJogadores.size()); i++) {
				  jogadoresSelecionados.add(ListaJogadores.get(i));
				} 
				System.out.println(jogadoresSelecionados);
			  
		
		}
		
	}
	
	

