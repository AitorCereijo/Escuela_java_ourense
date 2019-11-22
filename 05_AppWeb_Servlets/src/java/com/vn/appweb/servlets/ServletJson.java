/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.appweb.servlets;

import com.google.gson.Gson;
import com.vn.appweb.modelo.DatosPersona;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Equipo 4
 */
public class ServletJson extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
         response.setContentType("application/json;charset=UTF-8");
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
     
            out.println("{");
            out.println("\"nombre\":\"Fulanito de tal\",");
            out.print("\"edad\": 30,");
            out.println("\"fibonacci\":[1,1,2,3,4,5,8]");
            out.println("}");
           
        }
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String nombre=request.getParameter("nombre");
        String email=request.getParameter("email");
        
        response.setContentType("application/json;charset=UTF-8");
        
        
        
        try (PrintWriter out = response.getWriter()) {
        
            DatosPersona dper = new DatosPersona();
            dper.setNombre("Nombre desde Gson: "+nombre.toUpperCase());
            dper.setEmail("Email: "+email.toLowerCase());
            dper.setFibonacci(new int[]{1,2,3,4,5,25});
            Gson gson=new Gson();
            String datosJSON=gson.toJson(dper);
            out.println(datosJSON);
            
          
        }
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}