package com.homepage.login.controller;

import com.alibaba.druid.util.StringUtils;
import com.homepage.login.model.TUser;
import com.homepage.login.result.ResultMsg;

public class UserHelper {
	//用户注册验证
	public static ResultMsg validate(TUser account) {
		if(StringUtils.isEmpty(account.getEmail())) {
			return ResultMsg.errorMsg("Email有误！");
		}
		//TODO这些是对表单数据的校验,其他表单项省略
		if(account.getPassword().length()<6) {
			return ResultMsg.errorMsg("密码小于6位！");
			
		}
		return ResultMsg.successMsg(null);
	}
}
