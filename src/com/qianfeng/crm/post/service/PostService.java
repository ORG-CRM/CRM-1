package com.qianfeng.crm.post.service;

import java.util.List;

import com.qianfeng.crm.department.domain.CrmDepartment;
import com.qianfeng.crm.post.domain.CrmPost;

public interface PostService {

	public List<CrmPost> findAllByDepart(CrmDepartment department);
}
