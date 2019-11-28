<%-- 
    Document   : index
    Created on : 21-feb-2019, 20:42:40
    Author     : IEUser
--%>
<%@include file="head.jsp" %>
<html>
    <%= head() %>
    <body>
	
        <h1>Formulario JSP de Login</h1> 
        <form name="form1" action="usuarios.do" method="GET">

            <table border="1">
              
               <tr><td>Email</td><td>
                       <input required="required" pattern="^(.+)@(.+)$" type="email" name="email" id="email" value=""  placeholder="Introduzca el email"/>  </td></tr> 
                <tr><td>Contraseña</td><td>
                        <input minlength="4" type="password" name="password" id="password" value=""  placeholder="Introduzca la contraseña"/>  </td></tr> 
            </table>
            <input type="submit" value="Login"/>
        </form>
    </body>
</html>