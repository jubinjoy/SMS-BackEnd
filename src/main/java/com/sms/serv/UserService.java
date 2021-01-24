package com.sms.serv;


import java.util.Set;

import com.sms.entity.User;

public interface UserService {
		
	public Iterable<User> findAll();
	
	public User findByEmail(String email);
	
	public User save(User user);
	
	public void deleteByEmail(String email);
	
	public Iterable<User> findByDeptAndRole(int dept_id , int role_id);
	

}
