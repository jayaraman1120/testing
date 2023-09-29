package org.struts.businessservice;

import org.struts.model.User;

public class LoginService {
	public boolean VerifyLogin(User user) {
		if(user.getUsername().equals("username") && user.getPassword().equals("password")) {
			return true;
		}
		return false;
	}
}
