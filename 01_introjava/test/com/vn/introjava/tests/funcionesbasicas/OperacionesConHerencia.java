/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.tests.funcionesbasicas;

import com.vn.introjava.poo.Coche;
import com.vn.introjava.poo.CocheRally;
import com.vn.introjava.poo.TipoVehiculo;
import com.vn.introjava.poo.Tractor;
import com.vn.introjava.poo.Vehiculo;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Equipo 4
 */
public class OperacionesConHerencia {
     static  Coche turismo;
     static CocheRally supra;
    
    public OperacionesConHerencia() {
         
    }
      
     @Test
   public void testSobreescrituraMetodos(){
     
      
       
       supra.setRozamiento(7f);
       assertTrue(supra.getRozamiento()==7f);
       assertTrue(supra.arrancar("arrancar"));
       assertTrue(supra.arrancar("ARRANcar"));
       assertTrue(supra.arrancar("Encender"));
       supra.mostrarEstado();
     
     }
     public static  void setUpClass() throws Exception{
     
      supra=new CocheRally();
      supra.setMarca("Toyota");  
     
     }
     
     @Test
     public void testPolimorfismo(){
         
         supra.setRozamiento(15f);
         turismo= supra;
         turismo.mostrarEstado();
          
     }
  
      @Test
     public void test_enumerado(){
     
     supra.setTipo(TipoVehiculo.RALLY);
     //UN ENUMERADO ES UN INT, LIMITADO  A LA LISTA DE VALORES QUE INDICAMOS
     System.out.println("Tipo: "+supra.getTipo().toString());
     System.out.println("Valor tipo: "+supra.getTipo().ordinal());
     
     Tractor miTractorAmarillo=new Tractor();
     miTractorAmarillo.setTipo(TipoVehiculo.valueOf("TRACTOR"));
          System.out.println("valor tipo: "+miTractorAmarillo.getTipo());
          
          //RECOMENDADO USAR EL VALUES()[]
     miTractorAmarillo.setTipo(TipoVehiculo.values()[2]);
          System.out.println("valor tipo: "+miTractorAmarillo.getTipo());     
     
     }
     
     @Test
     
     public void testClasesAbstractas(){
     
     Vehiculo vehiculo_desc=new Coche("Dacia");
     Vehiculo vehiculo_desc2=new CocheRally("Subaru");
     Vehiculo vehiculo_desc3=new Tractor();
     
     vehiculo_desc3.avanzar();
     vehiculo_desc.avanzar();
     vehiculo_desc2.avanzar();
     
     assertEquals(((CocheRally)vehiculo_desc2).getMarca(), "Subaru");
     
     Vehiculo[] misVehiculos= new Vehiculo[]{
     
     vehiculo_desc,
     vehiculo_desc2,
     vehiculo_desc3
     };
     for(Vehiculo miVehiculo:misVehiculos){
     
         System.out.println(" - "+miVehiculo.getTipo());
         miVehiculo.avanzar();
     
     
     }
     
     }
    
}
