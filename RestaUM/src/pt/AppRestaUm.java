package pt;

public class AppRestaUm {

	public static void main(String[] args) {
		
		//iniciando a classe CSVReader e criando um vetor de comandos
		CSVReader csv= new CSVReader();
		csv.setDataSource("https://github.com/MatheusASCandido/Resta-1/edit/master/RestaUM/src/pt/arq001.csv");
		String commands [] = csv.requestCommands();
		
		//criando o tabuleiro
		Tabuleiro resta = new Tabuleiro();
		resta.criar_tab(7);
		resta.fazer_tab();
		resta.mostrar_tab_inicial();
		
		//executando os comandos
		for(int i=0;i<commands.length;i++) {
			resta.comando(commands[i]);
		}

		
	}

}
