package com.ynwi.ssh.serviceImpl;

import org.hibernate.HibernateException;
import org.springframework.beans.BeanUtils;

import com.ynwi.ssh.beans.User;
import com.ynwi.ssh.dao.BaseDao;
import com.ynwi.ssh.forms.UserForm;
import com.ynwi.ssh.service.UserManager;

public class UserManagerImpl implements UserManager {

	private BaseDao dao;

	public void setDao(BaseDao dao) {
		this.dao = dao;
	}

	@Override
	public void regUser(UserForm userForm) throws HibernateException {
		User user = new User();
		BeanUtils.copyProperties(userForm, user);
		dao.saveObject(user);
	}

}
