package com.team21;

import gui.newEvent;

public class ConnectionService {

	private static ConnectionService connection = new ConnectionService();
	private User user;
	private User visited;
	
	private ConnectionService() {
		
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
}
