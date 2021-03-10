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
    private static float valorIdealFosforo(int textSolo){
        float r = 0;
        if (textSolo == 1){
            r = 9;
        }else if (textSolo == 2){
            r = 12;
        }
        return r;
    }
    
    private static float valorIdealPotassio(int textSolo){
        float r = 0;
        if (textSolo == 1){
            r = 0.35f;
        }else if (textSolo == 2){
            r = 0.25f;
        }
        return r;
    }
    
    private static float valorIdealCalcio(int textSolo){
        float r = 0;
        if (textSolo == 1){
            r = 6;
        }else if (textSolo == 2){
            r = 4;
        }
        return r;
    }
    
    private static float valorIdealMagnesio(int textSolo){
        float r = 0;
        if (textSolo == 1){
            r = 1.5f;
        }else if (textSolo == 2){
            r = 1.0f;
        }
        return r;
    }
    
    private static float valorIdealEnxofre(int textSolo){
        float r = 0;
        if (textSolo == 1){
            r = 9;
        }else if (textSolo == 2){
            r = 6;
        }
        return r;
    }
}
