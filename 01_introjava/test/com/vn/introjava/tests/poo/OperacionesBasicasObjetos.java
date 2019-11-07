/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.tests.poo;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import com.vn.introjava.poo.Coche;
import com.vn.introjava.poo.CocheRally;
import com.vn.introjava.poo.FabricaCoches;

/**
 *
 * @author Equipo 4
 */
public class OperacionesBasicasObjetos {
    
 
    @Test
     public void creandoObjetos() {
     Coche micoche=null;
     Coche micoche2=null;
     
     micoche=new Coche();
     micoche2=new Coche();
     
     System.out.println("Texto de coche: "+micoche.toString());
     
     assertNotNull(micoche);
     assertNotNull(micoche2);
      
     assertNotEquals(micoche,micoche2);
     
     micoche.setMarca("Kia");
     micoche2.setMarca("Hammer");
     
        System.out.println("Mi coche es: "+micoche.getMarca());
        System.out.println("Mi coche de los findes es: "+micoche2.getMarca());
     
     
     micoche2=micoche;
     assertEquals(micoche,micoche2);
     
     micoche.setMarca("Hammer Limusina");
     
       System.out.println("Mi coche es: "+micoche.getMarca());
       System.out.println("Mi coche de los findes es: "+micoche2.getMarca());
     
       
       
       //INTRO POLIMORFISMO
       
        Object refAmiCoche=micoche;
        
        System.out.println(refAmiCoche.toString());
        assertTrue(refAmiCoche.equals(micoche));
       
        /*OTRO COCHE
        Coche coche3=new Coche();
        Object referencia_coche = new Object();
        
        coche3=(Coche)referencia_coche;
       
        System.out.println(coche3.toString());*/
        
        

     }
      @Test
     public void probandoCoches() {
         
      Coche micoche=null;
      micoche=new Coche();
    
    
        for(int i=0;i<6;i++){
            
            micoche.arrancar(i);
       
       if(i==4){
           
            assertTrue(micoche.isArrancado());
       
       }
       else{
       
            assertFalse(micoche.isArrancado());
       
       }
      
     
        }
     
        micoche.arrancar("arrancar");
        assertTrue(micoche.isArrancado());
        
        micoche.mostrarEstado();
        
        
     
     }
      @Test 
     public void gestionExcepciones() throws Exception{
     
     Coche c=FabricaCoches.crear("Una marca");   
     
     }
     
     /* @Test Falla porque no recibe la excepcion
     public void gestionExcepciones_2() throws Exception{
         
     try{
     Coche c=FabricaCoches.crear("");   }
     catch(Exception ex){
     Logger.getLogger(OperacionesBasicasObjetos.class, timeout=100);
     assertTrue(ex instanceof IllegalArgumentException);
     }
     
     
     
     }
      */
       
}
