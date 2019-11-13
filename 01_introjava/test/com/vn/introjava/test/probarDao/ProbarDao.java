/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.test.probarDao;

import com.vn.introjava.dao.DaoCocheInterfaz;
import com.vn.introjava.dao.DaoCocheList;
import com.vn.introjava.dao.DaoCocheMap;
import com.vn.introjava.dao.DaoUsuarioList;
import com.vn.introjava.dao.Usuario;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Equipo 4
 */
public class ProbarDao {
    
    public ProbarDao() {
    }
    
   

   @Test
   public void Probar_DaoList() throws Exception {
   
   DaoCocheList daoCoche=new DaoCocheList();
   
   daoCoche.crear("Coche A");
   daoCoche.crear("Coche B");
   daoCoche.crear("Coche C");
   
   
       assertEquals(daoCoche.obtenerPorIndice(1).getMarca(), "Coche B");
       assertEquals(daoCoche.obtenerPorMarca("Coche C").getMarca(), "Coche C");
   
   
   }
   
    @Test
   public void Probar_Map() throws Exception {
   
    DaoCocheMap cocheMap=new DaoCocheMap();
    
    cocheMap.crear("Coche A");
    cocheMap.crear("Coche B");
    cocheMap.crear("Coche C");
   
        assertEquals(cocheMap.obtenerPorIndice(1).getMarca(), "Coche B");
        assertEquals(cocheMap.obtenerPorMarca("Coche C").getMarca(), "Coche C");
       
       
   }
   
     @Test
   public void Probar_Interfaz() throws Exception {
   
       DaoCocheInterfaz coche_interfaz=new DaoCocheMap();
       
               coche_interfaz.crear("Coche A");
               coche_interfaz.crear("Coche B");
               coche_interfaz.crear("Coche C");
   
        assertEquals(coche_interfaz.obtenerPorIndice(1).getMarca(), "Coche B");
        assertEquals(coche_interfaz.obtenerPorMarca("Coche C").getMarca(), "Coche C");      
   
   
   }
   
    /* @Test
   public void Probar_Interfaz2(DaoCocheInterfaz coche_interfaz) throws Exception {
   
               coche_interfaz.crear("Coche A");
               coche_interfaz.crear("Coche B");
               coche_interfaz.crear("Coche C");
   
        assertEquals(coche_interfaz.obtenerPorIndice(1).getMarca(), "Coche B");
        assertEquals(coche_interfaz.obtenerPorMarca("Coche C").getMarca(), "Coche C");      
   
   
   }*/
   
    @Test
   public void Probar_InterfazGenerica() throws Exception {
   
       DaoUsuarioList daoUsuario=new DaoUsuarioList();
       
               daoUsuario.crear(new Usuario("Juan",30));
               daoUsuario.crear(new Usuario("Pepe",50));
               daoUsuario.crear(new Usuario("Carla",25));
               
   
               assertEquals("Pepe", daoUsuario.obtenerPorIndice(1).getNombre());
               assertEquals(25, daoUsuario.obtenerPorIndice(2).getEdad());      
   
   
   }
   
   
   
}
