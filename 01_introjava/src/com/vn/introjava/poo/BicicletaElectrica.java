/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.poo;

import com.vn.introjava.poo.interfaces.Desplazable;
import com.vn.introjava.poo.interfaces.Electrico;

/**
 *
 * @author Equipo 4
 */
public class BicicletaElectrica implements Electrico,Desplazable {

    @Override
    public void cargar(double voltios) {
        
        System.out.println("Bici se carga");
    }

    @Override
    public void mover(float metros) {
        System.out.println("Bici se mueve");
    }
    
    
    
    
    
    
}
