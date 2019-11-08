/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.poo;

/**
 *
 * @author Equipo 4
 */
public class Coche extends Vehiculo {
    
    private String marca;
    private int numero_ruedas=4;
    protected boolean arrancado=false;
    
 //CONSTRUCTOR
    public Coche(){
    
    numero_ruedas=4;
    marca="Sin marca";
   
    }
    
    public Coche(String marca) {
        this.marca = marca;
        
        
    }
    
    public void arrancar(){
    
        System.out.println(this.marca+" ha arrancado");
        arrancado=true;
    }
    
    //SOBRECARGA DE MÉTODOS
    /* SI LA POSICION DE LA LLAVE ES 4, EL COCHE ARRANCA
    NO ARRANCA EN CUALQUIER OTRO CASO
    LA POSICION DE LLAVE PUEDE SER 1-4
    */
    public void arrancar(int posicionLlave){ //4ª posicion arranca
      if(posicionLlave<1 || posicionLlave>4){
      
      throw new IllegalArgumentException("La llave debe de tener un valor entre 1 y 4");
      
      }  
      if(posicionLlave==4){
         System.out.println(this.marca+" ha arrancado");
         arrancado=true;
    }
      else {arrancado=false;
          System.out.println(this.marca+" fallo al  arrancar");
    
    }
    
    }
    
    public boolean arrancar(String orden){
    
    if(orden.equals("arrancar")){
    
        arrancado=true;
        System.out.println("El coche ha arrancado");
    }
    else{
        
        arrancado=false;
    
    
    }
    return arrancado;
    
    }
    //MUESTRA LA MARCA Y SI ESTA ARRANCADO
   @Override
   public void mostrarEstado(){
    
    
        System.out.println(tipo+"El coche: "+getMarca());
        
        if(arrancado==true){
        
            System.out.println("arrancado");
        
        }
        
        else{  System.out.println("apagado");}
    
    }
    
   
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca)  
            //AVISAMOS DE QUE PUEDE MANDAR UNA EXCEPCION DE ESTE TIPO
            throws IllegalArgumentException {
        
       
        if(marca!=null && "".equals(marca)==false){
         this.marca = marca;
        }
        
        else{ 
        throw new IllegalArgumentException("Debes asignar una marca");
        }
       
    }

    public int getNumero_ruedas() {
        return numero_ruedas;
    }

    public boolean isArrancado() {
        return arrancado;
    }

    @Override
    public void avanzar() {
        
        System.out.println("Ruedo");
        
      
    }
   public void mover(float f){
   avanzar();
       System.out.println(f+ " metro");
   }
    
    
}
