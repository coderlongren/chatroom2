package cn.coderlongren.service;

import cn.coderlongren.dao.UserDao;
import cn.coderlongren.dao.UserDaoImple;
import cn.coderlongren.vo.User;

public class UserService {

	public User login(User user) {
		UserDao dao = new UserDaoImple();
		return dao.login(user);
	}
	
	
}
