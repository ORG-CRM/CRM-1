package com.qianfeng.crm.department.domain;

import java.util.HashSet;
import java.util.Set;

import com.qianfeng.crm.post.domain.CrmPost;

/**
 * ����ʵ����
 * @author qq
 *
 */
public class CrmDepartment {
	
	private String depId;
	private String depName;
	
	//һ�������ж��ְ��
	private Set<CrmPost> posts = new HashSet<CrmPost>();

	public String getDepId() {
		return depId;
	}

	public void setDepId(String depId) {
		this.depId = depId;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public Set<CrmPost> getPosts() {
		return posts;
	}

	public void setPosts(Set<CrmPost> posts) {
		this.posts = posts;
	}
	
	
	

}







