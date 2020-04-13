package pt;

public class Pecas {
    String n;
   
    void inicializar (){
        n="p";
    }
    void inicializar2(){
        n=" ";
    }
    void comer (){
        if (n=="p"){
            n="-";
        }
        else{
            if (n=="-"){
               n="p";
            }
        }
    }
   
    void mostrar(){
        System.out.print(n+" ");
    }
}