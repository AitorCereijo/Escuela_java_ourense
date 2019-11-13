/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.patrones;

import com.vn.introjava.poo.Coche;
import java.util.Random;

/**
 *
 * @author Equipo 4
 */
public class CocheEspecialUnico extends Coche {
    
    private CocheEspecialUnico(){
    super();
    }

public static CocheEspecialUnico unicococheEsp;

   public  static CocheEspecialUnico getInstancia(){
    
    if (CocheEspecialUnico.unicococheEsp ==null){
    
    
     CocheEspecialUnico.unicococheEsp=new CocheEspecialUnico();
     CocheEspecialUnico.unicococheEsp.setMarca("Unico coche 1 "+(new Random()).nextInt());

    }
   
     return CocheEspecialUnico.unicococheEsp;
    
}
}
