/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.tests.poo;

import com.vn.introjava.poo.Coche;
import com.vn.introjava.poo.CocheRally;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Equipo 4
 */
public class ProbarColecciones {
    

     @Test
     public void Array_list_mal() {
     
         // NO USAR EN ESTE FORMATO, PORQUE SE MEZCLAN TIPOS DE DATOS
         ArrayList lista=new ArrayList();
         lista.add(new Object());
         lista.add(new Coche("Coche"));
         lista.add("Texto cualquiera");
         lista.add(100);
         
         for(int i=0;i<lista.size();i++){
     
         System.out.println("Elem["+i+"]= "+lista.get(i).toString());
     
     
     }
     
     }
     
     @Test
     public void Array_list_bien() {
         
         ArrayList<CocheRally> miscoches=new ArrayList<CocheRally>();
         
         miscoches.add(new CocheRally("Subaru Lunes"));
         miscoches.add(new CocheRally("Toyota Martes"));
          miscoches.add(new CocheRally("Hammer Finde"));
          
          miscoches.get(2).arrancar("encender");
           miscoches.get(2).mostrarEstado();
           
           for (CocheRally micoche : miscoches) {
               
               micoche.avanzar();
               
             
         }
       
          
     }
}
