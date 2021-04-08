/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.correcao_solos;

/**
 *
 * @author rick-
 */
public class EquilibrioCorrecaoCTC {
    
    public double calculaSCmol(
            double potassio, 
            double calcio, 
            double magnesio) {
        
        return potassio + calcio + magnesio;
    }

    public double calculaCTCCmol(
            double potassio, 
            double calcio, 
            double magnesio,
            double hidrogenioAluminio) {
    
        return calculaSCmol(potassio, calcio, magnesio) + hidrogenioAluminio;
    }

    public double calculaVPercentual(double Scmol, double CTCcmol) {
        
        if (Scmol > 0 && CTCcmol > 0) {
            return Scmol / CTCcmol * 100;
            
        } else {
            return 0.0;
        }
    }

    public double calculaMOPercentual(double mo) {
        if (mo > 0) {
            return mo / 10;
            
        } else {
            return 0.0;
        }
    }

    public double calculaCarbono(double moPercentual) {
        
        if (moPercentual > 0) {
            return moPercentual / 1.72 * 10;
            
        } else {
            return 0.0;
        }
    }
    
    public double quantidadeFosforoAplicar(double teorAtingir, int fonteFosforo, double fosforoSolo, double eficienciaFosforo){
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
}
