package Futebol;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) throws IOException {
		int opcao;
		//dois times que serão importados de arquivo ou automáticos
		Time time1 = new Time();
		Time time2 = new Time();
		Time T = new Time(); //obj so pra usar os metodos
		Jogador J = new Jogador();
		ArrayList<Jogador> ListaJogadores = new ArrayList<Jogador>();

		
		do {
			opcao=Integer.parseInt(JOptionPane.showInputDialog(
					"::: Escolha uma das opções ::: "
					+ " \n[1] Cadastrar time"
					+ " \n[2] Listar time"	
					+ " \n[3] Sofrer lesão "
					+ " \n[4] Executar treinamento"
					+ "	\n[5] Relacionar Jogadores"
					+ "	\n[6] Gerar Resultado"
					+ "	\n[7] sair"));
		
			switch(opcao) {
			
			case 1:
				
				int tipoCadastro = 0;
				tipoCadastro=Integer.parseInt(JOptionPane.showInputDialog("::: Escolha uma das opções ::: \n[1] Automático \n[2] Arquivo \n[3] Sair"));
				
				switch(tipoCadastro) {
					case 1:
						T.cadastrarTimeAutomatico(time1, time2);
						break;
					
					case 2: /*POR ARQUIVO*/
						T.cadastrarTimeArquivo(time1, time2);
						break;
					}
				break;	
				
			case 2:
				int tipoListagem=0;
				tipoListagem=Integer.parseInt(JOptionPane.showInputDialog("::: Escolha uma das opções ::: \n[1] Console \n[2] Arquivo.txt \n[3] Sair"));
				
				switch(tipoListagem) {
					case 1:
					T.listagemConsole(time1, time2);
					break;
					
					
					case 2: /*POR ARQUIVO */
					T.listagemArquivo(time1, time2);
					break;
					}
		
				break;
				
			case 3:
				J.sofrerLesao(time1, time2);
				break;

			case 4:
				J.executarTreinamento(time1, time2);
				break;
			case 5:
				
				break;
			case 6:
				int quantidade;
				quantidade=Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de cartões: "));
				J.aplicarCartao(ListaJogadores, quantidade);
				break;
			
			case 7:
				J.cumprirSuspensao(ListaJogadores);
				break;
			
			case 8:
				//T.relacionarJogadores(ListaJogadores);
		
			}
		}while(opcao!=9);
		JOptionPane.showMessageDialog(null, "Saindo");
	}

}
