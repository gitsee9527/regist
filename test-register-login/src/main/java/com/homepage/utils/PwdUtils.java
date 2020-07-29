package com.homepage.utils;

import java.nio.charset.Charset;

import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;

//密码加密
public class PwdUtils {
	private static final HashFunction  FUNCTION = Hashing.md5();
	//防止破解，将密码同一个字符串进行md5
	private static final String SALT = "/register"; 
	
	public static String encryPassword(String password) {
		//使用UTF-8对字符进行编码
		HashCode hashString = FUNCTION.hashString(password+SALT, Charset.forName("UTF-8"));
		return hashString.toString();
	}
}
