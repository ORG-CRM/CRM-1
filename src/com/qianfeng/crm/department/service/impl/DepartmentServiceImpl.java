package com.qianfeng.crm.department.service.impl;

import java.util.List;

import com.qianfeng.crm.department.dao.DepartmentDao;
import com.qianfeng.crm.department.domain.CrmDepartment;
import com.qianfeng.crm.department.service.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService {

	private DepartmentDao departmentDao;
	
	public void setDepartmentDao(DepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}
	//查詢所有部門
	@Override
	public List<CrmDepartment> findAll() {
		return departmentDao.findAll();
	}

}



