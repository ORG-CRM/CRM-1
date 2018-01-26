package com.qianfeng.web.intercepter;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class LoginIntercepter extends MethodFilterInterceptor {

	/**
	 * 登陆拦截器
	 */
	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		//判断是否有用户登录
		Object obj = ActionContext.getContext().getSession().get("staff");
		//没有登陆去登陆，显示登陆界面
		if(obj==null){
			return "login";
		}
		//已经登陆了，放行
		return invocation.invoke();
	}

}





