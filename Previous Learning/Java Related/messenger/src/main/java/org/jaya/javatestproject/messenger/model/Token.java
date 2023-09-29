package org.jaya.javatestproject.messenger.model;

import java.util.Date;

public class Token {

	private String token;
	private Date created;
	
	
	public Token(String token) {
		this.token = token;
		this.created = new Date();
		// TODO Auto-generated constructor stub
	}


	public String getToken() {
		return token;
	}


	public void setToken(String token) {
		this.token = token;
	}


	public Date getCreated() {
		return created;
	}


	public void setCreated(Date created) {
		this.created = created;
	}

}
