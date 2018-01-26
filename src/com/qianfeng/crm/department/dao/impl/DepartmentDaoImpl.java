package com.qianfeng.crm.department.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.qianfeng.crm.department.dao.DepartmentDao;
import com.qianfeng.crm.department.domain.CrmDepartment;

public class DepartmentDaoImpl extends HibernateDaoSupport implements DepartmentDao {
    /**
     * 查詢所有部門
     */
	@Override
	public List<CrmDepartment> findAll() {
		return this.getHibernateTemplate().find("from CrmDepartment");
	}

}
