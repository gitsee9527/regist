package com.homepage.login.service;

import java.util.List;

import com.homepage.login.model.TUser;

public interface UserServiceImpl {
	public boolean addAccount(TUser account);
	//验证用户名和密码
	public TUser auth(String username, String password);
	//查询用户
	public List<TUser> getUserByQuery(TUser user);
}
