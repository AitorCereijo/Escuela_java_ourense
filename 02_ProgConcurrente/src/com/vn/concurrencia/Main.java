/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.concurrencia;

/**
 *
 * @author Equipo 4
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        HilosSencillos hilo=new HilosSencillos();
      
       hilo.ejecturarHilosRunAB();
        
        long timeIni=System.currentTimeMillis();
        
        hilo.ejecturarHilosRunAB();
        mostrar_tiempo(timeIni,"Run en serie ha tardado: ");
        
   
        hilo.ejecutarHilosAB();
         mostrar_tiempo(timeIni,"Start en paralelo ha tardado: ");*/
        
        
        //EJERCICIO ARRAY DE HILOS
        Array_hilos hilo2=new Array_hilos();
        hilo2.ejecutarHilosArray();
         
    }
    
    static String mostrar_tiempo(long timeInicial,String mensaje){
        
        double tiempoTotal=(double)(System.currentTimeMillis() - timeInicial) / 1000.0;
     
        String mensajeRet=mensaje+tiempoTotal;
        System.out.println(mensajeRet);
        return mensajeRet;
        
    }
  
    
}
