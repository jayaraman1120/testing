package org.jaya.javatestproject.scim.model;

public class Email {
	private String value;
	private String type;
	private String primary;
	
	
	public Email() {
	
	}
	public Email(String value) {
		// TODO Auto-generated constructor stub
		this.setValue(value);
		this.setPrimary("true");
		this.setType("work");
	}
	public Email(String value, String type, String primary) {
	this.setPrimary(primary);
	this.setType(type);
	this.setValue(value);
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPrimary() {
		return primary;
	}
	public void setPrimary(String primary) {
		this.primary = primary;
	}
}
