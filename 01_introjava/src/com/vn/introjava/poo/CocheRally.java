/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.poo;

/** CLASE COCHERALLY PARA CONTROLAR OTRAS CARACTERISTICAS ESPECIFICAS DE LOS RALLIES
 *
 * 
 */
public class CocheRally extends Coche {
    
        private float rozamiento;

    public CocheRally(String subaru) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Get the value of rozamiento
     *
     * @return the value of rozamiento
     */
    public float getRozamiento() {
        return rozamiento;
    }

    public CocheRally(){
    super();
    rozamiento=5f;
    
    
    }
    public CocheRally(float rozamiento, String marca) {
        super(marca);
        this.rozamiento = rozamiento;
    }
    

    /**
     * Set the value of rozamiento
     *
     * @param rozamiento new value of rozamiento
     */
    public void setRozamiento(float rozamiento) {
        this.rozamiento = rozamiento;
    }

   
    public void mostrarEstado_antiguo() {
        
        super.mostrarEstado(); 
        System.out.println("El rozamiento es: "+getRozamiento());
    }

    
     @Override
    public String toString() {
        
        return "Marca: "+getMarca()+" rozamiento "+rozamiento+" "+(isArrancado()?" arrancado.":" apagado");
        
    }
    
    
    @Override
    public boolean arrancar(String orden) {
        
        if(super.arrancar(orden)) return super.arrancado;
        else{
                if("arrancar".equalsIgnoreCase(orden)) 
                    arrancado=true;
                   
                else arrancado="Encender".equals(orden.toLowerCase());
                
        }
        return arrancado;
        
        
    }
    

    
    
}
