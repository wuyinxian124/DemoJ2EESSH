package com.ynwi.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import com.ynwi.ssh.forms.UserForm;
import com.ynwi.ssh.service.UserManager;

public class RegisterAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private UserForm user;

	private UserManager userManager;

	public UserForm getUser() {
		return user;
	}

	public void setUser(UserForm user) {
		this.user = user;
	}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}

	public String execute() {
		try {
			userManager.regUser(user);
			return SUCCESS;

		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}

}
