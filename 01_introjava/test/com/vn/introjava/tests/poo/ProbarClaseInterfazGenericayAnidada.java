/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.tests.poo;

import java.util.HashMap;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Equipo 4
 */
public class ProbarClaseInterfazGenericayAnidada {
    
    
    static class ClasePequePos<T> { //ESTATIC PARA USARLO EN CUALQUIER PARTE
                                    //SE AÑADE <T> PARA QUE LA CLASE SEA GENERICA    
        
        T x,y;
        public ClasePequePos(T x,T y){
        
        this.x=x;
        this.y=y;
        
        }
        
        @Override 
       public  String toString(){return "(x = "+x+ ", y = "+y+")"; }
        
    }
    
     @Test
     public void probarclase_anidada() {
     
         ClasePequePos unPunto2D=new ClasePequePos(3f,5f);
         System.out.println("PUNTO 2D: "+unPunto2D.toString());
         
         ClasePequePos<String> unPunto2Dstr=new ClasePequePos<String>("tres","cinco");
         
         System.out.println("PUNTO 2D str "+unPunto2Dstr);
         
     }
     
     
     @Test
     public void probar_hashmap() {
     
         HashMap lista=new HashMap();
         lista.put("a","b");
         lista.put("c","d");
         
         System.out.println(lista);
         
         
         
         
     }
     
     
     
     
}
