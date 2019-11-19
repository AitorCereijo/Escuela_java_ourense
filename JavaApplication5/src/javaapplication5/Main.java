/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import com.vn.liboperaarrays.OperarArrays;

/**
 *
 * @author Equipo 4
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double [] arrayA={1,2,3,4,5,};
        double [] arrayB={2,3,4,5,6};
        
        //COORDENADAS
        Object [] arrayC= new Object[]{1.0,2.0,3.0,4.0,5.0};
        Object [] arrayD=new Object[]{2.0,3.0,4.0,5.0,6.0};
        
        
        double[]arraySumaAB= OperarArrays.OperarArrays(arrayA, arrayB,Main::suma);
        double[]arrayMultiplicacionAB=OperarArrays.OperarArrays(arrayA, arrayB,Main::multiplicar);
        
        //COORDENADAS
        Object[]arrayCoordenadaAB=OperarArrays.OperarArraysCoordenadas(arrayC,arrayD,Main::coordenadas);
        
        
   }
    
     public static double suma(double x,double y){
        
        return x+y;
        }
      public static double multiplicar(double x,double y){
        
        return x*y;
        }
      
      
      //COORDENADAS
      public static Object coordenadas(Object x , Object y){
          
            
           return x+" "+y;
           
      }
      
}
