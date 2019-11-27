<%-- 
    Document   : lista_bbdd
    Created on : 22-nov-2019, 11:24:12
    Author     : Equipo 4
--%>

<%@page import="com.vn.appweb.modelo.ConsultaSQL"%>
<%@page import="java.util.List"%>
<%@page import="com.vn.appweb.modelo.DatosPersona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado JSP con DerbyDB</title>
    </head>
    <body>
        <h1>Listado JSP con DerbyDB</h1>

        <%
            out.println("<p>Hola desde java: " + request.getContextPath() + "</p>");

        %>
        </br>
        <ul>
        <% for(int i=0;i<10;i++){
            
            
        %>    
            <li> Numero <%=i %> </li>
        <% }%> 
            <form name="formBusq" method="GET" action="./lista_bbdd.jsp">
                <input name="busq" id="busq" value="Búsqueda"/>
                <input type="submit" value="buscar"/>
            </form>
         </ul>
        
        <table>
            <thead>
                <th>Nombre</th>
                 <th>Email</th>
                 
                 <tr>
           
           <% ConsultaSQL conSQL =new ConsultaSQL();
             String busqueda = request.getParameter("busq");
            List<DatosPersona> listaPer = conSQL.leerTabla("%"+busqueda+"%");
           
           %>
   
                     <% for (DatosPersona dp : listaPer) {%>
                   
                 <tr><td><%= dp.getNombre()%></td><td><%=dp.getEmail()%> </td></tr> 
                            
              <%}%>
                     
                  </script>   
                 </tr>

            </thead>
            
            
        </table>
        
        
    </body>
</html>
