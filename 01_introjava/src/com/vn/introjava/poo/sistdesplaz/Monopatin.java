/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.poo.sistdesplaz;

import com.vn.introjava.poo.interfaces.Desplazable;

/**
 *
 * @author Equipo 4
 */
public class Monopatin implements Desplazable {

    @Override
    public void mover(float metros) {
         System.out.println("El monopatin rueda "+metros+"m!");
    }
    
     public void andar(float metros){
    
        System.out.println("La persona camina "+metros+"m!");
    }
    
    
    
    
}
