package com.taylors.foodnet.models;

public class Restaurant {
	
	String id;
	String name;
	String subname;
	int image;
	
	public Restaurant(String id,String name, String subname, int image)
	{
		this.id = id;
		this.name = name;
		this.subname = subname;
		this.image = image;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubname() {
		return subname;
	}
	public void setSubname(String subname) {
		this.subname = subname;
	}
	public int getImage() {
		return image;
	}
	public void setImage(int image) {
		this.image = image;
	}
	
}
