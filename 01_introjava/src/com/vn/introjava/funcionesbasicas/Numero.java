/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.funcionesbasicas;

/**
 *
 * @author Equipo 4
 */
public class Numero {
    
     public static void queNumeroEs(){
    
    int p=2;
        
        switch(p){
            
            case 1:System.out.println("El numero es " );
            break;
            
            case 2:System.out.println("El numero es 2, 3 o 4." );
            case 3:
            case 4:
            break;
            
            default: System.out.println("Predeterminado");
            
        }
       
    }
    
    
}
