/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.poo;



/**
 *
 * @author Equipo 4
 */
public class Tractor extends Vehiculo {

    @Override
    public void avanzar() {
        System.out.println("Ruedo y siego");
    }

    @Override
    public String toString() {
        
        return "TIPO: "+tipo.toString();
        
    }
    
}
