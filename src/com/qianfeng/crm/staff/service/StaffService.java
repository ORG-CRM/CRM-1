package com.qianfeng.crm.staff.service;

import java.util.List;

import com.qianfeng.crm.staff.domain.CrmStaff;

public interface StaffService {
	
	/**
	 * Ա����½
	 */
	public CrmStaff login(CrmStaff staff);
	
	/**
	 * �õ�����Ա��
	 */
	public List<CrmStaff> findAll();
	
	/**
	 * ��ԃĳ���T��
	 */
	public CrmStaff findById(String staffId);

}






