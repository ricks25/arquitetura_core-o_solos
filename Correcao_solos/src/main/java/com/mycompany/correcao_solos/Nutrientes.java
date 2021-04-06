package com.mycompany.correcao_solos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rick-
 */
public class Nutrientes {
    
    private double fosforo;
    private double potassio;
    private double calcio;
    private double magnesio;
    private double enxofre;
    private double aluminio;
    private double aluminioHidrogenio;
    
    public Nutrientes(int texturaSolo){
        if(texturaSolo == 1){
            this.fosforo = 9.0;
            this.potassio = 0.35;
            this.calcio = 6.0;
            this.magnesio = 1.5;
            this.enxofre = 9.0;
            this.aluminio = 0.0;
            this.aluminioHidrogenio = 0.0; 
        }
        if(texturaSolo == 2){
            this.fosforo = 12.0;
            this.potassio = 0.25;
            this.calcio = 4.0;
            this.magnesio = 1.0;
            this.enxofre = 6.0;
            this.aluminio = 0.0;
            this.aluminioHidrogenio = 0.0; 
        }
    }
    
    public double getFosforo() {
        return fosforo;
    }
    
    public double getPotassio() {
        return potassio;
    }
    
    public double getCalcio() {
        return calcio;
    }
    
    public double getMagnesio() {
        return magnesio;
    }
    
    public double getEnxofre() {
        return enxofre;
    }
    
    public double getAluminio() {
        return aluminio;
    }
    
    public double getAluminioHidrogenio() {
        return aluminioHidrogenio;
    }
}
