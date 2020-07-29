package com.homepage.login.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homepage.login.mapper.TUserMapper;
import com.homepage.login.model.TUser;
import com.homepage.utils.PwdUtils;
@Service
public class UserService implements UserServiceImpl{
	//插入数据库、密码加盐MD5
	@Autowired
	private TUserMapper userMapper;
	
	public List<TUser> getUsers(){
		return userMapper.selectUsers();
	}

	@Override
	public boolean addAccount(TUser account) {
		System.out.println("account.getEmail()--"+account.getEmail());
		System.out.println("account.getNickname()--"+account.getNickname());
		System.out.println("account.getPassword()--"+account.getPassword());
		System.out.println("account.getRealname()--"+account.getRealname());
		account.setPassword(PwdUtils.encryPassword(account.getPassword()));
		System.out.println("account.getPassword()--"+account.getPassword());
		userMapper.insert(account);
		return true;
	}
	
	public boolean slectAccount(String phone) {
		return true;
	}

	@Override
	public TUser auth(String username, String password) {
		TUser user = new TUser();
		user.setUsername(username);
		user.setPassword(password);
		List<TUser> list = getUserByQuery(user);
		if(list != null && !list.isEmpty()) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public List<TUser> getUserByQuery(TUser user) {
		List<TUser> list  = null;
		try {
			list = userMapper.selectUserByQuery(user);
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
		
		return list;
	}
	
}
