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
public class CocheElectrico extends Coche implements Electrico {

    @Override
    public void cargar(double voltios) {
  
        System.out.println("El coche electrico esta cargando: "+voltios+" voltios");
        
        
        
    }
    @Override
    public void mover(float metros) {
     
        System.out.println("El coche electrico se movio: "+metros+"m!");
        
        
    }
    
}
