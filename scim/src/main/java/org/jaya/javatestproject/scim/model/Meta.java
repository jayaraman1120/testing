package org.jaya.javatestproject.scim.model;

import java.util.Date;

public class Meta {
	private String resourceType;
	private Date created;
	private Date lastmodified;
	public Meta(Date created, Date lastmodified) {
		this.created = created;
		this.lastmodified = lastmodified;
		this.resourceType = "User";
	}
	public String getResourceType() {
		return resourceType;
	}
	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getLastmodified() {
		return lastmodified;
	}
	public void setLastmodified(Date lastmodified) {
		this.lastmodified = lastmodified;
	}

}
