package com.mycompany.correcao_solos;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CorrecaoFosforo {
    private double teorAtingir;
    private int fonteFosforo;
    private double fosforoSolo;
    private double eficienciaFosforo;
    private double custoTonelada;
    
    public CorrecaoFosforo(double teorAtingir, int fonteFosforo, double fosforoSolo, double eficienciaFosforo, double custoTonelada){
        this.teorAtingir = teorAtingir;
        this.fonteFosforo = fonteFosforo;
        this.fosforoSolo = fosforoSolo;
        this.eficienciaFosforo = eficienciaFosforo;
        this.custoTonelada = custoTonelada;
    }
    
    public double quantidadeFosforoAplicar(){
        double x;
        if(teorAtingir - fosforoSolo < 0){
            x = 0.0;
        }else{
            x = teorAtingir - fosforoSolo;
        }
        switch(fonteFosforo) {
            case 1:
                return Math.round(((((x * 2) * 2.29) * 100 / eficienciaFosforo / 100) * 100 / 18) * 100.0) / 100.0;
            case 2:
                return (((x * 2) * 2.29) * 100 / eficienciaFosforo / 100) * 100 / 41;
            case 3:
                return (((x * 2) * 2.29) * 100 / eficienciaFosforo / 100) * 100 / 48;
            case 4:
                return (((x * 2) * 2.29) * 100 / eficienciaFosforo / 100) * 100 / 45;
            case 5:
                return (((x * 2) * 2.29) * 100 / eficienciaFosforo / 100) * 100 / 18;
            case 6:
                return (((x * 2) * 2.29) * 100 / eficienciaFosforo / 100) * 100 / 33;
            case 7:
                return (((x * 2) * 2.29) * 100 / eficienciaFosforo / 100) * 100 / 29;
            case 8:
                return (((x * 2) * 2.29) * 100 / eficienciaFosforo / 100) * 100 / 32;
            case 9:
                return (((x * 2) * 2.29) * 100 / eficienciaFosforo / 100) * 100 / 24;
            case 10:
                return (((x * 2) * 2.29) * 100 / eficienciaFosforo / 100) * 100 / 18.5;
            case 11:
                return (((x * 2) * 2.29) * 100 / eficienciaFosforo / 100) * 100 / 52;
            case 12:
                return (((x * 2) * 2.29) * 100 / eficienciaFosforo / 100) * 100 / 18;
            default:
                return 0.0;
        }
    }
    
    public double calculaCusto() {
        BigDecimal bd = new BigDecimal((custoTonelada * (quantidadeFosforoAplicar() * 2.42) / 1000) / 2.42).setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue(); 
    }
    
    public double quantidadeEnxofre() {
        double enxofre = 0.0;
        if(fonteFosforo == 5){
            enxofre = (quantidadeFosforoAplicar() * 2.42) * 0.15;
        }else{
            if(fonteFosforo == 1){
                enxofre = ((quantidadeFosforoAplicar() * 2.42) * 0.1) / 2.42;
            }else if(fonteFosforo == 12){
                enxofre = ((quantidadeFosforoAplicar() * 2.42) * 0.11) / 2.42;
            }
        }
        BigDecimal bd = new BigDecimal(enxofre).setScale(1, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
    
    public double quantidadeCalcio() {
        double calcio;
        switch(fonteFosforo) {
            case 1:
                calcio = (((quantidadeFosforoAplicar() * 2.42)* 0.28) / 2.42);
                break;
            case 2:
                calcio = (((quantidadeFosforoAplicar() * 2.42)* 0.2) / 2.42);
                break;
            case 3:
                calcio = (((quantidadeFosforoAplicar() * 2.42)* 0.09) / 2.42);
                break;
            case 4:
                calcio = (((quantidadeFosforoAplicar() * 2.42)* 0.16) / 2.42);
                break;
            case 5:
                calcio = (((quantidadeFosforoAplicar() * 2.42)* 0.28) / 2.42);
                break;
            case 6:
                calcio = (((quantidadeFosforoAplicar() * 2.42)* 0.52) / 2.42);
                break;
            case 7:
                calcio = (((quantidadeFosforoAplicar() * 2.42)* 0.52) / 2.42);
                break;
            case 8:
                calcio = (((quantidadeFosforoAplicar() * 2.42)* 0.45) / 2.42);
                break;
            case 9:
                calcio = (((quantidadeFosforoAplicar() * 2.42)* 0.28) / 2.42);
                break;
            case 10:
                calcio = (((quantidadeFosforoAplicar() * 2.42)* 0.44) / 2.42);
                break;
            case 11:
                calcio = (((quantidadeFosforoAplicar() * 2.42)* 0) / 2.42);
                break;
            case 12:
                calcio = (((quantidadeFosforoAplicar() * 2.42)* 0.18) / 2.42);
                break;
            default:
                calcio = 0.0;
        }
        BigDecimal bd = new BigDecimal(calcio).setScale(1, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
