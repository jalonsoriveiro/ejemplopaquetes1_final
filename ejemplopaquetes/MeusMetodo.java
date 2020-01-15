/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meusmetodos;

import java.util.Scanner;

/**
 *
 * @author jalonsoriveiro
 */
public class MeusMetodo {

    public static float validaFloatPositivo(){
        Scanner sc = new Scanner(System.in);
        float valor;
        do{
         valor = sc.nextFloat();        
        }while(valor<=0);
        return valor;
    }
    
    
}
