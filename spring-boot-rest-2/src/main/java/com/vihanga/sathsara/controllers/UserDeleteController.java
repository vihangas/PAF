package com.vihanga.sathsara.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vihanga.sathsara.beans.*;

@Controller
public class UserDeleteController {
	@RequestMapping(method = RequestMethod.DELETE, value="/delete/user/{regdNum}")
	
	@ResponseBody
	public String deleteUserRecord(@PathVariable("regdNum")String regdNum) {
		System.out.println("In deleteUserRecord");
		return UserRegistration.getInstance().deleteUser(regdNum);
	}
}
