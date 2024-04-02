package com.mycompany.ed1;

public class Ed1 {

    public static void main(String[] args) {
        Fila fila = new Fila(10);
        
        fila.inserirElemento(100);

        

        int posicao = fila.localiazrPosicao(100);
        if (posicao != -1) {
            System.out.println("elemneto foi encontrado na fila!");
        } else {
            System.out.println("nao existe esse elemento na fila!");
        }
       
    }
}