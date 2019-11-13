/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.main;

import com.vn.introjava.excepciones.UsoNormalExcepciones;
import static com.vn.introjava.funcionesbasicas.Ordenamiento.ordenarArray;//METODO IMPORTADO
import java.util.logging.Level;
import java.util.logging.Logger;
import com.vn.introjava.poo.Coche;
import com.vn.introjava.poo.FabricaCoches;
import java.util.Arrays;
import javax.xml.crypto.dsig.TransformException;

/**
 *
 * @author Equipo 4
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ordenarArray();
         
         try{
        
    Coche c=FabricaCoches.crear("Seat");
    c.mostrarEstado();
    c = FabricaCoches.crear("Un coche");
    c.mostrarEstado();}
    
    catch(Exception ex){
    
    Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,ex);
    
    }
         
         /*
        Operadores.probarOperadores();
        Numero.queNumeroEs();
       

        
        System.out.println("Suma y mult: (5+5)*2= "+ (5+5)*2 );
        
        System.out.println("Division: "+ (float)10/3);
        
        System.out.println("Casting: "+(float)3.3434343434);
         
        System.out.println("Resto: "+ 10%3);
        
        //Operador byte a byte
        //00010101 = 21
        //00000111 =7
        //00000101 AND
        
        System.out.println("Op. binario 21 AND 5 = "+(21 & 7));
         
         /*
        Operadores.probarOperadores();
        Numero.queNumeroEs();
       

        
        System.out.println("Suma y mult: (5+5)*2= "+ (5+5)*2 );
        
        System.out.println("Division: "+ (float)10/3);
        
        System.out.println("Casting: "+(float)3.3434343434);
         
        System.out.println("Resto: "+ 10%3);
        
        //Operador byte a byte
        //00010101 = 21
        //00000111 =7
        //00000101 AND
        
        System.out.println("Op. binario 21 AND 5 = "+(21 & 7));
        */
        
         
          try{
              
    UsoNormalExcepciones obj=new UsoNormalExcepciones();
    
    obj.metodoPeligroso();}
    
    catch(ArrayIndexOutOfBoundsException excepcion){
        System.out.println("Excepcion "+excepcion.getMessage());
         System.out.println("Excepcion "+excepcion.toString());
        
        System.out.println("\n Pila de llamadas "+ Arrays.toString(excepcion.getStackTrace()));
        
    }
       
        
          
          try{
          Object objnulo=null;
          System.out.println("Fallara: "+objnulo.toString());
          
          }
                
              catch(IllegalArgumentException excepcion3){
              
              System.out.println("ARGUMENTO INVALIDO ");
              Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,excepcion3);
          
         
          }   catch(RuntimeException excepcion2){
  
              System.out.println("Cualqueir tipo de RuntimeExcetion: ");
              Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,excepcion2);
          
         
          }
          
          
          catch(Exception excepcion){
               //CAPTURA CULQUIER EXCEPCION CUYO TIPO SEA EL INDICADO EN SUS CLASES HIJAS
              System.out.println("Cualqueir tipo de excepcion ");
              Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,excepcion);
          
         
          }
          
          finally{// SIEMPRE SE EJECUTA, INCLUSO ANTES QUE UN RETURN
           System.out.println("****FIN DEL TRY CATCH");
          }
           System.out.println("**** FIN DEL PROGRAMA");
         
       }
    
        public static void mainTryCatch(String[] args) {
            
            try{ 
                
            UsoNormalExcepciones obj=new UsoNormalExcepciones();
    
            obj.metodoPeligroso();
            
            
            Object objnulo=null;
            System.out.println("Fallara: "+objnulo.toString());
            
            
            
            }
            
            catch(Exception excepcion3){
                
                System.out.println("Cualquier tipo de excepcion");
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,excepcion3);
            
           }
                
            }
        
          
    }
    

        
   

 


