package com.qianfeng.crm.coursetype.domain;

import java.util.HashSet;
import java.util.Set;

import com.qianfeng.crm.classes.domain.CrmClasses;

/**
 * 课程类型实体类
 * @author qq
 *`courseTypeId` VARCHAR(255) NOT NULL PRIMARY KEY,
  `courseCost` DOUBLE DEFAULT NULL,
  `total` INT(11) DEFAULT NULL,
  `courseName` VARCHAR(500) DEFAULT NULL,
  `remark` VARCHAR(5000) DEFAULT NULL
 */
public class CrmCourseType {
    
	private String courseTypeId;
	private Double courseCost;//课程学费
	private Integer total;//课程总学时
	private String courseName;//课程名称
	private String remark;
	
	//一个课程类型对应多个班级
	private Set<CrmClasses> classes = new HashSet<CrmClasses>();

	public String getCourseTypeId() {
		return courseTypeId;
	}

	public void setCourseTypeId(String courseTypeId) {
		this.courseTypeId = courseTypeId;
	}

	public Double getCourseCost() {
		return courseCost;
	}

	public void setCourseCost(Double courseCost) {
		this.courseCost = courseCost;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Set<CrmClasses> getClasses() {
		return classes;
	}

	public void setClasses(Set<CrmClasses> classes) {
		this.classes = classes;
	}
	
	
	
	
	
}




