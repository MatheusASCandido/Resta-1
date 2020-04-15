package pt;
//Matheus A. S. Candido - ra241640
//Pedro H. Bueno - ra223402
//classe parte da etapa resta um do trabalho
public class Pecas {//classe de pecas
    String n;//representa a peca sendo "p" para uma peca existente, "-" um espaco vazio no tabuleiro ou " " para um espaco nao existente no tabuleiro
   
    void inicializar (){
        n="p";
    }
    void inicializar2(){
        n=" ";
    }
    void comer (){//transforma o espaco em vazio ou preenchido por uma peca
        if (n=="p"){
            n="-";
        }
        else{
            if (n=="-"){
               n="p";
            }
        }
    }
   
    void mostrar(){//mostra um espaco de peca do tabuleiro
        System.out.print(n+" ");
    }
}
