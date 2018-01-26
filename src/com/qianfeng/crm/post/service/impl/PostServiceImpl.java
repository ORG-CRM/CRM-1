package com.qianfeng.crm.post.service.impl;

import java.util.List;

import com.qianfeng.crm.department.domain.CrmDepartment;
import com.qianfeng.crm.post.dao.PostDao;
import com.qianfeng.crm.post.domain.CrmPost;
import com.qianfeng.crm.post.service.PostService;

public class PostServiceImpl implements PostService {

	private PostDao postDao;
	
	public void setPostDao(PostDao postDao) {
		this.postDao = postDao;
	}
	
	@Override
	public List<CrmPost> findAllByDepart(CrmDepartment department) {
		return postDao.findAllByDepart(department);
	}

}
