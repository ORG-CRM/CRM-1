package com.qianfeng.crm.post.domain;

import java.util.HashSet;
import java.util.Set;

import com.qianfeng.crm.department.domain.CrmDepartment;
import com.qianfeng.crm.staff.domain.CrmStaff;

/**
 * 职务实体类
 * @author qq
 *
 */
public class CrmPost {

	private String postId;
	private String postName;
	
	//一个职务属于一个部门
	private CrmDepartment department;//能new不? 不能new，自己new的属于瞬态
	
	//一个职务对应多个员工
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







