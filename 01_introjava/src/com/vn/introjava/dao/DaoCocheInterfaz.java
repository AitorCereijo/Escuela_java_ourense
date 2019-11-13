/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.dao;

import com.vn.introjava.poo.Coche;


/**
 *
 * @author Equipo 4
 */
public interface DaoCocheInterfaz {
    
    
     public void crear(String marca)throws Exception;
   
     public Coche obtenerPorMarca(String marca);
    
     public Coche obtenerPorIndice(int index);
        
     
    }
 
    
        
      
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

