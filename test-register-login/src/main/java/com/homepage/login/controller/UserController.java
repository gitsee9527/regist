package com.homepage.login.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.homepage.login.model.TUser;
import com.homepage.login.result.ResultMsg;
import com.homepage.login.service.UserService;
@Controller
public class UserController {
	@Autowired
	private UserService userService;
	//添加日志
	private Logger logger = LoggerFactory.getLogger(UserController.class);
	/**
	 * 用户注册
	 * @param account
	 * @param modelMap
	 * @return
	 */
	@RequestMapping(value = "accounts/register",method={RequestMethod.POST,RequestMethod.GET})
	public String accountRegister(TUser account,Model modelMap) {
		//如果用户是空则让用户去注册
		if(account ==null || account.getUsername() ==null) {
			return "/user/accounts/register";
		}
		//用户注册验证
		ResultMsg resultMsg = UserHelper.validate(account);
		logger.info("验证结果信息："+resultMsg.toString());
		if(resultMsg.isSuccess()&&userService.addAccount(account)) {
			//注册成功
			return "/user/accounts/registersuc";
		}else {
			//重定向让用户重新填写
			return "redirect:/accounts/register";
		}
	}
	/**
	 * 用户登录
	 * @param req
	 * @return
	 */
	@RequestMapping("accounts/logIn")
	public String logIn(HttpServletRequest req) {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		logger.info(username+password);
		if(username == null || password ==null) {
			return "/user/accounts/logIn";
		}
		TUser auth = userService.auth(username, password);
		//验证成功将user放到session里
		//验证失败重定向到登录页面
		if(auth==null) {
			return "redirect:/accounts/logIn";
		}else {
			//强制创建一个session
			HttpSession session = req.getSession(true);
			session.setAttribute("loginUser", auth);
			//主页
			return "/user/accounts/success";
		}
	}
}
