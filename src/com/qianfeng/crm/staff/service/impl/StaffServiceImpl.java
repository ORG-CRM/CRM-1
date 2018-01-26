package com.qianfeng.crm.staff.service.impl;

import java.util.List;

import com.qianfeng.crm.staff.dao.StaffDao;
import com.qianfeng.crm.staff.domain.CrmStaff;
import com.qianfeng.crm.staff.service.StaffService;
import com.qianfeng.crm.utils.MD5Util;

public class StaffServiceImpl implements StaffService {

	private StaffDao staffDao;
	
	public void setStaffDao(StaffDao staffDao) {
		this.staffDao = staffDao;
	}
	//登陆业务
	@Override
	public CrmStaff login(CrmStaff staff) {
		//把登陆密码进行md5加密
		String psw = MD5Util.getMD5Str(staff.getLoginPwd());
		
		return staffDao.findStaff(staff.getLoginName(), psw);
	}
	
	//查询所有员工
	@Override
	public List<CrmStaff> findAll() {
		return staffDao.findAllStaff();
	}
	
	//查询某個员工
	@Override
	public CrmStaff findById(String staffId) {
		return staffDao.findById(staffId);
	}

}






