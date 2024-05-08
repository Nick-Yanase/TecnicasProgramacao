/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fatec.persistencia01;

import br.com.fatec.model01.Contato;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nicol
 */
public class Arquivo {
    
    public static void importar( String nomedoarquivo, ArrayList<Contato> lista) { 
        Scanner scan = new Scanner(System.in);
        try{ 
        
        FileReader arq = new FileReader(nomedoarquivo); // objeto do tipo arquivo para leitura 

        BufferedReader lerArq = new BufferedReader(arq); //buffer para leitura 
        
        String nome, email, telefone;
        Contato c;
       
        for(int i=0; i<2; i++){
            System.out.println("Digite o nome do contato:");
            nome = scan.next();
            System.out.println("Digite o email do contato:");
            email = scan.next();
            System.out.println("Digite o telefone do contato:");
            telefone = scan.next();
            
            lista.add(new Contato(nome, email, telefone));
        }
        
        nome = lerArq.readLine(); // lê a primeira linha 

        while (nome != null) { 
            
            email = lerArq.readLine(); // lê da segunda até a última linha  
            
            telefone = lerArq.readLine();
           
            c = new Contato(nome, email, telefone);
            lista.add(c);
            nome = lerArq.readLine(); 
            
        } 
            System.out.println(lista);
        arq.close(); 

        } catch (IOException e) { 

        System.err.printf("Erro na abertura do arquivo: %s.", e.getMessage()); 

        } 

        } 
    
    public static void gravar (ArrayList<Contato> lista, String nomedoarquivo) throws IOException{ 
        FileWriter arq = new FileWriter(nomedoarquivo); //cria objetivo do tipo arquivo 

        PrintWriter gravarArq = new PrintWriter(arq); //habilita arquivo para ser gravado 

        //percorre a lista e grava no arquivo 

        for (Contato Contato: lista) { 

              gravarArq.println(Contato); 

        } 

        gravarArq.close();//fecha o arquivo 

            }
}
