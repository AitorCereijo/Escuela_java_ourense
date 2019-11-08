/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.poo.interfaces;

/**La forma en que se comunican las clases que la implementan.
 *Es como una clase abstracta con solo metodos abstractos.
 * @author Equipo 4
 */
public interface Desplazable {
    
    //int propiedadNoApropiada=4;  NO SE DEBEN USAR VARIABLES EN INTERFACES
    
    //SOLO HACER DECLARACION DE METODOS PUBLICOS, POR DEFECTO SIEMPRE SON PUBLICOS Y ABSTRACTOS
        
    
     void mover(float metros);
    
   // public void mover(int metros); SOBRECARGA DE METODO
    
    //public void detener();    
    
    
    
    
}
