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

	// ajax 請求時執行的動作方法:ajax传过来來部門，根据部门查找职务
	public String findAllByDepart() throws IOException {
		System.out.println("*****************");
		// 得到部门下所有的职务
		List<CrmPost> posts = postService.findAllByDepart(crmPost
				.getDepartment());
		System.out.println("===============" + posts);
		// 把职务数据转成json格式返回给ajax
		// list,array使用JSONArray, javabean,map使用JSONObject
		// 转换时出现死循环，去除造成死循环的属性
		JsonConfig config = new JsonConfig();
		config.setExcludes(new String[] { "department", "staffs" });
		String jsonData = JSONArray.fromObject(posts, config).toString();

		// 返回的数据含有中文，会乱码
		ServletActionContext.getResponse().setContentType(
				"text/html;charset=utf-8");
		// 把json格式的数据发送给客户端
		ServletActionContext.getResponse().getWriter().print(jsonData);
		return "none";
	}

}
