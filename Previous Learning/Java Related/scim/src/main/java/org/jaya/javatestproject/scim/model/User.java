package org.jaya.javatestproject.scim.model;

import java.util.Date;

public class User {

	private String username;
	private String authentication_Type;
	private String role;
	private String email;
	private String scope_computer;
	private String scope_mobile;
	private String contact_number;
	private String language;
	private Date created;
	private Date modified;
	private Long id;
	private String externalid;
	private String formatted_name;
	private String family_name;
	private String given_name;
	
	public User(String username, String email, String contact_number, 
			Date created, Date modified, Long id, String externalId,
			String formatted_name,String family_name,String given_name)
	{
		this.username = username;
		this.authentication_Type = "domain";
		this.role = "Administrator";
		this.email = email;
		this.scope_computer = "All Computer";
		this.scope_mobile = "All Mobile";
		this.contact_number = contact_number;
		this.language = "en-US";
		this.created = created;
		this.modified = modified;
		this.id = id;
		this.externalid = externalId;
		this.formatted_name = formatted_name;
		this.family_name = family_name;
		this.given_name = given_name;
		
		}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAuthentication_Type() {
		return authentication_Type;
	}
	public void setAuthentication_Type(String authentication_Type) {
		this.authentication_Type = authentication_Type;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getScope_computer() {
		return scope_computer;
	}
	public void setScope_computer(String scope_computer) {
		this.scope_computer = scope_computer;
	}
	public String getScope_mobile() {
		return scope_mobile;
	}
	public void setScope_mobile(String scope_mobile) {
		this.scope_mobile = scope_mobile;
	}
	public String getContact_number() {
		return contact_number;
	}
	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String getExternalid() {
		return externalid;
	}

	public void setExternalid(String externalid) {
		this.externalid = externalid;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFormatted_name() {
		return formatted_name;
	}

	public void setFormatted_name(String formatted_name) {
		this.formatted_name = formatted_name;
	}

	public String getFamily_name() {
		return family_name;
	}

	public void setFamily_name(String family_name) {
		this.family_name = family_name;
	}

	public String getGiven_name() {
		return given_name;
	}

	public void setGiven_name(String given_name) {
		this.given_name = given_name;
	}
	

}
