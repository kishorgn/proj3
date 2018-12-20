package org.kishor.ignite.demo_001.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Category {
	
	int id;
	String name;
	String location;
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Category(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", location="
				+ location + "]";
	}
	
}
