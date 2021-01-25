
package com.market.Connections;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
public class DBUtil {
     final static String forNameURL = "com.mysql.cj.jdbc.Driver";
     final static String dbURL = "jdbc:mysql://localhost:3306/supermarket";
     final static String username = "root";
     final static String password = "root";
     public static Connection DBConnection() throws SQLException, ClassNotFoundException
     {
    	 Class.forName(forNameURL);
    	 Connection con = java.sql.DriverManager.getConnection(dbURL,username,password);
    	 return con;
     }
}
