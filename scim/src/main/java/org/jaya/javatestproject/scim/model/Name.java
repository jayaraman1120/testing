package org.jaya.javatestproject.scim.model;

public class Name {
	private String formatted;
	private String familyname;
	private String givenname;

	public Name() {
		
	}

	public Name(String formatted, String familyname, String givenname) {
		this.setFormatted(formatted);
		this.setFamilyname(familyname);
		this.setGivenname(givenname);
	}

	public String getFormatted() {
		return formatted;
	}

	public void setFormatted(String formatted) {
		this.formatted = formatted;
	}

	public String getFamilyname() {
		return familyname;
	}

	public void setFamilyname(String familyname) {
		this.familyname = familyname;
	}

	public String getGivenname() {
		return givenname;
	}

	public void setGivenname(String givenname) {
		this.givenname = givenname;
	}
}
