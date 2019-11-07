/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.main;

import static com.vn.introjava.funcionesbasicas.Ordenamiento.ordenarArray;//METODO IMPORTADO
import java.util.logging.Level;
import java.util.logging.Logger;
import com.vn.introjava.poo.Coche;
import com.vn.introjava.poo.FabricaCoches;

/**
 *
 * @author Equipo 4
 */

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ordenarArray();
         
         try{
        
    Coche c=FabricaCoches.crear("Seat");
    c.mostrarEstado();
    c = FabricaCoches.crear(null);
    c.mostrarEstado();}
    
    catch(Exception ex){
    
    Logger.getLogger(main.class.getName()).log(Level.SEVERE,null,ex);
    
    }
         
         /*
        Operadores.probarOperadores();
        Numero.queNumeroEs();
       

        
        System.out.println("Suma y mult: (5+5)*2= "+ (5+5)*2 );
        
        System.out.println("Division: "+ (float)10/3);
        
        System.out.println("Casting: "+(float)3.3434343434);
         
        System.out.println("Resto: "+ 10%3);
        
        //Operador byte a byte
        //00010101 = 21
        //00000111 =7
        //00000101 AND
        
        System.out.println("Op. binario 21 AND 5 = "+(21 & 7));
        */
        
       
       
       }
        
        
          
    }
    
   
        
   

 


