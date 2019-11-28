/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.appusuarios.controladores;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vn.appusuarios.modelo.Usuario;
import com.vn.appusuarios.modelo.logica.ServicioUsuarios;

/**Solo hay una instancia por aplicacion, que se ejecuta en su propio hilo
 * Todos los usuario comparten el mismo servlet/JSP o derivados
 *
 * @author Equipo 4
 */
public class UsuariosServlet extends HttpServlet {

	private ServicioUsuarios srv;
	
	
    @Override
	public void init() throws ServletException {
		
		super.init();
		
		 this.srv = new ServicioUsuarios();
	}

	/**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws SQLException, ClassNotFoundException, ServletException, IOException {
        
        String email=request.getParameter("email");
        String password=request.getParameter("password");
        String nombre=request.getParameter("nombre");
        String edad=request.getParameter("edad");
        //En el objeto peticion le pasamos nuestro servicio de usuarios
        request.setAttribute("servicioUsu",this.srv);
       

        if(request.getMethod() == "POST"){
                 
        Usuario usuario = srv.crear(email, password, nombre, edad);
        if(usuario !=null && usuario.getId() >= 0){
        request.getSession().setAttribute("usuario",usuario);
        request.getRequestDispatcher("registrado.jsp").forward(request, response);
       
     
        }
        
        else{ request.getRequestDispatcher("registrarse.jsp").forward(request, response);}
        
      
        }else if(request.getMethod() == "GET") {
        	// Habria tambien que comprobar la password
        	
        	Usuario usuario = srv.leerUno(email);
        	request.getSession().setAttribute("usuario",usuario);
        	
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UsuariosServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UsuariosServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
