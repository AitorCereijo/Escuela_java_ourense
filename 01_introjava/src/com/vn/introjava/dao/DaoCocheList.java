/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.dao;

import com.vn.introjava.poo.Coche;
import com.vn.introjava.poo.FabricaCoches;
import java.util.ArrayList;

/**
 *
 * @author Equipo 4
 */
public class DaoCocheList extends Coche implements DaoCocheInterfaz
{
    private ArrayList<Coche>lista_coches; 
    
    public DaoCocheList(){
        
         lista_coches=new ArrayList<>();
            }
    
    @Override
    public void crear(String marca) throws Exception {
    
    lista_coches.add(FabricaCoches.crear(marca));
    
    
    }
    
   
    
    @Override
    public Coche obtenerPorMarca(String marca){
        
        
        for (Coche coche : lista_coches) {
            
            if(coche.getMarca().equals(marca)){
            
            return coche;
            }
            
        }
    
             return null;
    
    }

    @Override
    public Coche obtenerPorIndice(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

    
}
