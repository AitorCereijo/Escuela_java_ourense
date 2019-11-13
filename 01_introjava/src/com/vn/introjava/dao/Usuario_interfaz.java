/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.dao;

import com.vn.introjava.poo.Coche;

/**
 *
 * @author Equipo 4
 */
public interface Usuario_interfaz extends Interfaz_generica<Usuario> {
    
    /*
     public void crear(String marca,int edad) throws Exception;
     public Usuario obtenerPorEdad(int edad);*/
    //SOLO SE DECLARAN LOS METODOS ESPECIFICOS
     public Usuario obtenerPorNombre(String nombre);
    
    
}
