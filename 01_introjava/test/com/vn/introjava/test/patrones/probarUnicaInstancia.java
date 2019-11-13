/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.test.patrones;

import com.vn.introjava.patrones.CocheEspecialUnico;
import com.vn.introjava.patrones.TractorSingleton;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Equipo 4
 */
public class probarUnicaInstancia {
    
    public probarUnicaInstancia() {
    }
   
    @Test
    public void intentarUnicaIns() throws Exception {
    
    CocheEspecialUnico miunicocoche=CocheEspecialUnico.getInstancia();
    //CocheEspecialUnico.unicococheEsp=miunicocoche;
    miunicocoche.setMarca("Unico coche");
    miunicocoche.mostrarEstado();
    
    
    }
    @Test
    public void intentarUnicaInsbis() throws Exception {
    
    CocheEspecialUnico miunicocoche=CocheEspecialUnico.getInstancia();
    //CocheEspecialUnico.unicococheEsp=miunicocoche;
    //miunicocoche.setMarca("Unico coche 2");
    miunicocoche.mostrarEstado();
    
    
    } @Test
    public void intentarUnicaInsTris() throws Exception {
    
    CocheEspecialUnico miunicocoche= CocheEspecialUnico.getInstancia();
    //CocheEspecialUnico.unicococheEsp=miunicocoche;
    //miunicocoche.setMarca("Unico coche 3");
    miunicocoche.mostrarEstado();
    
    
    }
    
    @Test
    public void intentarUnicaInsTrisTras() throws Exception {
    
    CocheEspecialUnico miunicocoche= CocheEspecialUnico.getInstancia();
    miunicocoche.mostrarEstado();
    
    
    }
    
     @Test
    public void intentar_tractor1() throws Exception {
    
   TractorSingleton mitractor1=TractorSingleton.getInstancia();
   mitractor1.mostrarEstado();
    
   
    }
    
    @Test
    public void intentar_tractor2() throws Exception {
    
   TractorSingleton mitractor2=TractorSingleton.getInstancia();
   mitractor2.mostrarEstado();
    
   
    }
    
    
    
    
    
}