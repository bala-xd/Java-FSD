package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ILoginRepository;
import com.model.User;

@Service
public class UserService {
	@Autowired
	private ILoginRepository repo;

	public String createUser(User user) {
		if (user == null || user.getUserName().length() < 3 || user.getPassword().length() < 3) {
			System.out.println("invalid data");
			return null;
		} else {
			Double d=Math.random();
			String uid=user.getUserName().substring(0,2)+d.toString().substring(2,6);
			user.setUserId(uid);
			User ub = repo.save(user);
			System.out.println("user added");
			return ub.getUserId();
		}
	}
	
	public User validateUser(User u) {
		User user = repo.validateLogin(u.getUserName(), u.getPassword());
		return user;
	}
	
	public User updateLoginStatus(User u) {
		if (u.getLoginStatus()==0) u.setLoginStatus(1);
		else u.setLoginStatus(0);
		User user = repo.save(u);
        return user;
    }

}
