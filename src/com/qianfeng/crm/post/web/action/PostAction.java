package com.qianfeng.crm.post.web.action;

import java.io.IOException;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.qianfeng.crm.post.domain.CrmPost;
import com.qianfeng.crm.post.service.PostService;

public class PostAction extends ActionSupport implements ModelDriven<CrmPost> {

	private CrmPost crmPost = new CrmPost();

	@Override
	public CrmPost getModel() {
		return crmPost;
	}

	public CrmPost getCrmPost() {
		return crmPost;
	}

	public void setCrmPost(CrmPost crmPost) {
		this.crmPost = crmPost;
	}

	private PostService postService;

	public void setPostService(PostService postService) {
		this.postService = postService;
	}

	// ajax Ո��r���еĄ�������:ajax���������T�����ݲ��Ų���ְ��
	public String findAllByDepart() throws IOException {
		System.out.println("*****************");
		// �õ����������е�ְ��
		List<CrmPost> posts = postService.findAllByDepart(crmPost
				.getDepartment());
		System.out.println("===============" + posts);
		// ��ְ������ת��json��ʽ���ظ�ajax
		// list,arrayʹ��JSONArray, javabean,mapʹ��JSONObject
		// ת��ʱ������ѭ����ȥ�������ѭ��������
		JsonConfig config = new JsonConfig();
		config.setExcludes(new String[] { "department", "staffs" });
		String jsonData = JSONArray.fromObject(posts, config).toString();

		// ���ص����ݺ������ģ�������
		ServletActionContext.getResponse().setContentType(
				"text/html;charset=utf-8");
		// ��json��ʽ�����ݷ��͸��ͻ���
		ServletActionContext.getResponse().getWriter().print(jsonData);
		return "none";
	}

}
