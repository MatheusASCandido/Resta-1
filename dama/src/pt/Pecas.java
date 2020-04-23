package pt;
//Matheus A. S. Candido - ra241640
//Pedro H. Bueno - ra223402
//classe parte da etapa dama do trabalho
public class Pecas {
	char n;//B e P pecas comuns, b e p damas, - vazio
	   
    void inicializar (char a){//inicializa a peca
        n = a;
    }
   
   
    void mostrar(){//mostra a peca no tabuleiro
        System.out.print(n+" ");
    }
}
