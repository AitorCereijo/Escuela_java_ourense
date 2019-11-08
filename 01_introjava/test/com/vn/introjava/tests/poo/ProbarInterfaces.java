/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.tests.poo;

import com.vn.introjava.poo.Coche;
import com.vn.introjava.poo.CocheElectrico;
import com.vn.introjava.poo.CocheRally;
import com.vn.introjava.poo.MonopatinElectrico;
import com.vn.introjava.poo.Vehiculo;
import com.vn.introjava.poo.interfaces.Desplazable;
import com.vn.introjava.poo.sistdesplaz.Avion;
import com.vn.introjava.poo.sistdesplaz.Monopatin;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Equipo 4
 */
public class ProbarInterfaces {
    
    
        //AVION
     @Test
     public void creandoDesplazables() {
     
     Avion miAvion=new Avion();
     miAvion.mover(50.1f);
     
     Desplazable aviond1=new Avion();
     aviond1.mover(50);
     
     Avion d1=(Avion)aviond1;
     
     
       //MONOPATIN
       
       Monopatin monopatin1=new Monopatin();
       monopatin1.mover(5f);
       monopatin1.andar(2f);
     } 
     
      @Test
     public void moviendoCocheRally() {
         
         CocheRally cocheRally=new CocheRally();
         Coche cocheR=cocheRally;
         Desplazable desplazR=cocheR;
         Vehiculo vehiculoR=cocheRally;
         cocheR.arrancar();
         vehiculoR.mostrarEstado();
         desplazR.mover(10f);
         
         if(desplazR instanceof CocheRally){
         ((CocheRally) desplazR).setRozamiento(10f);
         assertEquals(((CocheRally) desplazR).getRozamiento(),10f,0.001f);
         }
         
         
     }
     
      @Test
        public void probandoElectricos() {
            
            CocheElectrico coche_electrico=new CocheElectrico();
            MonopatinElectrico monopatin_electrico=new MonopatinElectrico();
            
            coche_electrico.cargar(1000);
            coche_electrico.mover(100f);
            
            monopatin_electrico.cargar(3000);
            monopatin_electrico.mover(200);
     
     
        }
    }
 
    
     
     
     
     
     
     
     

