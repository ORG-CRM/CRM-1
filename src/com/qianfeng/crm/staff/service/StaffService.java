package com.qianfeng.crm.staff.service;

import java.util.List;

import com.qianfeng.crm.staff.domain.CrmStaff;

public interface StaffService {
	
	/**
	 * 员工登陆
	 */
	public CrmStaff login(CrmStaff staff);
	
	/**
	 * 得到所有员工
	 */
	public List<CrmStaff> findAll();
	
	/**
	 * 查詢某個員工
	 */
	public CrmStaff findById(String staffId);

}






