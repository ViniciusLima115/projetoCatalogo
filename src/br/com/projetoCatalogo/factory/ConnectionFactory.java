package br.com.projetoCatalogo.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	
	
	public static Connection createConnection() {
		
	
		Connection conn = null;
	      try {
	         Class.forName("org.postgresql.Driver");
	         conn = DriverManager
	            .getConnection("jdbc:postgresql://localhost:5432/catalogo",
	            "postgres", "admin");
	      } catch (Exception e) {
	         e.printStackTrace();
	         System.err.println(e.getClass().getName()+": "+e.getMessage());
	         System.exit(0);
	      }
	      System.out.println("Opened database successfully");
		return conn;
	   }

	
	
	public static void main(String[] args) {
		ConnectionFactory connectionFactory = new ConnectionFactory();
		
		connectionFactory.createConnection();
	}
}

	