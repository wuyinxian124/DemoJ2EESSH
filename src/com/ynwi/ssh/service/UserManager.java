package com.ynwi.ssh.service;

import org.hibernate.HibernateException;

import com.ynwi.ssh.forms.UserForm;

public interface UserManager {

	public void regUser(UserForm user) throws HibernateException;

}
