package pt;
//Matheus A. S. Candido - ra241640
//Pedro H. Bueno - ra223402
//classe parte da etapa dama do trabalho
public class Tabuleiro {
	Pecas tab [][];//uma matriz de objetos do tipo pecas
	   
    void criar_tab(int a) {//cria os objetos na matriz
        this.tab = new Pecas [a][a];
        for (int i=0; i<8; i++){
            for (int j=0; j<8; j++){
                tab[i][j] = new Pecas();
            }
        }
    }
    void fazer_tab() {//inicializa os objetos
    	for(int i=0; i<3;i++) {
    		for(int j=0; j<8;j++) {
    			if(i==0 || i==2) {
    				if((j+1)%2==0) {
    					tab[i][j].inicializar('P');
    				}
    				else {
    					tab[i][j].inicializar('-');
    				}
    			}
    			else {
    				if((j+1)%2==0) {
    				tab[i][j].inicializar('-');
    				}
    				else {
    					tab[i][j].inicializar('P');
    				}
    			}
    		}
    	}
    	for(int i=3; i<5; i++) {
    		for(int j=0; j<8;j++) {
    			tab[i][j].inicializar('-');
    		}
    	}
    	for(int i=5; i<8; i++) {
    		for(int j=0; j<8; j++) {
    			if(i==5 || i==7) {
    				if((j+1)%2==0) {
    					tab[i][j].inicializar('-');
    				}
    				else {
    					tab[i][j].inicializar('B');
    				}
    			}
    			else {
    				if((j+1)%2==0) {
    					tab[i][j].inicializar('B');
    				}
    				else {
    					tab[i][j].inicializar('-');
    				}
    			}
    		}
    	}
    	
    }
    void mostrar_tab(){//mostra o tabuleiro depois de cada comando
        for (int i=0; i<8; i++){
            System.out.print((8-i)+" ");
            for (int j=0; j<8; j++){
                tab[i][j].mostrar();
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
        System.out.println();
    }
   
    void mostrar_tab_inicial(){//mostra o tabuleiro inicial
        System.out.println("Tabuleiro inicial:");
        for (int i=0; i<8; i++){
            System.out.print((8-i)+" ");
            for (int j=0; j<8; j++){
                tab[i][j].mostrar();
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
        System.out.println();
    }
    
    void comando(String a) {//executa o comando x0:x0, x representa letras e 0 numeros
    	char b = a.charAt(0);//transforma a letra de inicio em um caracter
        char c = a.charAt(1);//transforma o numero de inicio em um caracter
        char d = a.charAt(3);//transforma a letra de destino em um caracter
        char e = a.charAt(4);//transforma o numero de destino em um caracter
        int n = 0;
        int m = 0;
        int meio_x=0;
        int meio_y=0;
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
        if(b == 'h') {
        	n=7;
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
        if(d== 'h') {
        	m=7;
        }
        //transforma o caracater numerico do comando em um numero referente a matriz
        int i = Character.getNumericValue(c);
        int j = Character.getNumericValue(e);
        //faz o movimento do comando
        if(tab[8-i][n].n=='B') {//peca branca comum
        	tab[8-i][n].n='-';
        	if(8-j==0) {
        		tab[8-j][m].n='b';
        	}
        	else {
        		tab[8-j][m].n='B';
        	}
        	if(m-n==2 || m-n==-2) {
        		meio_x= (m+n)/2;
        		meio_y= (8-(i+j)/2);
        		tab[meio_y][meio_x].n = '-';
        	}	
        }
        if(tab[8-i][n].n=='P') {//peca preta comum
        	tab[8-i][n].n='-';
        	if(8-j==7) {
        		tab[8-j][m].n='p';
        	}
        	else {
        		tab[8-j][m].n='P';
        	}
        	if(m-n==2 || m-n==-2) {
        		meio_x= (m+n)/2;
        		meio_y= (8-(i+j)/2);
        		tab[meio_y][meio_x].n = '-';
        	}	
        }
        
        if(tab[8-i][n].n=='b') {//peca dama branca
        	tab[8-i][n].n = '-';
        	tab[8-j][m].n = 'b';
        	if(n<m) {
        		if((8-i)>(8-j)) {
        			int contar=1;
        			while(n+contar!=m) {
        				if(tab[8-i-contar][n+contar].n == 'P' || tab[8-i-contar][n+contar].n == 'p') {
        					tab[8-i-contar][n+contar].n = '-';
        	        	}
        				contar++;
        			}
        		}
        		else if((8-i)<(8-j)) {
        			int contar=1;
        			while(n+contar!=m) {
        				if(tab[8-i+contar][n+contar].n == 'P' || tab[8-i+contar][n+contar].n == 'p') {
        					tab[8-i+contar][n+contar].n = '-';
        	        	}
        				contar++;
        			}
        		}
        	}
        	if(n>m) {
        		if((8-i)>(8-j)) {
        			int contar=1;
        			while(n-contar!=m) {
        				if(tab[8-i-contar][n-contar].n == 'P' || tab[8-i-contar][n-contar].n == 'p') {
        					tab[8-i-contar][n-contar].n = '-';
        	        	}
        				contar++;
        			}
        		}
        		else if((8-i)<(8-j)) {
        			int contar=1;
        			while(n-contar!=m) {
        				if(tab[8-i+contar][n-contar].n == 'P' || tab[8-i+contar][n-contar].n == 'p') {
        					tab[8-i+contar][n-contar].n = '-';
        	        	}
        				contar++;
        			}
        		}
        	}
        }
        
        if(tab[8-i][n].n=='p') {//peca dama preta
        	tab[8-i][n].n = '-';
        	tab[8-j][m].n = 'p';
        	if(n<m) {
        		if((8-i)>(8-j)) {
        			int contar=1;
        			while(n+contar!=m) {
        				if(tab[8-i-contar][n+contar].n == 'B' || tab[8-i-contar][n+contar].n == 'b') {
        					tab[8-i-contar][n+contar].n = '-';
        	        	}
        				contar++;
        			}
        		}
        		else if((8-i)<(8-j)) {
        			int contar=1;
        			while(n+contar!=m) {
        				if(tab[8-i+contar][n+contar].n == 'B' || tab[8-i+contar][n+contar].n == 'b') {
        					tab[8-i+contar][n+contar].n = '-';
        	        	}
        				contar++;
        			}
        		}
        	}
        	if(n>m) {
        		if((8-i)>(8-j)) {
        			int contar=1;
        			while(n-contar!=m) {
        				if(tab[8-i-contar][n-contar].n == 'B' || tab[8-i-contar][n-contar].n == 'b') {
        					tab[8-i-contar][n-contar].n = '-';
        	        	}
        				contar++;
        			}
        		}
        		else if((8-i)<(8-j)) {
        			int contar=1;
        			while(n-contar!=m) {
        				if(tab[8-i+contar][n-contar].n == 'B' || tab[8-i+contar][n-contar].n == 'b') {
        					tab[8-i+contar][n-contar].n = '-';
        	        	}
        				contar++;
        			}
        		}
        	}
        }
        
        
        System.out.println("Source: "+b+c);
        System.out.println("Target: "+d+e);
        mostrar_tab();
        
    }
}
