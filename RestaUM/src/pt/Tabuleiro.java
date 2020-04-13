package pt;

public class Tabuleiro {
    Pecas tab [][];
   
    void criar_tab(int a) {
        this.tab = new Pecas [a][a];
        for (int i=0; i<7; i++){
            for (int j=0; j<7; j++){
                tab[i][j] = new Pecas();
            }
        }
    }
   
    void fazer_tab(){
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
   
    void mostrar_tab(){
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
   
    void mostrar_tab_inicial(){
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
   
    void comando(String a){
        char b = a.charAt(0);
        char c = a.charAt(1);
        char d = a.charAt(3);
        char e = a.charAt(4);
        int n = 0;
        int m = 0;
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
        int i = Character.getNumericValue(c);
        int j = Character.getNumericValue(e);
       
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




