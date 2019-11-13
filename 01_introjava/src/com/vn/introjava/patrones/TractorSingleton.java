/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.patrones;

import com.vn.introjava.poo.Tractor;
import java.util.Random;

/**
 *
 * @author Equipo 4
 */
public class TractorSingleton extends Tractor {
    
    private int numero;
    
    private TractorSingleton(){
    
    
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
    
    public static TractorSingleton tractor;
    
    public static TractorSingleton getInstancia(){
    
    if(TractorSingleton.tractor==null){
        
        TractorSingleton. tractor=new TractorSingleton();
        
        TractorSingleton.tractor.setNumero((new Random()).nextInt());
        
    }
    
   
    return TractorSingleton.tractor;
    }
    
     @Override
   public void mostrarEstado(){
    
    
        System.out.println(tipo+"El coche: "+getNumero());}
}
