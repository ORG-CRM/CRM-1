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
	//��½ҵ��
	@Override
	public CrmStaff login(CrmStaff staff) {
		//�ѵ�½�������md5����
		String psw = MD5Util.getMD5Str(staff.getLoginPwd());
		
		return staffDao.findStaff(staff.getLoginName(), psw);
	}
	
	//��ѯ����Ա��
	@Override
	public List<CrmStaff> findAll() {
		return staffDao.findAllStaff();
	}
	
	//��ѯĳ��Ա��
	@Override
	public CrmStaff findById(String staffId) {
		return staffDao.findById(staffId);
	}

}






