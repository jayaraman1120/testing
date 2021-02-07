package org.struts;

import org.apache.commons.lang3.StringUtils;
import org.struts.businessservice.TutorialFinderService;

import com.opensymphony.xwork2.ActionSupport;

public class TutorialAction  extends ActionSupport{
private String language;
private String setTutorialSite;
private String username;
private String password;
public void validate() {
	if(StringUtils.isEmpty(username)) {
		addFieldError("username","User name Can not be blank");
	}
	if(StringUtils.isEmpty(username)) {
		addFieldError("password","Pass word Can not be blank");
	}
}
	public String execute() {
		TutorialFinderService tutorialfinderservice = new TutorialFinderService();
		setSetTutorialSite(tutorialfinderservice.languageFinder(language));
		return SUCCESS;
	}
	
	public String login() {
		if(username.equals("username") && password.equals("password")) {
			return SUCCESS;
		}
		
		return ERROR;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getSetTutorialSite() {
		return setTutorialSite;
	}
	public void setSetTutorialSite(String setTutorialSite) {
		this.setTutorialSite = setTutorialSite;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
