package com.team21;

import java.awt.print.Printable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import gui.newEvent;

public class ConnectionService {

	private static ConnectionService connection = new ConnectionService();
	private static String server;
	private static String database;
	private static String username;
	private static String pass;
	private User user;
	private User visited;
	private Connection conn;
	private IdNamePair album;
	private IdNamePair photo;
	private IdNamePair video;
	private IdNamePair event;
	

	private ConnectionService() {
		ConnectionService.server = "apollo.in.cs.ucy.ac.cy";
		ConnectionService.database = "atzoum01";
		ConnectionService.username = "atzoum01";
		ConnectionService.pass = "7RYACf6D";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String conn_string = "jdbc:sqlserver://" + ConnectionService.server + ";databaseName=" + ConnectionService.database 
				+ ";user=" + ConnectionService.username + ";password=" + ConnectionService.pass;
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
	public IdNamePair getAlbum() {
		return album;
	}

	public void setAlbum(IdNamePair album) {
		this.album = album;
	}

	public IdNamePair getPhoto() {
		return photo;
	}

	public void setPhoto(IdNamePair photo) {
		this.photo = photo;
	}
	
	public IdNamePair getVideo() {
		return video;
	}

	public void setVideo(IdNamePair video) {
		this.video = video;
	}
	

	public IdNamePair getEvent() {
		return event;
	}

	public void setEvent(IdNamePair event) {
		this.event = event;
	}

}
