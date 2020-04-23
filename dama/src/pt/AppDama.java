package pt;
//Matheus A. S. Candido - ra241640
//Pedro H Bueno - ra223402
//apliicacao da etapa dama do trabalho
public class AppDama {

	public static void main(String[] args) {
		//iniciando a classe CSVReader e criando um vetor de comandos
				CSVReader csv= new CSVReader();
				csv.setDataSource("C:\\Users\\Matheus Cândido\\Documents\\UNICAMP\\MC322\\Dama\\teste.csv");//endereco do arq csv
				String commands [] = csv.requestCommands();
				
				//criando o tabuleiro
				Tabuleiro dama = new Tabuleiro();
				dama.criar_tab(8);
				dama.fazer_tab();
				dama.mostrar_tab_inicial();
				
				//executando os comandos
				for(int i=0;i<commands.length;i++) {
					dama.comando(commands[i]);
				}
				
				
	}

}
