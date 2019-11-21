package com.vn.appweb.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*SERVLET QUE GENERA UNA RESPUESTA EN FORMATO HTML*/

public class HolaHtmlServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest peticionHttp,HttpServletResponse respuesta) throws IOException{
    
        
    //DEFINIMOS EL TIPO DE CONTENIDO SEGUN LOS TIPOS MIME
    //FORMATOS CONOCIDOS DE FICHEROS PARA ENVIO DE EMAILS
    
    respuesta.setContentType("text/html;charset=UTF-8");
    try(PrintWriter salida = respuesta.getWriter()){
            
     salida.print("<html>");
     salida.print("<head>");
     salida.print("<link rel='stylesheet' type='text/css' href='./CSS'/>");
     salida.print("<title>Web HTML desde Servlet</title>");
     salida.print("</head>");
     salida.print("<body  class='color-rojo'>"+"<h1>Web HTML desde Servlet</h1>"
             + "<h2>Hola que pasa</h2>" +"<ul>");
     
        for (int i = 0; i < 10; i++) {
            
            salida.print("<li class='tamaño-"+i+"'>Iteracion: "+i+"</li>");
        }
        salida.print("</ul>");
        
        salida.print("</br>Ruta: "+peticionHttp.getContextPath());//VER RUTA
        salida.print("</br>Metodo: "+peticionHttp.getMethod());//VER QUE METODO SE USA
     
         salida.print("</body>");
        salida.print("</html>");
     
     //salida.close(); NO HACE FALTA PORQUE EL TRY SE ENCARGA DE CERRARLO
    }
    }
    
    
    
  
}
