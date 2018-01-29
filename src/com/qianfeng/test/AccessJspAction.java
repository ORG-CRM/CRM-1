package com.qianfeng.test;

import com.opensymphony.xwork2.ActionSupport;

public class AccessJspAction extends ActionSupport{
	
	@Override
	public String execute() throws Exception {
		System.out.println("hehe");
		return "success";
	}

}
