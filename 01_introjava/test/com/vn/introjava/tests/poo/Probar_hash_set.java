/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.tests.poo;

import java.util.HashMap;
import java.util.TreeSet;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Equipo 4
 */
public class Probar_hash_set {
 

     @Test
     public void probar_hashmap() {
     
         HashMap<String ,String> lista=new HashMap<String ,String>();
         lista.put("a","b");
         lista.put("c","d");
         
         System.out.println(lista);
      
     }
     
     @Test
     public void probar_treeset() {
     
         TreeSet t=new TreeSet();
         
         t.add("a");
         t.add("b");
         
         System.out.println(t);
         
         
    
     }
     
     
     
}
