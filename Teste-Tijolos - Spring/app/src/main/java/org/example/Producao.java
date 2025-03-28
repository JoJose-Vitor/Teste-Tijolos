package org.example;

import java.util.ArrayList;
import java.util.List;

public class Producao {

    private List<Tijolo> tijolos = new ArrayList<>();
    private int pretosPares = 0;
    private int brancosPares = 0;
    private int pretos = 0;
    private int brancos = 0;

    public List<Tijolo> getTijolos() {
        return tijolos;
    }

    public void setTijolos(List<Tijolo> tijolos) {
        this.tijolos = tijolos;
    }

    public void produzirTijolos() throws Exception{

        for(int i = 0; i < 100; i++){

            tijolos.add(new Tijolo());

            tijolos.get(i).setId(i + 1);

            tijolos.get(i).setCor(Tijolo.escolherCor());

            tijolos.get(i).setFuros(Integer.toString(Tijolo.escolherFuros()));

            boolean ehPar = Tijolo.parOuImpar(Integer.parseInt(tijolos.get(i).getFuros()));

            if(tijolos.get(i).getCor() == "preto"){
                pretos ++;
                if(ehPar){
                    pretosPares ++;
                }
            }

            if(tijolos.get(i).getCor() == "branco"){
                brancos ++;
                if(ehPar){
                    brancosPares ++;
                }
            }

            Thread.sleep(50);
        }
    }

    public String relatorioFurosECores(){
        return (
            "O numero de tijolos pretos com furos pares é: " + pretosPares + "\n" +
            "O numero de tijolos pretos com furos impares é: " + (pretos - pretosPares) + "\n" +
            "O numero de tijolos brancos com furos pares é: " + brancosPares + "\n" +
            "O numero de tijolos brancos com furos impares é: " + (brancos - brancosPares) + "\n" +
            "O numero de tijolos pretos é: " + pretos + "\n" +
            "O numero de tijolos brancos é: " + brancos);
    }
}
