package config;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
import com.mysql.jdbc.Driver;

/**
 *
 * @author User
 */
public class SistemaUsuariosDb {

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection connection = null;
        try {
            String nomeDriver = "com.mysql.jdbc.Driver";
            Class.forName(nomeDriver);

            String localServidor = "localhost";
            String nomeBanco = "sistema_usuarios";
            String url = "jdbc:mysql://" + localServidor + "/" + nomeBanco;
            String user = "root";
            String password = "";

            connection = DriverManager.getConnection(url, user, password);
        } catch (Exception ex) {
            System.out.println("Ocorreu um erro na conexao com o banco de dados");
            ex.printStackTrace();
        }
        return connection;
    }
}
