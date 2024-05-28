package Persistencia;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Futebol.Jogador;
import Futebol.Time;

public class GravarArquivo {
	public static void gravar(String nomeArquivo, Time time01, Time time02) throws IOException {
		 FileWriter arquivo = new FileWriter(nomeArquivo); //cria objetivo do tipo arquivo 
	     PrintWriter gravarLinha = new PrintWriter(arquivo); //habilita arquivo para ser gravado 
	     if(time01.getPlantel() == null) {
	    	 JOptionPane.showMessageDialog(null, "Não possui nenhum jogador cadastrado na lista.");
	     }else {
	    	 gravarLinha.println("Dados do time 01:"+"\nNome: "+time01.getNome() + "\nApelido: "+time01.getApelido() + "\nFundação: "+time01.getFundacao());
	    	 gravarLinha.println("Jogadores do time 01");
	    	 for(Jogador jogador : time01.getPlantel()) {
	    	 gravarLinha.println(jogador);
	     	}
	     }
	     
	     if(time02.getPlantel() == null) {
	    	 JOptionPane.showMessageDialog(null, "Não possui nenhum jogador cadastrado na lista.");
	     }else {
	    	 gravarLinha.println("\nDados do time 02:"+"\nNome: "+time02.getNome() + "\nApelido: "+time02.getApelido() + "\nFundação: "+time02.getFundacao());
	    	 gravarLinha.println("Jogadores do time 02");
	    	 for(Jogador jogador : time02.getPlantel()) {
	    	 gravarLinha.println(jogador);
	     	}
	     }
	     gravarLinha.close();//fecha o arquivo 
	}
}
