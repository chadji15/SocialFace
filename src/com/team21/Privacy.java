package com.team21;

public enum Privacy {
	
	OPEN, CLOSED, FRIEND, NETWORK;
	
	public String toChar() {
		return Character.toString(this.name().charAt(0));
	}
	
	public static Privacy toPrivacy(String s) {
		if (s.equals("O")) return OPEN;
		if (s.equals("C")) return CLOSED;
		if (s.equals("N")) return NETWORK;
		if (s.equals("F")) return FRIEND;
		return null;
	}
}
