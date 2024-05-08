/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fatec.testes;

import br.com.fatec.persistencia.Arquivo;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author nicol
 */

/*neste exemplo eu pegamos um arquivo nomes.txt com nomes, lemos e gravamos os nomes em outro arquivo q foi criado como nomes.txt2 */
public class TesteLeituraGravacao {
    public static void main(String[] args) throws IOException {
        String arquivoLido = "C:\\Users\\nicol\\OneDrive\\Documentos\\NetBeansProjects\\ProjetoArquivo\\src\\txt\\nomes.txt";
        ArrayList<String> ListaNomes = new ArrayList();
        
        Arquivo.importar(arquivoLido, ListaNomes);
        
        String arquivoGravado = "C:\\Users\\nicol\\OneDrive\\Documentos\\NetBeansProjects\\ProjetoArquivo\\src\\txt\\nomes2.txt";
        Arquivo.gravar(ListaNomes, arquivoGravado);
    }
        
    
}
