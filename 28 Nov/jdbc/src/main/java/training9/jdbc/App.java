package training9.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
    	
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	System.out.println("Driver Loaded");
    	
    	String uname = "root";
    	String pwd = "root@39";
    	String url = "jdbc:mysql://localhost:3306/training";
    	
    	Connection con =DriverManager.getConnection(url, uname, pwd);
    	System.out.println("connection established");
    	
    	String query = "select* from orders";
    	
    	Statement st = con.createStatement();
    	ResultSet rs = st.executeQuery(query);
    	
    	while(rs.next()) {
    		System.out.println(rs.getInt(1));
    		System.out.println(rs.getDate(2));
    		System.out.println(rs.getDate(3));
    		System.out.println(rs.getDate(4));
    		System.out.println(rs.getString(5));
    		System.out.println(rs.getString(6));
    		System.out.println(rs.getInt(7));
    		    		
    		
    	}
    }
}
