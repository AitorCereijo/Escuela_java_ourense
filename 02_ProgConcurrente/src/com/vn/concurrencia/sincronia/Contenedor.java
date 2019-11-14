package com.vn.concurrencia.sincronia;

//EL SISTEMA DE BLOQUE LO TIENE QUE GESTIONAR EL RECURSO COMPARTIDO

import java.util.logging.Level;
import java.util.logging.Logger;

public class Contenedor {
    // Normalmente será un array, lista, bb.dd., 
    // mapa, fichero, DAO, servicio web, cualquier recurso compartido...

    int dato;
    //CREAR UN SEMAFORO:EN FALSE NO SE PUEDE USAR Y EN TRUE SI
    boolean hayDato = false;

    public synchronized int get() {

        while (hayDato == false) {
              //ESPERAMOS A QUE SE PRODUZCA
            try {
        
            this.wait();
            
            } 
            catch (InterruptedException ex) {
                Logger.getLogger(Contenedor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        System.out.println("Consumidor. GET: " + dato);
        hayDato = false; //MARCAMOS PARA BLOQUEAR EL RECURSO
        this.notifyAll();
        return dato;  //DEVOLVER EL DATO
      
    }

    public synchronized void  put(int valor) {
        
        while (hayDato == true) {   
            //ESPERAR A QUE ALGUIEN CONSUMA
            try {
            
            this.wait();
            } 
            catch (InterruptedException ex) {
                Logger.getLogger(Contenedor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
         dato = valor;  //ALMACENAR EL DATO
         hayDato = true; //MARCAMOS PARA DESBLOQUEAR/LIBERAR EL RECURSO  
         System.out.println("Productor. PUT: " + dato);
         this.notifyAll();
       
    }
}
