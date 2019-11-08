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
public class Avion implements Desplazable {

    @Override
        public void mover(float metros) {
        volar(metros);
    }
        
        public void rodar(float metros) {
        System.out.println("El avion vuela a "+metros+"m!");
    }
        
        public void volar(float metros) {
        System.out.println("Avion rueda para despegar "+metros+"m!");
    }
    
}
