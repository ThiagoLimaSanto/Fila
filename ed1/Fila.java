package com.mycompany.ed1;

public class Fila {
    int tamanho;
    int[] elementos;
    int inicio;
    int fim;
    int quantidade;
    
    
    public Fila(int fila){
        tamanho = fila;
        inicio = 0;
        fim = -1;
        quantidade = 0;
        elementos = new int[fila];
    }
    
    public void destruirFila(){
        elementos = null;
    }
    
    public boolean filaCheia(){
        if(quantidade == tamanho){
            return true;
        }
        return false;
    }
    
    public boolean filaVazia(){
        if(fim == -1){
            return true;
        }
        return false;
    }
    
    public void inserirElemento(int elemento){
        if(filaCheia()){
            System.out.println("a  fila esta cheia!");
            
        }else{
            fim = (fim+1)%tamanho;
            elementos[fim] = elemento;
            quantidade++;
        }
    }
    
    public int removerElemento(){
        if(filaVazia()){
            System.out.println("A fila esta vazia!");
            return -1;
        }else{
            int removerElemento = elementos[inicio];
            
            inicio = (inicio + 1)%tamanho;
            quantidade--;
            return removerElemento;
        }
    }
    
    public int localiazrPosicao(int elemento){
        int posicao = -1;
        for(int i = inicio; i < tamanho; i++){
            if(elementos[i] == elemento){
                posicao = i;
                break;
            }
        }
        return posicao;
    }
}
