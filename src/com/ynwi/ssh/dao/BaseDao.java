package com.ynwi.ssh.dao;

import org.hibernate.HibernateException;

public interface BaseDao {

	public void saveObject(Object obj) throws HibernateException;

}
