/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fatec.persistencia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author nicol
 */
public class Arquivo {
    
    public static void importar( String nomedoarquivo, ArrayList<String> lista) { 

        try{ 

        FileReader arq = new FileReader(nomedoarquivo); // objeto do tipo arquivo para leitura 

        BufferedReader lerArq = new BufferedReader(arq); //buffer para leitura 

        String linha = lerArq.readLine(); // lê a primeira linha 
        // a variável "linha" recebe o valor "null" quando o processo 

        // de repetição atingir o final do arquivo texto 

        while (linha != null) { 

            lista.add(linha); 
            System.out.println(linha);
            linha = lerArq.readLine(); // lê da segunda até a última linha 
            
        } 

        arq.close(); 

        } catch (IOException e) { 

        System.err.printf("Erro na abertura do arquivo: %s.", e.getMessage()); 

        } 

        } 
    
    public static void gravar (ArrayList<String> lista, String nomedoarquivo) throws IOException{ 
        FileWriter arq = new FileWriter(nomedoarquivo); //cria objetivo do tipo arquivo 

        PrintWriter gravarArq = new PrintWriter(arq); //habilita arquivo para ser gravado 

        //percorre a lista e grava no arquivo 

        for (String nome: lista) { 

              gravarArq.println(nome); 

        } 

        gravarArq.close();//fecha o arquivo 

            }
}
