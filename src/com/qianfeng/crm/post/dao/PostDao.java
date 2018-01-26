package com.qianfeng.crm.post.dao;

import java.util.List;

import com.qianfeng.crm.department.domain.CrmDepartment;
import com.qianfeng.crm.post.domain.CrmPost;

public interface PostDao {
	
	/**
	 * ¸ù“ş²¿éT²éÔƒÂš„Õ
	 */
	public List<CrmPost> findAllByDepart(CrmDepartment department);

}


