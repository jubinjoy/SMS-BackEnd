package com.sms.cntr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.sms.entity.User;
import com.sms.serv.UserService;
import com.sms.utility.MailConstructor;

public class HomeController {
	
	
	@Autowired
	private MailConstructor mailConstructor;

	@Autowired
	private UserService userService;
	
	
	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/login")
	public String login(Model model) {
		model.addAttribute("classActiveLogin", true);
		return "myAccount";
	}

	@PostMapping("/forgetPassword")
	public String forgetPassword(@PathVariable String email) {

	
		//User user = userService.findByEmail(email);
		
		//if (user == null) {
			
			//return "email not exist";
		//}
		
		//String password = SecurityUtility.randomPassword();
		
		//String encryptedPassword = SecurityUtility.passwordEncoder().encode(password);
		//user.setPassword(encryptedPassword);
		
		//userService.save(user);
	
		String msg="email not sent ";
		//boolean status=mailConstructor.sendEmail("New Password","your new password is:"+encryptedPassword,email);
		//if(status!=false)
			//msg="send succesfully";
		
		return msg;

	}
	
	
}
