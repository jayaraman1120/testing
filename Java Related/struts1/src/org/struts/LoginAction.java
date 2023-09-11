package org.struts;

import org.apache.commons.lang3.StringUtils;
import org.struts.businessservice.LoginService;
import org.struts.model.User;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements ModelDriven{

	private User user = new User();
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	public void validate() {
		if(StringUtils.isEmpty(user.getUsername())) {
			addFieldError("username","User name Can not be blank");
		}
		if(StringUtils.isEmpty(user.getPassword())) {
			addFieldError("password","Pass word Can not be blank");
		}
	}
	
	public String execute() {
		LoginService loginservice = new LoginService();
		if(loginservice.VerifyLogin(user))
		return SUCCESS;
		
		return ERROR;
	}

	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return user;
	}
}
