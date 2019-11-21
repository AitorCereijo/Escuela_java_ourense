
package com.vn.appweb.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**CREANDO UN FORMULARIO Y RECIBIENDO SUS CAMPOS COMO PARAMETROS
 *
 * @author Equipo 4
 */
public class ParamServlet extends HttpServlet {
        
           

    @Override
    protected void doGet(HttpServletRequest peticion, HttpServletResponse respuesta)
            throws ServletException, IOException {
         respuesta.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = respuesta.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ParamServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ParamServlet at " + peticion.getContextPath() + "</h1>");
            out.println("<h1>FORMULARIO DE REGISTRO</h1>");
            //NOMBRE E EMAIL OBLIGATORIOS
            
            out.println("<form id='formDatos action='./formulario' method='POST'>");
            out.println("<label>Nombre</label>");
            out.println("<input required id='nombre_campo' name='nombre_campo' type='text'/></br></br>");
             out.println("<label>Email</label>");
            out.println("<input required type='email' id='email' name='email'/>");
            out.println("<input type='submit' value='Enviar'/>");
            out.println("</form>");
            
    
         
    }}

    
   @Override
    protected void doPost(HttpServletRequest peticion, HttpServletResponse respuesta)
            throws ServletException, IOException {
        
            respuesta.setContentType("text/html;charset=UTF-8");
            
            try (PrintWriter out = respuesta.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ParamServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ParamServlet at " + peticion.getContextPath() + "</h1>");
            out.println("<h1>FORMULARIO DE REGISTRO</h1>");
            //NOMBRE E EMAIL OBLIGATORIOS
            
            
            String valorCampo=peticion.getParameter("nombre_campo");
            String valorCampo2=peticion.getParameter("email");
            
            String nombre = valorCampo.trim(); // TRIM() -->QUITA LOS ESPACIOS EN BLANCO
            String email= valorCampo2.trim(); //PARA NO PODER MANDAR UN INPUT VACIO
            
            if("".equals(nombre) || nombre==null || "".equals(email) || email==null){
            
                out.print("<p style='color:red'>No se han recibido los parametros </p>");
                
            }
            
           
            else{
            
               out.print("<p style='color:green'>Se ha recibido el nombre: "+nombre.toUpperCase()+" </p>");
                out.print("<p style='color:green'>Se ha recibido el email: "+email.toLowerCase()+" </p>");
            }
           
            //VAMOS A INSERTAR LOS DATOS RECIBIDOS
            //jdbc:derby://localhost:1527/db_prueba
            
            try{
            
            Class.forName("org.apache.derby.jdbc.ClientDriver");
                DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
            
            }   
            catch (Exception ex) {
                    Logger.getLogger(ParamServlet.class.getName()).log(Level.SEVERE, null, ex);
                    out.println("\"<p style='color:green'>No se ha cargado: \"+email.toLowerCase()+\" </p>\"");
                } 
            
            try(Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/db_prueba","root","1234")){
                
                String sqlQuery="INSERT INTO persona (nombre,email) VALUES ('"+nombre+"','"+email+"')";   
                Statement sentenciaSQL= con.createStatement();
                sentenciaSQL.executeUpdate(sqlQuery);
                
                
            }  
            catch (SQLException ex) {
                    Logger.getLogger(ParamServlet.class.getName()).log(Level.SEVERE, null, ex);
                     out.println("\"<p style='color:green'>Error SQL:"+ex.getMessage()+
                             ": \"+email.toLowerCase()+\" </p>\"");
                }
           
            out.println("</body>");
            out.println("</html>");
    
      
    }}

  
    @Override
    public String getServletInfo() {
        return "Servlet que envia formulario y recibe los parámetros";
    }// </editor-fold>

}
