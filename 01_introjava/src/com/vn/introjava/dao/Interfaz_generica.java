/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.dao;

/**
 *
 * @author Equipo 4
 * @param <Tipo>
 */
public interface Interfaz_generica<Tipo> {
    
    void crear(Tipo objeto)throws Exception;
    public Tipo obtenerPorIndice(int index);
    
    void modificar(int index,Tipo obj_nuevo);
    void eliminar(int index);
}
