/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.tests.poo;

import com.vn.introjava.poo.BicicletaElectrica;
import com.vn.introjava.poo.CocheElectrico;
import com.vn.introjava.poo.MonopatinElectrico;
import com.vn.introjava.poo.interfaces.Electrico;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Equipo 4
 */
public class ProbarElectricos {
    
    public ProbarElectricos() {
    }
    
  

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void arrayInterfaces() {
     
            //Array electricos
            Electrico[] cosas_Electricas=new Electrico[]{
            
            new MonopatinElectrico(),
            new BicicletaElectrica(),
            new CocheElectrico()
            
            };
            
                cosas_Electricas[0].cargar(20);
                 cosas_Electricas[1].cargar(200);
                 cosas_Electricas[2].cargar(1000);
                 
                 if(cosas_Electricas.length !=3){
                 
                 
                 fail("No tiene 2 elementos");}
                
     
     
     
     
     }
}
