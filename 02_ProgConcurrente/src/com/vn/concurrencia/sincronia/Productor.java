/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.concurrencia.sincronia;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc
 */
public class Productor extends Thread{

    private Contenedor contenedor;

    public Productor(Contenedor c) {
        contenedor = c;
    }

    @Override
    public void run() {
      
          //EL DATO PRODIA SER DEL USUARIO,DE LECTURA DE FICHERO...ETC
        for (int i = 10; i >= 0; i--) {
            
            contenedor.put(i*10);
          
            
            
            try {
                Thread.sleep((int)(Math.random()*1000));
            } 
            catch (InterruptedException ex) {
                Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
      
    }
}
