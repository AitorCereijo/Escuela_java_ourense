/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.test.IgenericaUsuario;

import com.vn.introjava.dao.DaoUsuarioList;
import com.vn.introjava.dao.Usuario;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Equipo 4
 */
public class IgenericaUsuario {
    
    public IgenericaUsuario() {
    }
   
    @Test
     public void ProbarDaoUsuarioIGenerica()throws Exception {
     
         DaoUsuarioList daousuario=new DaoUsuarioList();
         
         daousuario.crear(new Usuario("Juan",30));
         daousuario.crear(new Usuario("Pepe",20));
         daousuario.crear(new Usuario("Carla",50));
         daousuario.crear(new Usuario("Andres",60));
         
         
          assertEquals("Pepe", daousuario.obtenerPorIndice(1).getNombre());
          assertEquals(30, daousuario.obtenerPorIndice(0).getEdad()); 
               
         daousuario.modificar(0,new Usuario("Juan",25));
         assertEquals(25,daousuario.obtenerPorIndice(0).getEdad());
          
         daousuario.eliminar(1);
         
         assertEquals("Carla",daousuario.obtenerPorIndice(1).getNombre());
        
         
         for(int i=0;i!=DaoUsuarioList.lista_usuarios.size();i++){
             
             System.out.print("Nombre: "+daousuario.obtenerPorIndice(i).getNombre()+" |");
             System.out.println("Edad: "+daousuario.obtenerPorIndice(i).getEdad());
            
         }
         
         
         
         
         
       
     }
}
