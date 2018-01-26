package com.qianfeng.crm.staff.web.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.qianfeng.crm.department.domain.CrmDepartment;
import com.qianfeng.crm.department.service.DepartmentService;
import com.qianfeng.crm.staff.domain.CrmStaff;
import com.qianfeng.crm.staff.service.StaffService;

public class StaffAction extends ActionSupport implements ModelDriven<CrmStaff> {

	Interceptor in;
	private CrmStaff crmStaff = new CrmStaff();

	@Override
	public CrmStaff getModel() {
		return crmStaff;
	}

	public CrmStaff getCrmStaff() {
		return crmStaff;
	}

	public void setCrmStaff(CrmStaff crmStaff) {
		this.crmStaff = crmStaff;
	}

	// 处理登陆
	private StaffService staffService;

	public void setStaffService(StaffService staffService) {
		this.staffService = staffService;
	}

	public String login() {
		CrmStaff staff = staffService.login(crmStaff);
		// 员工存在
		if (staff != null) {
			// 把员工对象放入 session
			ActionContext.getContext().getSession().put("staff", staff);
			return "success";
		}
		// 员工不存在，给出提示
		addFieldError("", "用户名或密码错误");
		return "login";
	}

	public String home() {
		return "home";
	}

	/**
	 * 查询所有员工
	 */
	public String findAll() {
		List<CrmStaff> staffs = staffService.findAll();
		// ActionContext：适合存储map 取值：#
		// ValueStack： push() 直接压栈，适合JavaBean和Map， set("name",5)--HashMap 适合List
		ActionContext.getContext().getValueStack().set("staffs", staffs);
		// ActionContext.getContext().put("staffs", staffs);

		return "findAll";
	}

	private DepartmentService departmentService;

	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	/**
	 * 根據員工id查詢員工信息
	 */
	public String findStaffById() {
		// 得到員工對象
		CrmStaff staff = staffService.findById(crmStaff.getStaffId());
		ActionContext.getContext().getValueStack().push(staff);

		// 查詢所有部門
		List<CrmDepartment> departments = departmentService.findAll();
		ActionContext.getContext().getValueStack()
				.set("departments", departments);
		return "findStaffById";
	}

}
