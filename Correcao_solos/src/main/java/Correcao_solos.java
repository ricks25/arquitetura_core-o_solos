/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rick-
 */
public class Correcao_solos {
    private static double valorIdealFosforo(int textSolo){
        if (textSolo == 1){
            return 9;
        }else if (textSolo == 2){
            return 12;
        }
        return 0;

    }
    
    private static double valorIdealPotassio(int textSolo){
        if (textSolo == 1){
            return 0.35;
        }else if (textSolo == 2){
            return 0.25;
        }
        return 0;
    }
    
    private static double valorIdealCalcio(int textSolo){
        if (textSolo == 1){
            return 6;
        }else if (textSolo == 2){
            return 4;
        }
        return 0;
    }
    
    private static double valorIdealMagnesio(int textSolo){
        if (textSolo == 1){
            return 1.5;
        }else if (textSolo == 2){
            return 1.0;
        }
        return 0;
    }
    
    private static double valorIdealEnxofre(int textSolo){
        if (textSolo == 1){
            return 9;
        }else if (textSolo == 2){
            return 6;
        }
        return 0;
    }
}
