package com.ibs.controller.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ibs.bean.login.LoginBean;
import com.ibs.bean.user.User;
import com.ibs.service.user.UserService;



@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/loadLogin", method=RequestMethod.GET)
	public ModelAndView loadLoginPage() {
		return new ModelAndView("login", "command", new LoginBean());
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@ModelAttribute("LoginBean")LoginBean LoginBean,ModelMap modelMap){
		
		User user=new User();
		user.setUserName(LoginBean.getUserName());
		user.setPassword(LoginBean.getPassword());
		userService.addUser(user);
		return "home";
	}

}
