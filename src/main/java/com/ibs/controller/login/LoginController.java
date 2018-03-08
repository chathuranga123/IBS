package com.ibs.controller.login;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ibs.form.Contact;

@Controller
@Scope("request")
public class LoginController {

	
	@RequestMapping("/login")
	public ModelAndView login() {
		return new ModelAndView("home");
	}

}
