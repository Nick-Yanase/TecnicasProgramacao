package Persistencia;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Futebol.Jogador; 
import Futebol.Time;

public class LerArquivo {
	
	public static void importar(String nomeArquivo, Time time01, Time time02) throws IOException {
	    try {
            FileReader arquivo = new FileReader(nomeArquivo);
            BufferedReader lerLinha = new BufferedReader(arquivo);
            
            // Atributos do time
            String nomeTime, apelidoTime, fundacao;
            // Atributos Jogador
            int id, numero, qualidade, cartoes;
            String nome, apelido, dataNascimento, posicao;
            boolean suspenso;
            Jogador jogadorNovo;
            boolean isTime2 = false;
            
            // Leitura dos detalhes do primeiro time
            nomeTime = lerLinha.readLine();
            time01.setNome(nomeTime);
            apelidoTime = lerLinha.readLine();
            time01.setApelido(apelidoTime);
            fundacao = lerLinha.readLine();
            time01.setFundacao(fundacao);

            while (true) {
                String linha = lerLinha.readLine();
                if (linha == null) {
                    break; // Fim do arquivo
                }

                if (linha.equalsIgnoreCase("TIME02")) {
                    isTime2 = true;
                    // Leitura dos detalhes do segundo time
                    nomeTime = lerLinha.readLine();
                    time02.setNome(nomeTime);
                    apelidoTime = lerLinha.readLine();
                    time02.setApelido(apelidoTime);
                    fundacao = lerLinha.readLine();
                    time02.setFundacao(fundacao);
                    continue;
                }

                try {
                    // Leitura dos atributos do jogador
                    id = Integer.parseInt(linha);
                    nome = lerLinha.readLine();
                    apelido = lerLinha.readLine();
                    dataNascimento = lerLinha.readLine();
                    numero = Integer.parseInt(lerLinha.readLine());
                    posicao = lerLinha.readLine();
                    qualidade = Integer.parseInt(lerLinha.readLine());
                    cartoes = Integer.parseInt(lerLinha.readLine());
                    suspenso = Boolean.parseBoolean(lerLinha.readLine());

                    // Criação do novo jogador
                    jogadorNovo = new Jogador(id, nome, apelido, dataNascimento, numero, posicao, qualidade, cartoes, suspenso);

                    // Adição do jogador ao plantel do time apropriado
                    if (isTime2) {
                        time02.getPlantel().add(jogadorNovo);
                    } else {
                        time01.getPlantel().add(jogadorNovo);
                    }
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Erro de formato de número: " + linha);
                } catch (IOException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Erro de leitura de linha: " + linha);
                }
            }

            JOptionPane.showMessageDialog(null, "Jogadores foram cadastrados com sucesso!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado: " + nomeArquivo);
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro de leitura do arquivo: " + nomeArquivo);
        }
    }
}