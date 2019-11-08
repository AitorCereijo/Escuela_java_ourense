/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.poo;

import com.vn.introjava.poo.interfaces.Desplazable;
import com.vn.introjava.poo.interfaces.Electrico;
import com.vn.introjava.poo.sistdesplaz.Monopatin;

/**
 *
 * @author Equipo 4
 */
public class MonopatinElectrico extends Monopatin implements Electrico {

    @Override
    public void cargar(double voltios) {
       
        System.out.println("El monopatin esta cargando: "+voltios+" voltios");
           
    }

    @Override
    public void mover(float metros) {
       
        System.out.println("El monopatin electrico se movio "+metros+"m!");
        
        
    }
}
