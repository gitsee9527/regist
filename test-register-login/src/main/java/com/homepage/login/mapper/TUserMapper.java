package com.homepage.login.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.homepage.login.model.TUser;
import com.homepage.utils.MyMapper;
@Mapper
public interface TUserMapper extends MyMapper<TUser> {
	public  List <TUser> selectUsers();

	public int insert(TUser account);

	public int delete(String email);

	public int update(TUser updateUser);

	public List<TUser> selectUserByQuery(TUser user);
}