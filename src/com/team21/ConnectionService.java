package com.team21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import gui.newEvent;

public class ConnectionService {

	private static ConnectionService connection = new ConnectionService();
	private static String server = "APOLLO";
	private static String database = "chadji15";
	private static String username = "chadji15";
	private static String pass = "7RYACf6D";
	private User user;
	private User visited;
	private Connection conn;
	
	private ConnectionService() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String conn_string = "jdbc:sqlserver://" + server + ";databaseName=" + database + ";user=" + username + ";password=" + pass;
		try {
			this.conn = DriverManager.getConnection(conn_string);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static ConnectionService getInstance() {
		return connection;
	}
	
	public static boolean isCurrentUser() {
		if (connection.user == null || connection.visited == null) {
			return false;
		}
		if (connection.user.getId() == connection.visited.getId()) 
			return true;
		return false;
	}
	
	public User getUser() {
		return this.user;
	}
	
	public void setUser(User p) {
		this.user = p;
	}
	
	public User getVisited() {
		return this.visited;
	}
	
	public void setVisited(User p) {
		this.visited = p;
	}
	
	public Connection getConn() {
		return this.conn;
	}
}
