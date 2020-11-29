package com.team21;

public class IdNamePair {

	private int id;
	private String name;
	
	public IdNamePair(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public IdNamePair(int id) {
		super();
		this.id = id;
	}
	
	public IdNamePair(String name) {
		super();
		this.name = name;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return this.name;
	}
	
	public boolean equals(Object o) {
		if (o==null) return false;
		IdNamePair pair = (IdNamePair) o;
		if (this.id == pair.id) return true;
		if (this.name == null && pair.name == null) return true;
		if (this.name == null || pair.name == null) return false;
		if (this.name.equals(pair.name)) return true;
		return false;
	}
}
