# regist
1、本项目使用SpringBoot+MyBatis+Freemarker框架，数据库使用Mysql
2、项目包含注册和登录两个业务
3、注册业务逻辑：
  1>注册页面地址：http://localhost:8080/accounts/register
  2>输入账号、密码、邮箱、昵称、真实姓名，注册账号。
  3>对输入信息进行后台校验
  4>对密码进行MD5加盐加密
  5>将数据存入数据库
  6>注册成功展示成功页面，不成功重定向到注册页面
4、登录业务逻辑
  1>登录页面地址：http://localhost:8080/accounts/logIn
  2>输入账号密码登录
  3>后台拿到账号密码后去数据库查询校验，校验通过将数据传入session域中并展示登录成功页面，不成功则展示失败页面
5、数据库建表语句：
CREATE TABLE `t_user` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '用户名',
  `password` VARCHAR(64) DEFAULT NULL COMMENT '密码',
  `email` VARCHAR(255) DEFAULT NULL COMMENT '电子邮箱',
  `nickname` VARCHAR(50) DEFAULT NULL COMMENT '昵称',
  `realname` VARCHAR(50) DEFAULT NULL COMMENT '真实姓名',
  `phone` VARCHAR(20) DEFAULT NULL COMMENT '手机号',
  `idcard` VARCHAR(20) DEFAULT NULL COMMENT '身份证号',
  `register_time` VARCHAR(50) DEFAULT NULL COMMENT '注册时间',
  `register_ip` VARCHAR(50) DEFAULT NULL COMMENT '注册ip',
  `last_login_time` VARCHAR(50) DEFAULT NULL COMMENT '最后登录时间',
  `last_login_ip` VARCHAR(50) DEFAULT NULL COMMENT '最后登录ip',
  `sex` VARCHAR(10) DEFAULT NULL COMMENT '性别',
  `birthday` VARCHAR(20) DEFAULT NULL COMMENT '出生日期',
  `province` VARCHAR(50) DEFAULT NULL COMMENT '省',
  `city` VARCHAR(50) DEFAULT NULL COMMENT '城市',
  `level` INT(11) DEFAULT NULL COMMENT '用户级别',
  `login_count` INT(11) DEFAULT NULL COMMENT '登录次数',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

6、另外还有一些功能没有实现，比如登录验证码；邮箱验证；注册表单其他字段未展示；注册时间、注册ip、登录/退出时间等未来得及实现让项目更完整