package com.ibs.controller.login;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ibs.bean.login.LoginBean;


@Controller

public class LoginController {

	
	@RequestMapping(value="/loadLogin", method=RequestMethod.GET)
	public ModelAndView loadLoginPage() {
		return new ModelAndView("login", "command", new LoginBean());
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@ModelAttribute("LoginBean")LoginBean LoginBean,ModelMap modelMap){
		
		return "home";
	}

}
