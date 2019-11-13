/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.concurrencia;

/**
 *
 * @author Equipo 4
 */
public class HilosSencillos {
    
     static int contador_compartido=0;
     
      HiloA hiloA;
      HiloB hiloB;
     
    public HilosSencillos() {
        
        this.hiloA = new HiloA();
        this.hiloB = new HiloB();
       
    }
      
    class HiloA implements Runnable{
       
        
        @Override
        public void run() {
            
            for(int i =0;i<8000;i++){
                contador_compartido++;
                System.out.println("Instruccion A :"+i+" |"+contador_compartido);
                
            }
        
        }
    
      
    }
    class HiloB implements Runnable{

        @Override
        public void run() {
            
            for(int j =0;j<5000;j++){//CONTADOR PRINCIPAL ,J, EN VARIBLE LOCAL
                contador_compartido++;
                System.out.println(" ->Ins B :"+j+" |"+contador_compartido);
                
            }
        
        }
    
      
    }
    
    public void ejecutarHilosAB(){
        
        System.out.println("*******START*********");
        
        hiloA=new HiloA();
        hiloB=new HiloB();
        
        
        Thread procesoA=new Thread(hiloA);
        Thread procesoB=new Thread(hiloB);
        
        procesoA.start();
        procesoB.start();
        
       while(procesoA.isAlive() || procesoB.isAlive());
   
    }
    
    public void ejecturarHilosRunAB(){ 
        
        System.out.println("********RUN*********");
        
        
        Thread procesoA=new Thread(hiloA);
        Thread procesoB=new Thread(hiloB);
        
       
        procesoA.run();
        procesoB.run();
        
        while(procesoA.isAlive() || procesoB.isAlive());
        
    
    
    
    }
    
    
    
    
    
    
    
    
}
