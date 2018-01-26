package com.qianfeng.crm.staff.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.qianfeng.crm.staff.dao.StaffDao;
import com.qianfeng.crm.staff.domain.CrmStaff;

public class StaffDaoImpl extends HibernateDaoSupport implements StaffDao {

	@Override
	public CrmStaff findStaff(String loginName, String loginPwd) {
		List<CrmStaff> list = this.getHibernateTemplate().find("from CrmStaff where loginName=? and loginPwd=?", loginName,loginPwd);
		if(list.size()==1){
			return list.get(0);
		}
		return null;
	}
    /**
     * ��ѯ����Ա��
     */
	@Override
	public List<CrmStaff> findAllStaff() {
		List<CrmStaff> staffs = this.getHibernateTemplate().find("from CrmStaff");
		return staffs;
	}
	/**
	 * ��ԃĳ���T��
	 */
	@Override
	public CrmStaff findById(String staffId) {
		return this.getHibernateTemplate().get(CrmStaff.class, staffId);
	}
}






