/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.poo;

import com.vn.introjava.poo.interfaces.Desplazable;


/**
 *
 * @author Equipo 4
 */
public abstract class  Vehiculo implements Desplazable {
    
    protected TipoVehiculo tipo;

    public TipoVehiculo getTipo() {
        return tipo;
    }

    
    //METODO DECLARADO E IMPLEMENTADO
    public void setTipo(TipoVehiculo tipo) { //DECLARACION
        this.tipo = tipo; // IMPLEMENTACion
    }
    
    public abstract void avanzar();
    
     public void mostrarEstado(){
     
     
     };
    
    
       
   
    
   
    
    
    
    
    
}
