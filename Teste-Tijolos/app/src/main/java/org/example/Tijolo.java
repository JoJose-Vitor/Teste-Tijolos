package org.example;

import java.util.Random;

public class Tijolo {
    private int id;
    private String cor;
    private String furos;

    public static String escolherCor(){
        Random corAleatoria = new Random();
        boolean escolheCor = corAleatoria.nextBoolean();
        String corEscolhida;
        if(escolheCor){
            corEscolhida = "branco";
        }else{
            corEscolhida = "preto";
        }
        return corEscolhida;
    }

    public String imprimirPropriedades(){
        return (
            "Id do Tijolo: " + this.id + "\n" +
            "Cor do Tijolo: " + this.cor + "\n" +
            "Número de furos no Tijolo: " + this.furos);
    }

    public static boolean parOuImpar(int parOuImpar){
        if((parOuImpar % 2) == 0){
            return true;
        }else{
            return false;
        }
    }

    public static int escolherFuros(){
        Random quantosFuros = new Random();
        int escolheFuros = quantosFuros.nextInt(1, 8);
        return escolheFuros;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFuros() {
        return furos;
    }

    public void setFuros(String furos) {
        this.furos = furos;
    }
}