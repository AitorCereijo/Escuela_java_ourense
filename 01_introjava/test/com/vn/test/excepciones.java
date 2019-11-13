/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.test;

import com.vn.introjava.excepciones.UsoNormalExcepciones;
import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Equipo 4
 */
public class excepciones {
    
    public excepciones() {
    }
    
  
    @Test
    public void gestionarExcepcion() {
    try{
    UsoNormalExcepciones obj=new UsoNormalExcepciones();
    
    obj.metodoPeligroso();}
    
    catch(ArrayIndexOutOfBoundsException excepcion){
        System.out.println("Excepcion "+excepcion.getMessage());
        
        System.out.println("\n Pila de llamadas "+ Arrays.toString(excepcion.getStackTrace()));
    
    }
    
    
    
    
    
    
    
        
    
    }
}
