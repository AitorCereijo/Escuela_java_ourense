/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava;

import java.util.Random;

/**
 *
 * @author Equipo 4
 */
public class Ordenamiento {
    
       public static void  ordenarArray() {
        //declarar array de enteros
        //Programar para ordenarlos

        Random numero_aleatorio = new Random();
        
        int [] numeros=new int[1000];
       
        for(int i=0;i<numeros.length;i++){
            
            numeros[i]=numero_aleatorio.nextInt(1000);}
            
        boolean ordenados = false;
        int contador = 0;
      

        while (ordenados == false) {
            
            for (int i = 0; i < numeros.length-1; i++) {

                if (numeros[i]>numeros[i + 1]) {

                    int auxiliar = numeros[i+1];

                    numeros[i+1] = numeros[i];

                    numeros[i] = auxiliar;

                    contador++;

                }
                 
            }
            
            if (contador == 0) {

                    ordenados = true;

                }

            contador = 0;

        }

        for (int a = 0; a < numeros.length;a++) {

            System.out.println(numeros[a]);

        }
        
         
         
    }
    
    
    
    
    
}
