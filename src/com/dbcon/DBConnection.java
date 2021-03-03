package com.dbcon;

//import com.mysql.jdbc.Connection;
import java.sql.*;



public class DBConnection {
    
    private static DBConnection instance;

    private DBConnection() {
    }
    
    private static synchronized void createInstance(){
        if(instance==null){
            instance = new DBConnection();
        }
    }
    
    public static DBConnection getInstance(){
        createInstance();
        return instance;
    }

    public Connection getDBConnection()  {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mist", "root", "root");
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        return con;
    }

}
