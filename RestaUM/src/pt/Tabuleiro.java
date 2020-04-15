package pt;
//Matheus A. S. Candido - ra241640
//Pedro H. Bueno - ra223402
//classe parte da etapa resta um do trabalho
public class Tabuleiro {
    Pecas tab [][];//uma matriz de objetos do tipo pecas
   
    void criar_tab(int a) {//cria os objetos na matriz
        this.tab = new Pecas [a][a];
        for (int i=0; i<7; i++){
            for (int j=0; j<7; j++){
                tab[i][j] = new Pecas();
            }
        }
    }
   
    void fazer_tab(){//inicializa os objetos
        for (int i=0; i<2; i++){
            for (int j=0; j<7; j++){
                if (j>1 && j<5){
                    tab[i][j].inicializar();
                }
                else{
                    tab[i][j].inicializar2();
                }
            }
        }
            for (int i=2; i<5; i++){
                for (int j=0; j<7; j++){
                    tab[i][j].inicializar();
                }
            }
        for (int i=5; i<7; i++){
            for (int j=0; j<7; j++){
                if (j>1 && j<5){
                    tab[i][j].inicializar();
                }
                else{
                    tab[i][j].inicializar2();
                }
            }
        }
        tab[3][3].comer();
    }
   
    void mostrar_tab(){//mostra o tabuleiro apos cada movimento
        for (int i=0; i<7; i++){
            System.out.print((7-i)+" ");
            for (int j=0; j<7; j++){
                tab[i][j].mostrar();
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g");
        System.out.println();
    }
   
    void mostrar_tab_inicial(){//mostra o tabuleiro no inicio
        System.out.println("Tabuleiro inicial:");
        for (int i=0; i<7; i++){
            System.out.print((7-i)+" ");
            for (int j=0; j<7; j++){
                tab[i][j].mostrar();
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g");
        System.out.println();
    }
   
    void comando(String a){//executa o comando x0:x0, x representa letras e 0 numeros
        char b = a.charAt(0);//tranforma a letra de inicio em um caracter
        char c = a.charAt(1);// transforma o numero de inicio em um caracter
        char d = a.charAt(3);// transforma a letra de destino em um caracter
        char e = a.charAt(4);// transforma o numero de destino em um caracter
        int n = 0;
        int m = 0;
        //transforma as letras de inicio e destino em um numero referente a matriz que representa o tabuleiro
        if (b == 'a'){
            n=0;
        }
        if (b == 'b'){
            n=1;
        }
        if (b == 'c'){
            n=2;
        }
        if (b == 'd'){
            n=3;
        }
        if (b == 'e'){
            n=4;
        }
        if (b == 'f'){
            n=5;
        }
        if (b == 'g'){
            n=6;
        }
       
        if (d == 'a'){
            m=0;
        }
        if (d == 'b'){
            m=1;
        }
        if (d == 'c'){
            m=2;
        }
        if (d == 'd'){
            m=3;
        }
        if (d == 'e'){
            m=4;
        }
        if (d == 'f'){
            m=5;
        }
        if (d == 'g'){
            m=6;
        }
        //transforma o caracter numerico do comando em um numero referente a matriz
        int i = Character.getNumericValue(c);
        int j = Character.getNumericValue(e);
       //faz o movimento do comando
        tab[7-(i)][n].comer();
        tab[7-(j)][m].comer();
        int meio=0;
        if (n==m){
            meio = 7-((i+j)/2);
            tab[meio][m].comer();
        }
        else{
            meio = (m+n)/2;
            tab[i-1][meio].comer();
        }
        System.out.println("Source: "+b+c);
        System.out.println("Target: "+d+e);
        mostrar_tab();
    }
}




