package com.vn.appweb.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*SERVLET QUE GENERA UNA RESPUESTA EN FORMATO HTML*/

public class servlet_css extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest peticionHttp,HttpServletResponse respuesta) throws IOException{
    
        
    //DEFINIMOS EL TIPO DE CONTENIDO SEGUN LOS TIPOS MIME
    //FORMATOS CONOCIDOS DE FICHEROS PARA ENVIO DE EMAILS
    
    respuesta.setContentType("text/css;charset=UTF-8");
    try(PrintWriter salida = respuesta.getWriter()){
            
     salida.print(".color-rojo{background-color:red}");
     
      int x=5;
      for (int i = 0; i < 10; i++) {
           
            salida.print(".tamaño-"+i+"{font-size:"+x+"px}");
            x=x+5;
        }
     
     
     //salida.close(); NO HACE FALTA PORQUE EL TRY SE ENCARGA DE CERRARLO
    }
    }
    
    
    
  
}
