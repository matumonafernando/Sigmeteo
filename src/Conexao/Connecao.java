/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;

/**
 *
 * @author INAMETCLIN-3
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author pc
 */
public class Connecao {
   private static final Connection com = null;
    private static final String Driver = "com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3307/MariaDB";
    private static final String usuario = "root";
    private static final String passe = "1qazxsw2";
    
    public static Connection getConnection(){
        try{
            Class.forName(Driver);
            return DriverManager.getConnection(url, usuario, passe);
        }catch(ClassNotFoundException | SQLException e){
            throw new RuntimeException();
        }
    }
    public static void fechaConexao(Connection con){
        try{
            if(con != null){
                con.close();
            }
        }catch(SQLException e){
        }
    }
    public static void fechaConexao(Connection con, PreparedStatement stmt){
        fechaConexao(con);
        try{
            if(stmt != null){
                stmt.close();
            }
        }catch(SQLException e){
        }
    }
    public static void fechaConexao(Connection con, PreparedStatement stmt, ResultSet rs){
        fechaConexao(con, stmt);
        try{
            if(rs != null){
                rs.close();
            }
        }catch(SQLException e){
        }
    }
    
    public static void main(String[] args) {
        Connecao com = new Connecao();
        com.getConnection();
    }
    
}