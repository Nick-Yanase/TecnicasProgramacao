/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fatec.testes01;

import br.com.fatec.model01.Contato;
import br.com.fatec.persistencia01.Arquivo;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author nicol
 */
public class TesteLeituraGravacao {
    public static void main(String[] args) throws IOException {
        String arquivoLido = "C:\\Users\\nicol\\OneDrive\\Documentos\\NetBeansProjects\\ProjetoArquivo_1\\src\\txt01\\contatos.txt";
        ArrayList<Contato> ListaContatos = new ArrayList();
        
        Arquivo.importar(arquivoLido, ListaContatos);//leu o arquivo contatos.txt, pegou cada linha e jogou cada linha no atributo do contato e armazenou o contato num arrayList
        
        String arquivoGravado = "C:\\Users\\nicol\\OneDrive\\Documentos\\NetBeansProjects\\ProjetoArquivo_1\\src\\txt01\\novosContatos.txt";
        Arquivo.gravar(ListaContatos, arquivoGravado);
    }
        
    
}
