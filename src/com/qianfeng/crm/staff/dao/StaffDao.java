package com.qianfeng.crm.staff.dao;

import java.util.List;

import com.qianfeng.crm.staff.domain.CrmStaff;


public interface StaffDao {

	/**
	 * ���ݵ�¼���������ѯԱ��
	 */
	public CrmStaff findStaff(String loginName,String loginPwd);
	
   /**
    * ��ѯ����Ա���Ĺ���
    */
   public List<CrmStaff> findAllStaff();
   
   /**
    * �����T��id��ԃ�T����Ϣ
    */
   public CrmStaff findById(String staffId);
  
	
}





