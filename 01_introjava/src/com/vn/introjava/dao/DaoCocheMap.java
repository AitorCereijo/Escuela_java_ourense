/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.dao;

import com.vn.introjava.poo.Coche;
import com.vn.introjava.poo.FabricaCoches;
import java.util.HashMap;

/**
 *
 * @author Equipo 4
 */
   public class DaoCocheMap extends Coche implements DaoCocheInterfaz {
    
  private int ultimo_index;
     
  private HashMap<String, Coche> lista_coches_map;

  private HashMap<Integer, Coche> lista_coches_map2;
  
  
    
    public DaoCocheMap(){
    
         lista_coches_map=new HashMap<>();
         lista_coches_map2=new HashMap<>();
 
            }
    @Override
    public void crear(String marca) throws Exception {
    
     lista_coches_map.put(marca,FabricaCoches.crear(marca));
     lista_coches_map2.put(ultimo_index,lista_coches_map.get(marca));
    
         ultimo_index++;
    }
 
    
  @Override
    public Coche obtenerPorMarca(String marca){
        
        
        return lista_coches_map.get(marca);
    
    }
    
  @Override
      public Coche obtenerPorIndice(int index){
        
        
       return lista_coches_map2.get(index);
    
    
    
    
    }
    
    
    
    
    
}
