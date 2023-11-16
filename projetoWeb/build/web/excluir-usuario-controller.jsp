<%@page import="java.sql.*"%>
<%@page import="config.SistemaUsuariosDb"%>

<%

    String idUsuario = request.getParameter("idUsuario");

    try {
        Connection connection = SistemaUsuariosDb.getConnection();
        Statement statement = connection.createStatement();
        
        statement.execute("DELETE FROM usuario WHERE id = '" + idUsuario + "'");
        response.sendRedirect("listar-usuarios.jsp");

    } catch (Exception ex) {
       // System.out.println("Erro ao excluir usuario");
        ex.getStackTrace();
    }

%>