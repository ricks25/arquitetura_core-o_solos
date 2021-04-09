package com.mycompany.correcao_solos;

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
                return (((x * 2) * 2.29) * 100 / eficienciaFosforo / 100) * 100 / 18;
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
        return (custoTonelada * (quantidadeFosforoAplicar() * 2.42) / 1000) / 2.42; 
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
        return enxofre;
    }
}
