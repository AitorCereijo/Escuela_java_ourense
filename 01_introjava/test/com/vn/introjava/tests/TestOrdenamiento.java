/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.tests;

import com.vn.introjava.funcionesbasicas.Ordenamiento;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Equipo 4
 */
public class TestOrdenamiento {
    
    public TestOrdenamiento() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
        
    }
    
    @Before
    public void setUp() {
        
      
    }

     @Test
     private void probarOrdenamientoSistemaHumano(int[]numeros,int[]numerosOk) {
   
       
       assertArrayEquals(numeros, numerosOk);
       
        }
     
     @Test
     public void probarOrdenamientoSistemaHumano_5_digitos() {
     
       int[] numeros = {2,1,3,5,4};
       int[] numerosOk = {1,2,3,4,5};
      
      probarOrdenamientoSistemaHumano(numeros,numerosOk);
       
        }
     
     @Test
     public void probarOrdenamientoSistemaHumano_inversa() {
     
       int[] numeros = {5,4,3,2,1};
       int[] numerosOk = {1,2,3,4,5};
      
      probarOrdenamientoSistemaHumano(numeros,numerosOk);
       
        }
     
      @Test
     public void probarOrdenamientoSistemaHumano_repetidos() {
     
       int[] numeros = {1,4,3,3,1};
       int[] numerosOk = {1,3,3,4,1};
      
      probarOrdenamientoSistemaHumano(numeros,numerosOk);
       
        }
     
       @Test
     public void probarOrdenamientoSistemaHumano_negativos() {
     
       int[] numeros = {1,4,-3,3,-1};
       int[] numerosOk = {1,3,-3,4,1};
      
      probarOrdenamientoSistemaHumano(numeros,numerosOk);
       
        }
     
       @Test
     public void probarOrdenamientoSistemaHumano_vacio() {
     
       int[] numeros = {};
       int[] numerosOk = {};
      
      probarOrdenamientoSistemaHumano(numeros,numerosOk);
       
        }
     
        @Test
     public void probarOrdenamientoSistemaHumano_ordenado() {
     
       int[] numeros = {1,2,3,4,5};
       int[] numerosOk = {1,2,3,4,5};
      probarOrdenamientoSistemaHumano(numeros,numerosOk);
       
        }
     
     @Test
     public void probarOrdenamientoSistemaHumano_null() {
     
       int[] numeros =null;
       int[] numerosOk =null;
      probarOrdenamientoSistemaHumano(numeros,numerosOk);
       
        }
     
     
     
    
     
}
