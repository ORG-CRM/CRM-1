package com.qianfeng.crm.post.dao;

import java.util.List;

import com.qianfeng.crm.department.domain.CrmDepartment;
import com.qianfeng.crm.post.domain.CrmPost;

public interface PostDao {
	
	/**
	 * �������T��ԃ��
	 */
	public List<CrmPost> findAllByDepart(CrmDepartment department);

}


