package com.qianfeng.crm.post.domain;

import java.util.HashSet;
import java.util.Set;

import com.qianfeng.crm.department.domain.CrmDepartment;
import com.qianfeng.crm.staff.domain.CrmStaff;

/**
 * ְ��ʵ����
 * @author qq
 *
 */
public class CrmPost {

	private String postId;
	private String postName;
	
	//һ��ְ������һ������
	private CrmDepartment department;//��new��? ����new���Լ�new������˲̬
	
	//һ��ְ���Ӧ���Ա��
	private Set<CrmStaff> staffs = new HashSet<CrmStaff>();
	
	

	public String getPostId() {
		return postId;
	}

	public void setPostId(String postId) {
		this.postId = postId;
	}

	public String getPostName() {
		return postName;
	}

	public void setPostName(String postName) {
		this.postName = postName;
	}

	public CrmDepartment getDepartment() {
		return department;
	}

	public void setDepartment(CrmDepartment department) {
		this.department = department;
	}

	public Set<CrmStaff> getStaffs() {
		return staffs;
	}

	public void setStaffs(Set<CrmStaff> staffs) {
		this.staffs = staffs;
	}
	
	
	
	
}







