package com.qianfeng.crm.post.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.qianfeng.crm.department.domain.CrmDepartment;
import com.qianfeng.crm.post.dao.PostDao;
import com.qianfeng.crm.post.domain.CrmPost;

public class PostDaoImpl extends HibernateDaoSupport implements PostDao {

	@Override
	public List<CrmPost> findAllByDepart(CrmDepartment department) {
		return this.getHibernateTemplate().find("from CrmPost where department=?", department);
   }

}
