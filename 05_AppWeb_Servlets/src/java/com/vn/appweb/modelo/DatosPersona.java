/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.appweb.modelo;

/**
 *
 * @author Equipo 4
 */
public class DatosPersona{ //POJO: PLAIN OLD JAVA OBJECT
 
    
 
    private String nombre;
          
    private String email;

    private int[] fibonacci;
    
    
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    public String getNombre() {
        return nombre;
    }

   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getFibonacci() {
        return fibonacci;
    }

   
    public void setFibonacci(int[] fibonacci) {
        this.fibonacci = fibonacci;
    }


}
