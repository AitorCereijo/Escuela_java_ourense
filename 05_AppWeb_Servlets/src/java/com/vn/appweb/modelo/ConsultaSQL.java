/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.appweb.modelo;

import com.vn.appweb.servlets.ParamServlet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Equipo 4
 */
public class ConsultaSQL {
    
    public ConsultaSQL(){
    
                try{
            
            Class.forName("org.apache.derby.jdbc.ClientDriver");
                DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
            
            }   
            
            catch (Exception ex) {
                    Logger.getLogger(ParamServlet.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println("No se ha cargado DerbyDB");
                } 
    
    }
    
    public List<DatosPersona> leerTabla(String busqueda){
    
    ArrayList<DatosPersona> datos = new ArrayList<>();
    
    try(Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/db_prueba","root","1234")){
                
                String sqlQuery="SELECT nombre,email FROM ROOT.PERSONA WHERE TRIM(UPPER(nombre)) LIKE ?";  
                //SENTENCIA PREPARADA PARA EVITAR SQL INJECTION
                PreparedStatement sentenciaSQL= con.prepareStatement(sqlQuery);
                sentenciaSQL.setString(1,"%"+busqueda+"%"); //SUSTITUIR EL PRIMER ? POR 'CONTENIDO DEL NOMBRE'
                ResultSet resultado = sentenciaSQL.executeQuery();
                
                while(resultado.next()){
                
                String nombre= resultado.getString("nombre"); //tambien se puede poner 1
                String email= resultado.getString("email");//tambien se puede poner 2
                DatosPersona dp = new DatosPersona();
                dp.setNombre(nombre);
                dp.setEmail(email);
                datos.add(dp);
                
                }
                
                 return datos;
            }  
            
            catch (SQLException ex) {
                
                    Logger.getLogger(ParamServlet.class.getName()).log(Level.SEVERE, null, ex);
                    
                }
    
                return null;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
