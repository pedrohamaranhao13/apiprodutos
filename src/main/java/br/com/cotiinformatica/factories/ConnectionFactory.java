package br.com.cotiinformatica.factories;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	private static String host = "jdbc:postgresql://localhost:5434/bd_produtosApi";
	private static String user = "coti_user";
	private static String pass = "coti_password";
	
	public static Connection getConnection() throws Exception{
		
			return DriverManager.getConnection(host, user, pass);
			
	}

}
