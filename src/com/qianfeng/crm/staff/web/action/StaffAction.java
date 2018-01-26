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

	// �����½
	private StaffService staffService;

	public void setStaffService(StaffService staffService) {
		this.staffService = staffService;
	}

	public String login() {
		CrmStaff staff = staffService.login(crmStaff);
		// Ա������
		if (staff != null) {
			// ��Ա��������� session
			ActionContext.getContext().getSession().put("staff", staff);
			return "success";
		}
		// Ա�������ڣ�������ʾ
		addFieldError("", "�û������������");
		return "login";
	}

	public String home() {
		return "home";
	}

	/**
	 * ��ѯ����Ա��
	 */
	public String findAll() {
		List<CrmStaff> staffs = staffService.findAll();
		// ActionContext���ʺϴ洢map ȡֵ��#
		// ValueStack�� push() ֱ��ѹջ���ʺ�JavaBean��Map�� set("name",5)--HashMap �ʺ�List
		ActionContext.getContext().getValueStack().set("staffs", staffs);
		// ActionContext.getContext().put("staffs", staffs);

		return "findAll";
	}

	private DepartmentService departmentService;

	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	/**
	 * �����T��id��ԃ�T����Ϣ
	 */
	public String findStaffById() {
		// �õ��T������
		CrmStaff staff = staffService.findById(crmStaff.getStaffId());
		ActionContext.getContext().getValueStack().push(staff);

		// ��ԃ���в��T
		List<CrmDepartment> departments = departmentService.findAll();
		ActionContext.getContext().getValueStack()
				.set("departments", departments);
		return "findStaffById";
	}

}
