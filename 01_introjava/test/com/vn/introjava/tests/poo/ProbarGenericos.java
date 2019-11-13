/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
package com.vn.introjava.tests.poo;

import com.vn.introjava.poo.Coche;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Equipo 4
 */
/*
public class ProbarGenericos {
    
    public ProbarGenericos() {
    }
    
    @Test
    public void testear_metodos_genericos() {
        
        
        ArrayList<Integer>listIn = new ArrayList<Integer>();
        
        int tres=3; 
        int cinco=5;
        insertarIntegerDuplicado(listIn,tres);
        insertarIntegerDuplicado(listIn,cinco);
        
        System.out.println("Tres sigue siendo "+tres);
        
        for (Integer integer : listIn) {
            
            System.out.println(" - "+ integer);
        }
        
        ArrayList<String>lisStr = new ArrayList<String>();
        
        
        String tresS="3"; 
        String cincoS="5";
        insertarIntegerDuplicado(lisStr,tresS);
        insertarIntegerDuplicado(lisStr,cincoS);
        
         System.out.println("Tres sigue siendo "+tres);
        for (String unString : lisStr) {
            
            System.out.println("** "+unString);
        }
         
    }
    
    static void insertarIntegerDuplicado(ArrayList<Integer> listaInt,int i){
        //AÑADE POR DUPLICADO
        
        listaInt.add(i);
        listaInt.add(i);
        System.out.println(i + " añadido dos veces");
        i=i+10;// NO AFECTA FUERA DEL METODO A LA LISTA PORQUE SON VARIABLES DIFERENTES
        listaInt=null;
        
      
    } 
    static void insertarIntegerDuplicado(ArrayList<String> listaString,String str){
    
        listaString.add(str);
        listaString.add(str);
        System.out.println(str + " añadido dos veces");
        str=str+ "10";// NO AFECTA FUERA DEL METODO A LA LISTA PORQUE SON VARIABLES DIFERENTES
        listaString=null;
    
    }
    //METODO GENERICO , hay que añadir ->>>>> <Tipo>
     static <Tipo> void insertarDuplicado(ArrayList<Tipo> listaGenerica,Tipo objeto){
         
        //AÑADE POR DUPLICADO
        
        listaGenerica.add(objeto);
        listaGenerica.add(objeto);
        System.out.println(objeto + " añadido dos veces");
        listaGenerica=null;
        
         if(objeto instanceof Integer){
         
             Integer i=(Integer) objeto;// CONVERSION EXPLICITA
             
             i=i+2;
         
         }
         
          ArrayList<Coche> lista_coches= new ArrayList<Coche>();
              
             insertarDuplicado(lista_coches, new Coche("Coche3"));
             insertarDuplicado(lista_coches, new Coche("Coche2"));
             
              
              for (Coche un_coche : lista_coches) {
                  
                  System.out.println(" "+un_coche.toString());
                  
           
         }}
            // EJ 2
          static <Tipo> Tipo devolver_ultimo(ArrayList<Tipo>lista,Tipo objeto){
              
              
              for(Tipo infusion:lista){
              
                  System.out.println(" "+infusion.toString());
                  
                  if(lista.size()>0){
                  
                      return lista.get(lista.size()-1);
                  
              }
            
              
            
              
          }
           }  } 
          
          
*/
