package com.qianfeng.crm.department.dao;

import java.util.List;

import com.qianfeng.crm.department.domain.CrmDepartment;

public interface DepartmentDao {
	
	/**
	 * 查詢所有部門
	 */
	public List<CrmDepartment> findAll();

}







