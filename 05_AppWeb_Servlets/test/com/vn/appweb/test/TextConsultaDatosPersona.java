package com.vn.appweb.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.vn.appweb.modelo.ConsultaSQL;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Equipo 4
 */
public class TextConsultaDatosPersona {
    
    public TextConsultaDatosPersona() {
    }



@Test
public void testSelectSQL(){

ConsultaSQL conSQL = new ConsultaSQL();

     assertEquals(0,conSQL.leerTabla("Nomb*****eba").size());
    
     assertEquals("Nombre de prueba",conSQL.leerTabla("Nombre de prueba").get(0).getNombre());
    

}








}
    
  
