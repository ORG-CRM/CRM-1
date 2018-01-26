package com.qianfeng.web.intercepter;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class LoginIntercepter extends MethodFilterInterceptor {

	/**
	 * ��½������
	 */
	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		//�ж��Ƿ����û���¼
		Object obj = ActionContext.getContext().getSession().get("staff");
		//û�е�½ȥ��½����ʾ��½����
		if(obj==null){
			return "login";
		}
		//�Ѿ���½�ˣ�����
		return invocation.invoke();
	}

}





