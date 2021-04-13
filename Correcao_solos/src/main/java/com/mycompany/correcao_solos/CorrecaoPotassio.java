package com.mycompany.correcao_solos;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CorrecaoPotassio {
    private double potassioSolo, magnesioSolo, calcioSolo, hidrogenioAluminioSolo, potassioDesejado, custoTonelada;
    private int fontePotassio;
    
    public CorrecaoPotassio(double potassioSolo, double magnesioSolo, double calcioSolo, double hidrogenioAluminioSolo, double potassioDesejado, int fontePotassio, double custoTonelada) {
        this.potassioSolo = potassioSolo;
        this.magnesioSolo = magnesioSolo;
        this.calcioSolo = calcioSolo;
        this.hidrogenioAluminioSolo = hidrogenioAluminioSolo;
        this.potassioDesejado = potassioDesejado;
        this.fontePotassio = fontePotassio;
        this.custoTonelada = custoTonelada;
    }
    
    public double quantidadePotassioAplicar() {
        double potassioAdicionar, potassio;
        if((potassioSolo * potassioDesejado / (potassioSolo / (potassioSolo + calcioSolo + magnesioSolo + hidrogenioAluminioSolo) * 100)) - potassioSolo > 0){
            potassioAdicionar = (potassioSolo * potassioDesejado / (potassioSolo / (potassioSolo + calcioSolo + magnesioSolo + hidrogenioAluminioSolo) * 100)) - potassioSolo;
        }else{
            potassioAdicionar = 0.0;
        }
        switch(fontePotassio) {
            case 1:
                potassio = ((((potassioAdicionar * 39.1 * 10) * 2) * 1.2) * 100 / 0.85 / 100) * 100 / 58;
                break;
            case 2:
                potassio = ((((potassioAdicionar * 39.1 * 10) * 2) * 1.2) * 100 / 0.85 / 100) * 100 / 52;
                break;
            case 3:
                potassio = ((((potassioAdicionar * 39.1 * 10) * 2) * 1.2) * 100 / 0.85 / 100) * 100 / 22;
                break;
            case 4:
                potassio = ((((potassioAdicionar * 39.1 * 10) * 2) * 1.2) * 100 / 0.85 / 100) * 100 / 44;
                break;
            default:
                return 0.0;
        }
        BigDecimal bd = new BigDecimal(potassio).setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
    
    public double calculaCusto() {
        BigDecimal bd = new BigDecimal((custoTonelada * quantidadePotassioAplicar() * 2.42 / 1000) / 2.42).setScale(2, RoundingMode.HALF_DOWN);
        return bd.doubleValue(); 
    }
}
