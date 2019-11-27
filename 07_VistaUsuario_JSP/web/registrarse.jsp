<%-- 
    Document   : index
    Created on : 21-feb-2019, 20:42:40
    Author     : IEUser
--%>
<%@include file="head.jsp" %>
<html>
    <%= head() %>
    <body>
        <%@include file="header.jsp" %>
        <h1>Formulario JSP de registro</h1> 
        <form name="form1" action="usuarios.do" method="POST">

            <table border="1">
                <tr><td>Nombre:</td><td>
                        <input required="required" type="text" name="nombre" id="nombre" size="25" value="" placeholder="Introduzca el nombre"/>  </td></tr>
                <tr><td>Edad:</td><td>
                        <input min="12"   type="number" name="edad" id="edad" value=""  placeholder="Introduzca la edad"/>  </td></tr> 
               <tr><td>Email</td><td>
                       <input required="required" pattern="^(.+)@(.+)$" type="email" name="email" id="email" value=""  placeholder="Introduzca el email"/>  </td></tr> 
                <tr><td>Contraseña</td><td>
                        <input minlength="4" type="password" name="password" id="password" value=""  placeholder="Introduzca la contraseña"/>  </td></tr> 
            </table>
            <input type="submit" value="Registrar"/>
        </form>
    </body>
</html>