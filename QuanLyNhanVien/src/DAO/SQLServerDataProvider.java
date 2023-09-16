/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author ASUS
 */
public class SQLServerDataProvider {
    private Connection conn;
    public void open(){
        String strServer = "LAPTOP-AILSKO80";
        String strDatabase = "QL_NHAHANG";
        String user = "sa";
        String password = "123";
        try {
            String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            Class.forName(driver);
            String connectionURL = "jdbc:sqlserver://" + strServer
                                 + ":1433;databaseName=" + strDatabase
                                // + ";integratedSecurity = true"
                                 + ";user=" + user
                                 +";password=" + password+";encrypt=true;trustServerCertificate=true";
            conn = DriverManager.getConnection(connectionURL);
            
            if(conn==null){
                System.out.println("Failed!");
            }else{
                System.out.println("Success!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void close(){
        try {
            this.conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public ResultSet executeQuery(String sql){
        ResultSet rs = null;
        try {
            Statement sm = conn.createStatement();
            rs = sm.executeQuery(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    public int executeUpdate(String sql){
        int n = -1;
        try {
            Statement sm = conn.createStatement();
            n = sm.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return n;
    }
    
    
    
}
