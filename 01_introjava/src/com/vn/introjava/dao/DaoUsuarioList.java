/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.dao;
import java.util.ArrayList;

/**
 *
 * @author Equipo 4
 */
public class DaoUsuarioList implements Usuario_interfaz {
    
    public static  ArrayList<Usuario>lista_usuarios; 
    public DaoUsuarioList(){
        
         lista_usuarios=new ArrayList<>();
         
            }
     @Override
    public void crear(Usuario nuevoUsuario) throws Exception {
    
      lista_usuarios.add(nuevoUsuario);
    
    }
    
    public void crear(String nombre,int edad) throws Exception {
    
      lista_usuarios.add(new Usuario (nombre,edad));
      
    }
    
   @Override
    public Usuario obtenerPorIndice(int edad){
        
         return lista_usuarios.get(edad);
      
    }
    
    @Override
    public Usuario obtenerPorNombre(String nombre){
        
        
        for (Usuario lista_usuario : lista_usuarios) {
            
            
            if(lista_usuario.getNombre().equals(nombre)){
            
            return lista_usuario;
          
      }
            
        }
    
             return null;
    
    }

   
    @Override
    public void modificar(int index, Usuario usuario_nuevo) {
        
       Usuario usuarioModificar= lista_usuarios.get(index);
       
       usuarioModificar.setEdad(usuario_nuevo.getEdad());
       usuarioModificar.setNombre(usuario_nuevo.getNombre());
 
    }
    
    //TAREA :METODO PARA ELIMINAR
    
    @Override
    public void eliminar(int index) {
        
       Usuario usuarioEliminar= lista_usuarios.get(index);
       
       lista_usuarios.remove(usuarioEliminar);
      
    }
    /* OTRA FORMA DE BORRAR SIN INDEX,PASANDO EL OBJETO
     @Override
    public void eliminar(Usuario objConDatosNuevos) {
        
       
       this.lista_usuarios.remove(objConDatosNuevos);
      
    }
    */
}

    
    
    //EJ CASA:HACER LO MISMO CON DAOCOCHELIST Y DAOCOCHEMAP, CREANDO OTRA INTERFAZ DIFERENTE
    
    
    
    
    
    
    
    
    
    
    

