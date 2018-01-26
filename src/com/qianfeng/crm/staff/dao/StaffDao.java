package com.qianfeng.crm.staff.dao;

import java.util.List;

import com.qianfeng.crm.staff.domain.CrmStaff;


public interface StaffDao {

	/**
	 * 根据登录名和密码查询员工
	 */
	public CrmStaff findStaff(String loginName,String loginPwd);
	
   /**
    * 查询所有员工的功能
    */
   public List<CrmStaff> findAllStaff();
   
   /**
    * 根據員工id查詢員工信息
    */
   public CrmStaff findById(String staffId);
  
	
}





